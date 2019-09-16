-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cinema
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `filmschedule`
--

DROP TABLE IF EXISTS `filmschedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filmschedule` (
  `idfilmschedule` int(11) NOT NULL AUTO_INCREMENT,
  `filmdatetime` datetime NOT NULL,
  `cinema` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `filmid` int(11) NOT NULL,
  PRIMARY KEY (`idfilmschedule`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filmschedule`
--

LOCK TABLES `filmschedule` WRITE;
/*!40000 ALTER TABLE `filmschedule` DISABLE KEYS */;
INSERT INTO `filmschedule` VALUES (1,'2019-09-16 10:00:00','Dostyk Plaza','Almaty',1),(2,'2019-09-16 13:30:00','Dostyk Plaza','Almaty',1),(3,'2019-09-16 15:40:00','Dostyk Plaza','Almaty',1),(4,'2019-09-16 14:30:00','Dostyk Plaza','Almaty',2),(5,'2019-09-16 16:30:00','Keruen','Astana',3),(6,'2019-09-16 16:00:00','Dostyk Plaza','Almaty',2),(7,'2019-09-16 18:30:00','Keruen','Astana',3),(8,'2019-09-16 13:00:00','Dostyk Plaza','Almaty',4),(9,'2019-09-16 18:00:00','Dostyk Plaza','Almaty',5),(10,'2019-09-16 11:30:00','Nomad Cinema','Almaty',2),(11,'2019-09-16 20:50:00','Keruen','Astana',3),(12,'2019-09-16 13:40:00','Nomad Cinema','Almaty',2),(13,'2019-09-16 16:30:00','Nomad Cinema','Almaty',2),(14,'2019-09-16 18:40:00','Nomad Cinema','Almaty',5),(15,'2019-09-16 13:50:00','Esentai Imax','Almaty',2),(16,'2019-09-16 10:00:00','Chaplin Khan Shatyr','Astana',5),(17,'2019-09-15 15:25:00','Esentai Imax','Almaty',2),(18,'2019-09-16 12:00:00','Chaplin Khan Shatyr','Astana',5),(19,'2019-09-16 18:40:00','Esentai Imax','Almaty',2),(20,'2019-09-16 15:45:00','Chaplin Khan Shatyr','Astana',5),(21,'2019-09-16 20:20:00','Esentai Imax','Almaty',2),(22,'2019-09-16 18:50:00','Silk Way Cinema','Almaty',4),(23,'2019-09-16 19:00:00','Chaplin Khan Shatyr','Astana',5);
/*!40000 ALTER TABLE `filmschedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-16 20:33:03
