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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 19:13:01
