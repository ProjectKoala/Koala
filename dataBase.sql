CREATE DATABASE  IF NOT EXISTS `projectkoala` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `projectkoala`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: projectkoala
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `FullName` varchar(50) DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `PassWord` varchar(50) DEFAULT NULL,
  `Emai` varchar(50) DEFAULT NULL,
  `PhoneNumber` char(20) DEFAULT NULL,
  `IsActive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_Accounts_Faculties1_idx` (`Faculties_Id`),
  CONSTRAINT `fk_Accounts_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,1,'Nguyễn Thị Xuân','XuanNT','123456','xuan@gmail.com','+(84)169.825.3452',1),(2,2,'Lã Minh Nguyệt','NguyenLM','123456','nguyet@gmail.com','+(84)169.825.3453',1),(3,3,'Trần Thị Thu Thủy','ThuyTTT','123456','thuy@gmail.com','+(84)169.825.3454',0),(4,4,'Văn Thị Hải Yến','YenVTH','123456','yen@gmail.com','+(84)169.825.3455',1),(5,1,'admin','admin','admi','admin','adimn',1);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classes` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Semesters` int(11) NOT NULL,
  `Levels_Id` int(11) NOT NULL,
  `Year` year(4) DEFAULT NULL,
  `NameClass` varchar(45) DEFAULT NULL,
  `TeacherClass` varchar(45) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `MaxNumber` int(11) DEFAULT NULL,
  `IsActive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_Classes_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_Classes_Semesters1_idx` (`Semesters`),
  KEY `fk_Classes_Levels1_idx` (`Levels_Id`),
  CONSTRAINT `fk_Classes_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Classes_Levels1` FOREIGN KEY (`Levels_Id`) REFERENCES `levels` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Classes_Semesters1` FOREIGN KEY (`Semesters`) REFERENCES `semesters` (`SemesterNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES (1,1,1,1,2013,'SUNSHINE_1','Lã Thị Minh','2013-03-08','2013-03-08',NULL,50,1),(2,1,1,1,2013,'SUNSHINE_2','Hoàng Thị Ngọc Lan','2013-03-08','2013-03-08',NULL,50,1),(3,1,1,1,2013,'SUNSHINE_3','Bùi Thị Lan Anh','2013-03-08','2013-03-08',NULL,50,0),(4,1,1,2,2013,'BEEHIVE_1','Trần Thị Hà','2013-03-08','2013-03-08',NULL,50,1),(5,1,1,2,2013,'BEEHIVE_2','Nguyễn Ngọc Anh','2013-03-08','2013-03-08',NULL,50,1),(6,1,1,2,2013,'BEEHIVE_3','Phan Kim Liên','2013-03-08','2013-03-08',NULL,50,0),(7,1,1,3,2013,'CHRYSALIS_1','Nguyễn Thị Thảo','2013-03-08','2013-03-08',NULL,50,1),(8,1,1,3,2013,'CHRYSALIS_2','Doãn Thị Trang','2013-03-08','2013-03-08',NULL,50,1),(9,1,1,4,2013,'KINDERGARTEN_1','Nguyễn Thị Diệu Linh','2013-03-08','2013-03-08',NULL,50,1),(10,1,1,4,2013,'KINDERGARTEN_2','Lã Thị Thu Thảo','2013-03-08','2013-03-08',NULL,50,1);
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classes_has_students`
--

DROP TABLE IF EXISTS `classes_has_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classes_has_students` (
  `Classes_Id` int(11) NOT NULL,
  `Students_Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `StartDate` date DEFAULT NULL,
  `IsStart` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Classes_Id`,`Students_Id`,`Faculties_Id`),
  KEY `fk_Classes_has_Students_Students1_idx` (`Students_Id`),
  KEY `fk_Classes_has_Students_Classes1_idx` (`Classes_Id`),
  KEY `fk_Classes_has_Students_Faculties1_idx` (`Faculties_Id`),
  CONSTRAINT `fk_Classes_has_Students_Classes1` FOREIGN KEY (`Classes_Id`) REFERENCES `classes` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Classes_has_Students_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Classes_has_Students_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes_has_students`
--

LOCK TABLES `classes_has_students` WRITE;
/*!40000 ALTER TABLE `classes_has_students` DISABLE KEYS */;
INSERT INTO `classes_has_students` VALUES (1,1,1,'2013-03-08',1),(1,2,1,'2013-03-08',0),(1,3,1,'2013-03-08',1),(1,4,1,'2013-03-08',1),(1,5,1,'2013-03-08',0),(2,6,1,'2013-03-08',1),(2,7,1,'2013-03-08',1),(2,8,1,'2013-03-08',1),(2,9,1,'2013-03-08',0),(2,10,1,'2013-03-08',1),(3,11,1,'2013-03-08',1),(3,12,1,'2013-03-08',1),(3,13,1,'2013-03-08',1),(3,14,1,'2013-03-08',1),(3,15,1,'2013-03-08',1),(4,16,1,'2013-03-08',1),(4,17,1,'2013-03-08',1),(4,18,1,'2013-03-08',1),(4,19,1,'2013-03-08',1),(4,20,1,'2013-03-08',1),(5,21,1,'2013-03-08',0),(5,22,1,'2013-03-08',1),(5,23,1,'2013-03-08',1),(5,24,1,'2013-03-08',1),(5,25,1,'2013-03-08',1),(6,26,1,'2013-03-08',1),(6,27,1,'2013-03-08',1),(6,28,1,'2013-03-08',0),(6,29,1,'2013-03-08',1),(6,30,1,'2013-03-08',1),(7,31,1,'2013-03-08',1),(7,32,1,'2013-03-08',0),(7,33,1,'2013-03-08',1),(7,34,1,'2013-03-08',1),(7,35,1,'2013-03-08',1),(8,36,1,'2013-03-08',1),(8,37,1,'2013-03-08',1),(8,38,1,'2013-03-08',1),(8,39,1,'2013-03-08',1),(8,40,1,'2013-03-08',1),(9,41,1,'2013-03-08',1),(9,42,1,'2013-03-08',1),(9,43,1,'2013-03-08',1),(9,44,1,'2013-03-08',1),(9,45,1,'2013-03-08',1),(10,46,1,'2013-03-08',0),(10,47,1,'2013-03-08',1),(10,48,1,'2013-03-08',1),(10,49,1,'2013-03-08',0),(10,50,1,'2013-03-08',1);
/*!40000 ALTER TABLE `classes_has_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cost`
--

DROP TABLE IF EXISTS `cost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cost` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Semesters` int(11) NOT NULL,
  `NameCost` varchar(45) NOT NULL,
  `NumberDays` int(11) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `year` year(4) NOT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`,`Semesters`),
  KEY `fk_Cost_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_Cost_Semesters1_idx` (`Semesters`),
  CONSTRAINT `fk_Cost_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cost_Semesters` FOREIGN KEY (`Semesters`) REFERENCES `semesters` (`SemesterNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cost`
--

LOCK TABLES `cost` WRITE;
/*!40000 ALTER TABLE `cost` DISABLE KEYS */;
INSERT INTO `cost` VALUES (1,1,1,'Học Phí',0,24000000,2013),(2,1,1,'Xe Bus',0,500000,2013),(3,1,2,'Học Phí',0,24000000,2013),(4,2,1,'Học Phí',0,24000000,2013),(5,2,1,'Học Phí',0,3000000,2013),(6,3,2,'Học Phí',0,24000000,2013),(7,3,2,'Xe Bus',0,500000,2013),(8,4,4,'Học Phí',0,24000000,2013),(9,4,4,'Tham Quan',0,500000,2013),(10,1,1,'Phí Đặt Cọc',0,-5000000,2013),(11,1,1,'Học Múa',10,1000000,2013),(12,1,1,'Học Đàn',0,5000000,2013);
/*!40000 ALTER TABLE `cost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculties`
--

DROP TABLE IF EXISTS `faculties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculties` (
  `Id` int(11) NOT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `PhoneNumbers` char(20) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `UpdateDate` date DEFAULT NULL,
  `CreateDate` date DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculties`
--

LOCK TABLES `faculties` WRITE;
/*!40000 ALTER TABLE `faculties` DISABLE KEYS */;
INSERT INTO `faculties` VALUES (1,'340 Bà Triệu','+(84.4) 3772.3060','BaTrieu@gmail.com','2013-03-08','2013-03-08','Koala House BÃ  Triá»‡u'),(2,'261 Hoàng Ngân','+(84.4) 3772.3060','HoangNgan@gmail.com','2013-03-08','2013-03-08','Koala House Hoàng Ngân'),(3,'5 Phan Kế Bình','+(84.4) 3974.7617','PhanKeBinh@gmail.com','2013-03-08','2013-03-08','Koala House Phan Kế Bình'),(4,'3 Nguyễn Huy Tưởng','+ (84.4) 3972.8913','NguyenHuyTu@gmail.com','2013-03-08','2013-03-08','Koala House Nguyễn Huy Tưởng');
/*!40000 ALTER TABLE `faculties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lateday`
--

DROP TABLE IF EXISTS `lateday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lateday` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Students_Id` int(11) NOT NULL,
  `LateDate` date DEFAULT NULL,
  `Semester_Id` int(11) DEFAULT NULL,
  `Year` year(4) DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_LateDay_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_LateDay_Students1_idx` (`Students_Id`),
  KEY `Semester_idx` (`Semester_Id`),
  CONSTRAINT `fk_LateDay_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_LateDay_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lateday`
--

LOCK TABLES `lateday` WRITE;
/*!40000 ALTER TABLE `lateday` DISABLE KEYS */;
INSERT INTO `lateday` VALUES (1,1,1,'2013-03-08',1,2013),(2,1,1,'2013-03-09',1,2013),(3,1,1,'2013-03-10',1,2013),(4,1,2,'2013-03-08',1,2013),(5,1,2,'2013-03-09',1,2013);
/*!40000 ALTER TABLE `lateday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaves`
--

DROP TABLE IF EXISTS `leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leaves` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Students_Id` int(11) NOT NULL,
  `Semesters_Id` int(11) NOT NULL,
  `Year` year(4) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_Leaves_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_Leaves_Students1_idx` (`Students_Id`),
  KEY `fk_Leaves_Semesters1_idx` (`Semesters_Id`),
  KEY `Semester_idx` (`Year`),
  CONSTRAINT `fk_Leaves_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Leaves_Semesters1` FOREIGN KEY (`Semesters_Id`) REFERENCES `semesters` (`SemesterNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Leaves_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaves`
--

LOCK TABLES `leaves` WRITE;
/*!40000 ALTER TABLE `leaves` DISABLE KEYS */;
INSERT INTO `leaves` VALUES (1,1,1,1,2013,'2013-03-08','2013-04-01'),(2,1,1,1,2013,'2013-04-10','2013-04-20'),(3,1,2,1,2013,'2013-03-08','2013-03-15'),(4,1,3,1,2013,'2013-03-08','2013-03-15'),(5,1,4,1,2013,'2013-03-08','2013-03-15'),(6,1,7,1,2013,'2013-03-08','2013-03-15');
/*!40000 ALTER TABLE `leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `levels`
--

DROP TABLE IF EXISTS `levels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `levels` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `levels`
--

LOCK TABLES `levels` WRITE;
/*!40000 ALTER TABLE `levels` DISABLE KEYS */;
INSERT INTO `levels` VALUES (1,'NẮNG MAI (SUNSHINE)'),(2,'TỔ ONG (BEEHIVE)'),(3,'TỔ KIẾN (CHRYSALIS)'),(4,'MẪU GIÁO (KINDERGARTEN)');
/*!40000 ALTER TABLE `levels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipts`
--

DROP TABLE IF EXISTS `receipts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receipts` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Accounts_Id` int(11) NOT NULL,
  `Students_Id` int(11) NOT NULL,
  `No` int(11) DEFAULT NULL,
  `NamePayer` varchar(45) DEFAULT NULL,
  `NameCasher` varchar(45) DEFAULT NULL,
  `Number` double DEFAULT NULL,
  `InWords` varchar(50) DEFAULT NULL,
  `IsReturn` tinyint(1) DEFAULT NULL,
  `CreateDate` date DEFAULT NULL,
  `IsTransfer` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_Receipts_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_Receipts_Accounts1_idx` (`Accounts_Id`),
  KEY `fk_Receipts_Students1_idx` (`Students_Id`),
  CONSTRAINT `fk_Receipts_Accounts1` FOREIGN KEY (`Accounts_Id`) REFERENCES `accounts` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Receipts_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Receipts_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipts`
--

LOCK TABLES `receipts` WRITE;
/*!40000 ALTER TABLE `receipts` DISABLE KEYS */;
/*!40000 ALTER TABLE `receipts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reducefees`
--

DROP TABLE IF EXISTS `reducefees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reducefees` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Students_Id` int(11) NOT NULL,
  `Semesters_Id` int(11) NOT NULL,
  `Percent` float DEFAULT NULL,
  `Reason` varchar(500) DEFAULT NULL,
  `Year` year(4) DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_ReduceFees_Faculties1_idx` (`Faculties_Id`),
  KEY `fk_ReduceFees_Students1_idx` (`Students_Id`),
  KEY `fk_ReduceFees_Semesters1_idx` (`Semesters_Id`),
  CONSTRAINT `fk_ReduceFees_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ReduceFees_Semesters1` FOREIGN KEY (`Semesters_Id`) REFERENCES `semesters` (`SemesterNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ReduceFees_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reducefees`
--

LOCK TABLES `reducefees` WRITE;
/*!40000 ALTER TABLE `reducefees` DISABLE KEYS */;
/*!40000 ALTER TABLE `reducefees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semesters`
--

DROP TABLE IF EXISTS `semesters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `semesters` (
  `SemesterNumber` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `Year` year(4) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  `IsActivity` int(11) DEFAULT NULL,
  PRIMARY KEY (`SemesterNumber`,`Faculties_Id`),
  KEY `fk_Semesters_Faculties1_idx` (`Faculties_Id`),
  CONSTRAINT `fk_Semesters_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semesters`
--

LOCK TABLES `semesters` WRITE;
/*!40000 ALTER TABLE `semesters` DISABLE KEYS */;
INSERT INTO `semesters` VALUES (1,1,2013,'2013-03-08','2013-03-08',NULL),(1,2,2013,'2013-03-08','2013-03-08',NULL),(1,3,2013,'2013-03-08','2013-03-08',NULL),(1,4,2013,'2013-03-08','2013-03-08',NULL),(2,1,2013,'2013-03-08','2013-03-08',NULL),(2,2,2013,'2013-03-08','2013-03-08',NULL),(2,3,2013,'2013-03-08','2013-03-08',NULL),(2,4,2013,'2013-03-08','2013-03-08',NULL),(3,1,2013,'2013-03-08','2013-03-08',NULL),(3,2,2013,'2013-03-08','2013-03-08',NULL),(3,3,2013,'2013-03-08','2013-03-08',NULL),(3,4,2013,'2013-03-08','2013-03-08',NULL),(4,1,2013,'2013-03-08','2013-03-08',NULL),(4,2,2013,'2013-03-08','2013-03-08',NULL),(4,3,2013,'2013-03-08','2013-03-08',NULL),(4,4,2013,'2013-03-08','2013-03-08',NULL);
/*!40000 ALTER TABLE `semesters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `FullName` varchar(50) DEFAULT NULL,
  `BrithDay` date DEFAULT NULL,
  `PhoneNumber` char(16) DEFAULT NULL,
  `Representative` varchar(45) DEFAULT NULL,
  `IsClient` tinyint(1) DEFAULT NULL,
  `CreateDate` date DEFAULT NULL,
  `Debt` float DEFAULT NULL,
  PRIMARY KEY (`Id`,`Faculties_Id`),
  KEY `fk_Students_Faculties1_idx` (`Faculties_Id`),
  CONSTRAINT `fk_Students_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,1,'Nguyễn Hải Anh','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',200000),(2,1,'Nguyễn Ngọc Anh','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',0),(3,1,'Bùi Thiện Thắng','2013-03-08','0169.437.9201','Bùi Thiện Minh',0,'2013-03-08',0),(4,1,'Trần Văn Việt','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(5,1,'Văn Minh Tăng','2013-03-08','0169.437.9201','Nguyễn Văn Minh',1,'2013-03-08',NULL),(6,1,'Lê Xuân Hằng','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(7,1,'Lại Văn Dầu','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(8,1,'Phạm Tùng Linh','2013-03-08','0169.437.9201','Nguyễn Văn Minh',1,'2013-03-08',NULL),(9,1,'Lưu Xuân Hằng','2013-03-08','0169.437.9201','Đỗ Hoài Nam',1,'2013-03-08',NULL),(10,1,'Lã Văn Nam','2013-03-08','0169.437.9201','Phạm Thái Hòa',1,'2013-03-08',NULL),(11,1,'Lã Thị Oanh','2013-03-08','0169.437.9201','Phạm Thái Hòa',1,'2013-03-08',NULL),(12,1,'Phạm Thái Bạch','2013-03-08','0169.437.9201','Đỗ Hoài Nam',1,'2013-03-08',NULL),(13,1,'Ngô Xuân Long','2013-03-08','0169.437.9201','Ngô Xuân Tháp',1,'2013-03-08',NULL),(14,1,'Phạm Thanh Khuê','2013-03-08','0169.437.9201','Phạm Thái Hòa',1,'2013-03-08',NULL),(15,1,'Bùi Sĩ Quang','2013-03-08','0169.437.9201','Đỗ Hoài Nam',1,'2013-03-08',NULL),(16,1,'Trần Văn Sĩ','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(17,1,'Luyện Thị Xuân','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(18,1,'Ngô Văn Hòa','2013-03-08','0169.437.9201','Đỗ Hoài Nam',1,'2013-03-08',NULL),(19,1,'Trần Sỹ Quyết','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',0,'2013-03-08',NULL),(20,1,'Nghiêm Đình Mừng','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(21,1,'Nguyễn Khắc Quý','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(22,1,'Trần Thái Lan','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(23,1,'Phùng Văn Hưng','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(24,1,'Lại Cao Thắng','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(25,1,'Lê Công Vinh','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(26,1,'Tạ Bá Trung','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(27,1,'Nguyễn Văn Bách','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',0,'2013-03-08',NULL),(28,1,'Nguyễn Thị Yến','2013-03-08','0169.437.9201','Bùi Thiện Minh',0,'2013-03-08',NULL),(29,1,'Hoàng Ngọc Minh','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',NULL),(30,1,'Phạm Văn Bách','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(31,1,'Trần Quốc Việt','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(32,1,'Bùi Thị Lan Anh ','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(33,1,'Phạm Thế Thái','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(34,1,'Bùi Quốc Dũng','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(35,1,'Hoàng Văn Anh','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',NULL),(36,1,'Trần Hải Nam','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(37,1,'Nguyễn Minh Hà','2013-03-08','0169.437.9201','Bùi Thiện Minh',0,'2013-03-08',NULL),(38,1,'Bùi Doãn Hùng','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(39,1,'Lê Trung Kiên','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',NULL),(40,1,'Nguyễn Văn Sĩ','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(41,1,'Lê Thị Minh Nguyệt','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(42,1,'Phạm Thị Huyền','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(43,1,'Bùi Thị Ngọc Lan','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL),(44,1,'Đỗ Văn Lãm','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',NULL),(45,1,'Nguyễn Văn Cường','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(46,1,'Nguyễn Đức Sơn','2013-03-08','0169.437.9201','Lại Văn Nghĩa',1,'2013-03-08',NULL),(47,1,'Hoàng Thị Diệu Linh','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',0,'2013-03-08',NULL),(48,1,'Nguyễn Thị Quyên','2013-03-08','0169.437.9201','Bùi Thiện Minh',1,'2013-03-08',NULL),(49,1,'Nguyễn Thái Hà','2013-03-08','0169.437.9201','Nguyễn Hoài Nam',1,'2013-03-08',NULL),(50,1,'Phùng Ngọc Minh','2013-03-08','0169.437.9201','Nguyễn Ngọc Lan',1,'2013-03-08',NULL);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students_has_cost`
--

DROP TABLE IF EXISTS `students_has_cost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students_has_cost` (
  `Students_Id` int(11) NOT NULL,
  `Cost_Id` int(11) NOT NULL,
  `Faculties_Id` int(11) NOT NULL,
  `IsDebt` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Students_Id`,`Cost_Id`,`Faculties_Id`),
  KEY `fk_Students_has_Cost_Cost1_idx` (`Cost_Id`),
  KEY `fk_Students_has_Cost_Students1_idx` (`Students_Id`),
  KEY `fk_Students_has_Cost_Faculties1_idx` (`Faculties_Id`),
  CONSTRAINT `fk_Students_has_Cost_Cost1` FOREIGN KEY (`Cost_Id`) REFERENCES `cost` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Students_has_Cost_Faculties1` FOREIGN KEY (`Faculties_Id`) REFERENCES `faculties` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Students_has_Cost_Students1` FOREIGN KEY (`Students_Id`) REFERENCES `students` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students_has_cost`
--

LOCK TABLES `students_has_cost` WRITE;
/*!40000 ALTER TABLE `students_has_cost` DISABLE KEYS */;
INSERT INTO `students_has_cost` VALUES (1,1,1,1),(1,2,1,1),(1,10,1,0),(2,1,1,1),(2,10,1,0),(3,1,1,1),(3,10,1,1),(4,1,1,0),(4,10,1,1),(5,1,1,1),(6,1,1,1),(7,1,1,1),(8,1,1,0),(9,1,1,1),(10,1,1,1),(10,10,1,0),(11,1,1,1),(11,10,1,1),(12,1,1,1),(12,10,1,1),(12,11,1,1),(13,1,1,1),(14,1,1,1),(15,1,1,0),(16,1,1,1),(17,1,1,1),(18,1,1,0),(18,10,1,1),(19,1,1,1),(20,1,1,0),(21,1,1,1),(22,1,1,0),(23,1,1,1),(24,1,1,1),(25,1,1,1),(26,1,1,1),(27,1,1,0),(28,1,1,1),(29,1,1,0),(30,1,1,1);
/*!40000 ALTER TABLE `students_has_cost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projectkoala'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-13  9:08:45
