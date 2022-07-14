-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: datosyredes
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `images` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_Producto` varchar(100) DEFAULT NULL,
  `imageProduct` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES (1,'0x12b3f41336c00000','2021-05-21T02-36-28.368Zchaqueta1.png'),(2,'0x12b7af8e5f800000','2021-05-23T22-46-50.151Zxiaomi redmi note 8 pro.png'),(3,'0x12bb57c42b800000','2021-05-23T22-52-24.888Zzapatillas.jpg'),(4,'0x12bb590af0c00000','2021-05-23T22-54-49.175Zxbox series x.png'),(5,'0x12bb5997da400000','2021-05-23T23-00-27.031Zlavadora.png'),(6,'0x12bb5ae1c9400000','2021-06-27T01-59-29.156ZPS4-CONTROLLER.png'),(7,'0x14b553f0fec00000','2022-06-20T23-01-32.733ZIMG_20220620_204317.jpg'),(8,'0x14b553f0fec00000','2022-06-20T23-01-32.764ZIMG_20220620_204317.jpg'),(10,'0x14ca28cab2800000','2022-07-07T03-21-06.970Zfelipepelaquim-6zO5VKogoZE-unsplash.jpg'),(11,'0x14ca294fd1400000','2022-07-07T03-23-22.615Zrock-zhou--6cScQvixFY-unsplash.jpg'),(12,'0x14ca2a914c800000','2022-07-07T03-28-52.790Zjeet-dhanoa-sR1BaDlRSKM-unsplash.jpg'),(13,'0x14ca2b0132800000','2022-07-07T03-30-47.392Zjeffrey-grospe-yDouV_MSzOQ-unsplash.jpg');
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` varchar(100) NOT NULL,
  `propietario` varchar(100) DEFAULT NULL,
  `nro_publicacion` int DEFAULT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `subcategoria` varchar(100) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `condicion` varchar(100) DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `precio` int DEFAULT NULL,
  `precioEnvio` int DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `comuna` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  FULLTEXT KEY `name_of_index` (`titulo`,`categoria`,`subcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES ('0x12b3f41336c00000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000000,'Chaqueta de invierno','Moda','Parkas y Chaquetas','Cahqueta para invierno gruesa','Nuevo',21,30000,0,'Coquimbo','Coquimbo'),('0x12b7af8e5f800000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000001,'Xiaomi redmi note 8 pro','Tecnologia','Celulares','Nada','Nuevo',20,120000,0,'Coquimbo','Coquimbo'),('0x12bb57c42b800000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000002,'Zapatillas','Moda','Calzado','Nada','Nuevo',20,40000,0,'Coquimbo','Coquimbo'),('0x12bb590af0c00000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000003,'Xbox series X','Tecnologia','Consolas','Nada','Nuevo',20,550000,0,'Coquimbo','Coquimbo'),('0x12bb5997da400000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000004,'Lavadora Samsung','Electro','Lavadoras','Nada','Nuevo',20,430000,0,'Coquimbo','Coquimbo'),('0x12bb5ae1c9400000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',10000005,'Conrtrol PS4','Tecnologia','Consolas','Nada','Nuevo',20,59000,0,'Coquimbo','Coquimbo'),('0x14b553f0fec00000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',38852043,'Poco X3 Pro','Agro','Insumos Agrícolas','qweqwe','Nuevo',10,200000,3500,'Coquimbo','Coquimbo'),('0x14ca28cab2800000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',82129007,'Zapatillas new balance verdes','Vestuario y Calzado','Calzado','.','Nuevo',20,56000,0,'Coquimbo','Coquimbo'),('0x14ca294fd1400000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',67756652,'Guitarra acustica ','Instrumentos Musicales','Instrumentos de Cuerda','es una buena guitarra','Nuevo',2,150000,3500,'Coquimbo','Coquimbo'),('0x14ca2a914c800000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',50196132,'Figura de anime - Goku ','Juegos y Juguetes','Hobbies','KAKAROTOOOO!!!!!!','Nuevo',1,200000,3500,'Coquimbo','Coquimbo'),('0x14ca2b0132800000','bef6ea08-0956-4d35-8d5b-9c9d7d11b561',98106952,'Teclado mecanico custom','Computación','Accesorios para PC Gaming','es un tecladazo amigo!!','Nuevo',15,150000,3500,'Coquimbo','Coquimbo');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopping_cart`
--

DROP TABLE IF EXISTS `shopping_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shopping_cart` (
  `id` varchar(200) NOT NULL,
  `userId` varchar(200) DEFAULT NULL,
  `product` varchar(200) DEFAULT NULL,
  `cantidadComprada` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopping_cart`
--

LOCK TABLES `shopping_cart` WRITE;
/*!40000 ALTER TABLE `shopping_cart` DISABLE KEYS */;
INSERT INTO `shopping_cart` VALUES ('058b9249-2790-4349-85d8-587016911ddb','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x12b3f41336c00000',1),('08bd95a1-5b12-4438-b84b-6efd72f66a42','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x12b7af8e5f800000',1),('1e2ac1e3-d5df-4960-b2ea-0843c3ddcf53','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x14ca2a914c800000',1),('8e897f18-4707-41f4-84f1-2b9a113d918d','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x14ca294fd1400000',1),('a781a655-b461-4f85-8e6c-8256eaef59d6','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x14ca28cab2800000',1),('a9002151-ba69-4e49-85be-cd1e191f0ac3','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x14ca2b0132800000',1),('e8a9f437-a966-4cd3-b062-ef3e7730e2d0','bef6ea08-0956-4d35-8d5b-9c9d7d11b561','0x14b553f0fec00000',1),('f869a9c4-792d-46ad-9562-090cc1116f2b','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x12bb57c42b800000',1),('f92e6e6a-78f6-4a98-81ad-58de0acd5b2f','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x12bb5ae1c9400000',1),('fc78f2dc-6dda-423c-a307-9d520ed7ecbb','d002bfcf-a699-40ff-bf11-e267ad18a10a','0x12bb5997da400000',1);
/*!40000 ALTER TABLE `shopping_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` varchar(200) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `imagen` varchar(100) DEFAULT NULL,
  `token` varchar(200) DEFAULT NULL,
  `rol` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `rut` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `comuna` varchar(100) DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `numero` varchar(100) DEFAULT NULL,
  `telefono` varchar(100) DEFAULT NULL,
  `articulos_vendidos` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('','',NULL,NULL,'','','','','','',NULL,NULL,NULL,NULL,NULL,NULL),('6d88e2f4-7186-481c-85cd-87872563fa50','pleasurerevised','2022-06-20T23-22-41.929Zcropped1348309589580994985.jpg',NULL,'usuario','pepe','perez','1-4','a@awa.com','$2a$15$d.Qe5mD9YWZHa0QZf6Zh1.GjBPdaK3IGAVUL.UO/vXN8pSRinJI6W',NULL,NULL,NULL,NULL,NULL,NULL),('bef6ea08-0956-4d35-8d5b-9c9d7d11b561','pepe','2022-06-20T23-00-46.781Zcropped2862279205285648970.jpg',NULL,'usuario','antony','rodriguez','2-0','antonyrodriguezc.2001@gmail.com','$2a$15$i7TqTn668fayI4GghWTepetYeZ5K5odQ4pvFHUpfhZnE3vmDYqDsS','','','','','',NULL),('c80f6a0c-914f-414c-a158-10e42840d991','pennantexplosive','2022-07-07T03-42-07.779Zcropped6403755804076715155.jpg',NULL,'usuario','Sebastian','Morgado','2-5','seba@gmail.com','$2a$15$FlJ5vkwnjU9WN7OQLovt1edz5/ohbm95OkqUpTojjwP7L.u/HzSe2',NULL,NULL,NULL,NULL,NULL,NULL),('d002bfcf-a699-40ff-bf11-e267ad18a10a','attendantglazed','2022-07-07T03-46-25.560Zcropped5019688930796968410.jpg','cewXdYOTS7mf-ubW7Pan9W:APA91bG4BLONRuHf8w60iWxyLaP0dyi_G_SQv9UzORbeqTDngHJFo47h7y636sXw7fy8pPYvvqcfbpSomH-VmKodjcTY4Ag71KeSNgkMQE6f_Jo4L4sPQy19EE8-feo-T7pYxQDLhAzl','usuario','Roberto','Contreras','2-6','rob@gmail.com','$2a$15$cLQ43eT9u2KSgdTedM.ouuSntce.eDlp7QbcKyRE9Ex4lEI5tvEQ2',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 19:35:50
