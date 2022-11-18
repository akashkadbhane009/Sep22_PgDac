-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: sqlex
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `j`
--

DROP TABLE IF EXISTS `j`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `j` (
  `j` char(2) NOT NULL,
  `jname` char(10) DEFAULT NULL,
  `city` char(15) DEFAULT NULL,
  PRIMARY KEY (`j`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `j`
--

LOCK TABLES `j` WRITE;
/*!40000 ALTER TABLE `j` DISABLE KEYS */;
/*!40000 ALTER TABLE `j` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `p`
--

DROP TABLE IF EXISTS `p`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `p` (
  `p` char(2) NOT NULL,
  `pname` char(10) DEFAULT NULL,
  `colour` char(10) DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `city` char(15) DEFAULT NULL,
  PRIMARY KEY (`p`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `p`
--

LOCK TABLES `p` WRITE;
/*!40000 ALTER TABLE `p` DISABLE KEYS */;
/*!40000 ALTER TABLE `p` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s`
--

DROP TABLE IF EXISTS `s`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `s` (
  `s` char(2) NOT NULL,
  `sname` char(10) DEFAULT NULL,
  `status` enum('A','NA') DEFAULT NULL,
  `city` char(15) DEFAULT NULL,
  PRIMARY KEY (`s`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s`
--

LOCK TABLES `s` WRITE;
/*!40000 ALTER TABLE `s` DISABLE KEYS */;
/*!40000 ALTER TABLE `s` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sdept`
--

DROP TABLE IF EXISTS `sdept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sdept` (
  `deptno` char(2) DEFAULT NULL,
  `deptname` char(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sdept`
--

LOCK TABLES `sdept` WRITE;
/*!40000 ALTER TABLE `sdept` DISABLE KEYS */;
INSERT INTO `sdept` VALUES ('10','developement'),('20','tranning');
/*!40000 ALTER TABLE `sdept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semp`
--

DROP TABLE IF EXISTS `semp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semp` (
  `empno` char(4) DEFAULT NULL,
  `empname` char(20) DEFAULT NULL,
  `basic` float DEFAULT NULL,
  `deptno` char(2) DEFAULT NULL,
  `depthhead` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semp`
--

LOCK TABLES `semp` WRITE;
/*!40000 ALTER TABLE `semp` DISABLE KEYS */;
INSERT INTO `semp` VALUES ('0001','sunil',6000,'10',NULL),('0002','hiren',8000,'20',NULL),('003','ali',4000,'10','0001'),('0004','george',6000,NULL,'0002');
/*!40000 ALTER TABLE `semp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-18 23:24:47
