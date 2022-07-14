package com.example.marketplaceproyect.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.marketplaceproyect.BuildConfig;
import com.example.marketplaceproyect.R;
import com.example.marketplaceproyect.controller.SharedPreferencesUser;
import com.example.marketplaceproyect.controller.comprarProducto;
import com.example.marketplaceproyect.modelos.Products;
import com.example.marketplaceproyect.modelos.goActivities;
import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.approve.Approval;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.config.SettingsConfig;
import com.paypal.checkout.createorder.CreateOrder;
import com.paypal.checkout.createorder.CreateOrderActions;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.OrderIntent;
import com.paypal.checkout.createorder.UserAction;
import com.paypal.checkout.order.Amount;
import com.paypal.checkout.order.AppContext;
import com.paypal.checkout.order.CaptureOrderResult;
import com.paypal.checkout.order.OnCaptureComplete;
import com.paypal.checkout.order.Order;
import com.paypal.checkout.order.PurchaseUnit;
import com.paypal.checkout.paymentbutton.PayPalButton;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class mediosDePagoActivity extends AppCompatActivity {

    public static final String YOUR_CLIENT_ID = "Af98CII7FBE7dGetJbci7fsTvSLhPbFYySOUw41tR49uOXXSyIE2bCRTL2R5TlaUaVAyfHFL6PGO0s80";
    private PayPalButton payPalButton;
    private Products producto;
    private int cantidadComprada;

    private SharedPreferencesUser shared;
    private goActivities goActivities;

    private DecimalFormatSymbols symbols;
    private DecimalFormat precioFormat;

    private TextView nombreProductoMediosPagos;
    private TextView precioProductoMediosPagos;
    private LinearLayout botonDebito;
    private TextView botonVolverMediosPagos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medios_pago);
        iniciarlizaVariables();
        paypal();

        botonDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new comprarProducto().comprar(cantidadComprada,producto);
                goActivities.goConfirmarCompra(shared.getUsername(),producto.getProductImage()[0]);
            }
        });

        botonVolverMediosPagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void iniciarlizaVariables() {
        shared = new SharedPreferencesUser(mediosDePagoActivity.this);
        goActivities = new goActivities(mediosDePagoActivity.this);

        payPalButton = findViewById(R.id.payPalButton);

        producto = (Products) getIntent().getExtras().getSerializable("producto");
        cantidadComprada = getIntent().getIntExtra("cantidadComprada",1);

        symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        precioFormat = new DecimalFormat("###,###.##", symbols);

        nombreProductoMediosPagos = findViewById(R.id.nombreProductoMediosPagos);
        precioProductoMediosPagos = findViewById(R.id.precioProductoMediosPagos);
        botonDebito = findViewById(R.id.botonDebito);
        botonVolverMediosPagos = findViewById(R.id.botonVolverMediosPagos);

        nombreProductoMediosPagos.setText(producto.getTitulo());
        precioProductoMediosPagos.setText("$ "+precioFormat.format((producto.getPrecio()*cantidadComprada)+producto.getPrecioEnvio()));


        CheckoutConfig config = new CheckoutConfig(
                getApplication(),
                YOUR_CLIENT_ID,
                Environment.SANDBOX,
                String.format("%s://paypalpay", BuildConfig.APPLICATION_ID),
                CurrencyCode.USD,
                UserAction.PAY_NOW,
                new SettingsConfig(
                        true,
                        false
                )
        );

        PayPalCheckout.setConfig(config);

    }

    private void paypal(){
        payPalButton.setup(
                new CreateOrder() {
                    @Override
                    public void create(@NotNull CreateOrderActions createOrderActions) {
                        ArrayList<PurchaseUnit> purchaseUnits = new ArrayList<>();
                        purchaseUnits.add(
                                new PurchaseUnit.Builder()
                                        .amount(
                                                new Amount.Builder()
                                                        .currencyCode(CurrencyCode.USD)
                                                        .value(precioFormat.format((producto.getPrecio()*cantidadComprada)+producto.getPrecioEnvio()))
                                                        .build()
                                        )
                                        .build()
                        );
                        Order order = new Order(
                                OrderIntent.CAPTURE,
                                new AppContext.Builder()
                                        .userAction(UserAction.PAY_NOW)
                                        .build(),
                                purchaseUnits
                        );
                        createOrderActions.create(order, (CreateOrderActions.OnOrderCreated) null);
                    }
                },
                new OnApprove() {
                    @Override
                    public void onApprove(@NotNull Approval approval) {
                        approval.getOrderActions().capture(new OnCaptureComplete() {
                            @Override
                            public void onCaptureComplete(@NotNull CaptureOrderResult result) {
                                Log.i("CaptureOrder", String.format("CaptureOrderResult: %s", result));
                                new comprarProducto().comprar(cantidadComprada,producto);
                                goActivities.goConfirmarCompra(shared.getUsername(),producto.getProductImage()[0]);
                            }
                        });
                    }
                }
        );
    }
}