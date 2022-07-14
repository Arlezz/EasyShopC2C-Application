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
INSERT INTO `usuarios` VALUES ('','',NULL,NULL,'','','','','','',NULL,NULL,NULL,NULL,NULL,NULL),('6d88e2f4-7186-481c-85cd-87872563fa50','pleasurerevised','2022-06-20T23-22-41.929Zcropped1348309589580994985.jpg',NULL,'usuario','pepe','perez','14680350-4','a@awa.com','$2a$15$d.Qe5mD9YWZHa0QZf6Zh1.GjBPdaK3IGAVUL.UO/vXN8pSRinJI6W',NULL,NULL,NULL,NULL,NULL,NULL),('bef6ea08-0956-4d35-8d5b-9c9d7d11b561','pepe','2022-06-20T23-00-46.781Zcropped2862279205285648970.jpg',NULL,'usuario','antony','rodriguez','20779149-0','antonyrodriguezc.2001@gmail.com','$2a$15$i7TqTn668fayI4GghWTepetYeZ5K5odQ4pvFHUpfhZnE3vmDYqDsS','Coquimbo','Coquimbo','psje nuevo diez','3397','958750718',NULL),('c80f6a0c-914f-414c-a158-10e42840d991','pennantexplosive','2022-07-07T03-42-07.779Zcropped6403755804076715155.jpg',NULL,'usuario','Sebastian','Morgado','20458068-5','seba@gmail.com','$2a$15$FlJ5vkwnjU9WN7OQLovt1edz5/ohbm95OkqUpTojjwP7L.u/HzSe2',NULL,NULL,NULL,NULL,NULL,NULL),('d002bfcf-a699-40ff-bf11-e267ad18a10a','attendantglazed','2022-07-07T03-46-25.560Zcropped5019688930796968410.jpg','cewXdYOTS7mf-ubW7Pan9W:APA91bG4BLONRuHf8w60iWxyLaP0dyi_G_SQv9UzORbeqTDngHJFo47h7y636sXw7fy8pPYvvqcfbpSomH-VmKodjcTY4Ag71KeSNgkMQE6f_Jo4L4sPQy19EE8-feo-T7pYxQDLhAzl','usuario','Roberto','Contreras','20600023-6','rob@gmail.com','$2a$15$cLQ43eT9u2KSgdTedM.ouuSntce.eDlp7QbcKyRE9Ex4lEI5tvEQ2',NULL,NULL,NULL,NULL,NULL,NULL);
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

-- Dump completed on 2022-07-14 19:13:01
