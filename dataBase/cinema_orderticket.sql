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
-- Table structure for table `orderticket`
--

DROP TABLE IF EXISTS `orderticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderticket` (
  `idorderticket` int(11) NOT NULL AUTO_INCREMENT,
  `telephonenumber` varchar(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `orderdate` datetime NOT NULL,
  `place` varchar(25) NOT NULL,
  `filmid` int(11) NOT NULL,
  `filmdate` datetime NOT NULL,
  PRIMARY KEY (`idorderticket`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderticket`
--

LOCK TABLES `orderticket` WRITE;
/*!40000 ALTER TABLE `orderticket` DISABLE KEYS */;
INSERT INTO `orderticket` VALUES (1,'87078170185','Sabit.issakhan@gmail.com','2019-09-15 18:26:48','ряд 6, место 7',2,'2019-09-15 18:26:48'),(2,'87078170185','Sabit.issakhan@gmail.com','2019-09-15 18:27:52','ряд 6, место 7',2,'2019-09-15 18:27:52'),(3,'87078170185','sabit.issakhan@gmail.com','2019-09-15 18:32:22','ряд 6, место 7',2,'2019-09-15 18:32:22'),(4,'87078170185','sabit.issakhan@gmail.com','2019-09-16 07:00:00','9/8',2,'2019-09-16 12:00:00'),(5,'87089529284','sabit.issakhan.job@gmail.com','2019-09-16 10:40:25','9/8',3,'2019-09-16 14:30:00'),(6,'87089529284','i.zhuldyz@gmail.com','2019-09-16 12:22:52','9/8',5,'2019-09-16 16:30:00'),(7,'87089529284','i.zhuldyz@gmail.com','2019-09-16 12:22:52','Ряд: 9, Место: 8',5,'2019-09-16 16:30:00'),(8,'87089529284','i.zhuldyz@gmail.com','2019-09-16 12:22:52','Ряд: 9, Место: 8',5,'2019-09-16 16:30:00');
/*!40000 ALTER TABLE `orderticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-16 20:33:04
