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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 19:34:57
