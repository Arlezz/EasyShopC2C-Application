

static void Main(){

    string FileToRead = @"D:\New folder\archivo.pl";
  
    IEnumerable<Clausula> resultadoAnalizador = File.ReadLines(FileToRead);

    BaseConocimiento dataBase = LlenarBaseConocimiento(resultadoAnalizador);

}

public class nada{
    BaseConocimiento LlenarBaseConocimiento(Clausula resultadoAnalizador){
        BaseConocimiento database = new BaseConocimiento();
        
        foreach(Clausula cl in resultadoAnalizador){
            if(resultadoAnalizador is Atomo atomo){
                database.atomo.Add(cl);
            }

            if(resultadoAnalizador is Hecho hecho){
                database.hecho.Add(cl);
            }

            if(resultadoAnalizador is Consulta consulta){
                database.consulta.Add(cl);
            }
        }
        
        return database;
    }
}

public class BaseConocimiento{
    var atomo = new List<Atomo>();
    var hecho = new List<Hecho>();
    var consulta = new List<Consulta>();
    
}


