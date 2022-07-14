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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 19:34:57
