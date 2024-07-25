CREATE DATABASE  IF NOT EXISTS `e_portal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `e_portal`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: e_portal
-- ------------------------------------------------------
-- Server version	8.0.38

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
-- Table structure for table `assets`
--

DROP TABLE IF EXISTS `assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `type` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `asset_status` varchar(45) NOT NULL,
  `purchase_date` datetime NOT NULL,
  `price` int NOT NULL,
  `status` tinyint NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assets`
--

LOCK TABLES `assets` WRITE;
/*!40000 ALTER TABLE `assets` DISABLE KEYS */;
INSERT INTO `assets` VALUES (1,'land','fiexed asset','islamabad','current asset','2024-03-23 00:00:00',23000,1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(2,'property 3','fiexed asset','rawlpinidi','current asset','2024-03-23 00:00:00',23000,1,'2024-03-23 00:00:00','2024-03-23 00:00:00');
/*!40000 ALTER TABLE `assets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardtenworker`
--

DROP TABLE IF EXISTS `cardtenworker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cardtenworker` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(250) NOT NULL,
  `title` int NOT NULL,
  `issue_date` datetime NOT NULL,
  `expiry_date` datetime NOT NULL,
  `approval` varchar(45) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardtenworker`
--

LOCK TABLES `cardtenworker` WRITE;
/*!40000 ALTER TABLE `cardtenworker` DISABLE KEYS */;
/*!40000 ALTER TABLE `cardtenworker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardtype`
--

DROP TABLE IF EXISTS `cardtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cardtype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `card_title` varchar(250) NOT NULL,
  `card_status` varchar(50) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `status` tinyint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardtype`
--

LOCK TABLES `cardtype` WRITE;
/*!40000 ALTER TABLE `cardtype` DISABLE KEYS */;
INSERT INTO `cardtype` VALUES (7,'sweaper','avtive','2024-03-23 00:00:00','2024-03-23 00:00:34',0),(8,'hanger','avtive','2024-03-23 00:00:00','2024-03-23 00:00:34',0),(9,'eater','avtive','2024-03-23 00:00:00','2024-03-23 00:00:34',0);
/*!40000 ALTER TABLE `cardtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cleaningservice`
--

DROP TABLE IF EXISTS `cleaningservice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cleaningservice` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type(monthly,1 time special)` varchar(50) NOT NULL,
  `requested_by` int NOT NULL,
  `cost` int NOT NULL,
  `service_status` varchar(50) NOT NULL,
  `status` tinyint NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `equested_by_idx` (`requested_by`),
  CONSTRAINT `equested_by` FOREIGN KEY (`requested_by`) REFERENCES `tenantcompany` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cleaningservice`
--

LOCK TABLES `cleaningservice` WRITE;
/*!40000 ALTER TABLE `cleaningservice` DISABLE KEYS */;
/*!40000 ALTER TABLE `cleaningservice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companysize`
--

DROP TABLE IF EXISTS `companysize`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `companysize` (
  `id` int NOT NULL,
  `name` varchar(250) NOT NULL,
  `status` tinyint NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companysize`
--

LOCK TABLES `companysize` WRITE;
/*!40000 ALTER TABLE `companysize` DISABLE KEYS */;
/*!40000 ALTER TABLE `companysize` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaints`
--

DROP TABLE IF EXISTS `complaints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complaints` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `type` varchar(250) NOT NULL,
  `issue_date` datetime NOT NULL,
  `complaint_status` varchar(50) NOT NULL,
  `status` tinyint NOT NULL,
  `assign_to` varchar(45) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaints`
--

LOCK TABLES `complaints` WRITE;
/*!40000 ALTER TABLE `complaints` DISABLE KEYS */;
/*!40000 ALTER TABLE `complaints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventrequest`
--

DROP TABLE IF EXISTS `eventrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventrequest` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(250) NOT NULL,
  `permit_decription` text NOT NULL,
  `requested_by` int NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `status` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `requested_by_idx` (`requested_by`),
  CONSTRAINT `requested_by` FOREIGN KEY (`requested_by`) REFERENCES `tenantcompany` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventrequest`
--

LOCK TABLES `eventrequest` WRITE;
/*!40000 ALTER TABLE `eventrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gatepass`
--

DROP TABLE IF EXISTS `gatepass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gatepass` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `issued_to` varchar(250) NOT NULL,
  `issued_by` int NOT NULL,
  `issued_date` datetime NOT NULL,
  `expiry` datetime NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gatepass`
--

LOCK TABLES `gatepass` WRITE;
/*!40000 ALTER TABLE `gatepass` DISABLE KEYS */;
/*!40000 ALTER TABLE `gatepass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `category` varchar(250) NOT NULL,
  `quantity` int NOT NULL,
  `price` int NOT NULL,
  `reorder_level` int NOT NULL,
  `supplier_id` int NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `status` tinyint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meetinglocation`
--

DROP TABLE IF EXISTS `meetinglocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetinglocation` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `status` tinyint NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetinglocation`
--

LOCK TABLES `meetinglocation` WRITE;
/*!40000 ALTER TABLE `meetinglocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetinglocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meetingroom`
--

DROP TABLE IF EXISTS `meetingroom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetingroom` (
  `id` int NOT NULL AUTO_INCREMENT,
  `location` int NOT NULL,
  `start_time` datetime NOT NULL,
  `duration` datetime NOT NULL,
  `description` text NOT NULL,
  `reserved_by` int NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `status` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `location_idx` (`location`),
  KEY `reserved_by_idx` (`reserved_by`),
  CONSTRAINT `location` FOREIGN KEY (`location`) REFERENCES `meetinglocation` (`id`),
  CONSTRAINT `reserved_by` FOREIGN KEY (`reserved_by`) REFERENCES `tenantcompany` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetingroom`
--

LOCK TABLES `meetingroom` WRITE;
/*!40000 ALTER TABLE `meetingroom` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetingroom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newsevent`
--

DROP TABLE IF EXISTS `newsevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `newsevent` (
  `id` int NOT NULL AUTO_INCREMENT,
  `event_name` varchar(250) NOT NULL,
  `event_description` text NOT NULL,
  `event_date` datetime NOT NULL,
  `event_expiry` datetime NOT NULL,
  `event_organizer` int NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `event_organizer_idx` (`event_organizer`),
  CONSTRAINT `event_organizer` FOREIGN KEY (`event_organizer`) REFERENCES `tenantcompany` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newsevent`
--

LOCK TABLES `newsevent` WRITE;
/*!40000 ALTER TABLE `newsevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `newsevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parkingtag`
--

DROP TABLE IF EXISTS `parkingtag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parkingtag` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(250) NOT NULL,
  `issued_to` int NOT NULL,
  `car_number` varchar(45) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `tag_expiry` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `issued_to_idx` (`issued_to`),
  CONSTRAINT `issued_to` FOREIGN KEY (`issued_to`) REFERENCES `cardtenworker` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parkingtag`
--

LOCK TABLES `parkingtag` WRITE;
/*!40000 ALTER TABLE `parkingtag` DISABLE KEYS */;
/*!40000 ALTER TABLE `parkingtag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pettycash`
--

DROP TABLE IF EXISTS `pettycash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pettycash` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `amount` int NOT NULL,
  `used_by` int NOT NULL,
  `notes` text NOT NULL,
  `requested_by` int NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `requested_by_idx` (`requested_by`),
  KEY `used_by_idx` (`used_by`),
  CONSTRAINT `used_by` FOREIGN KEY (`used_by`) REFERENCES `cardtenworker` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pettycash`
--

LOCK TABLES `pettycash` WRITE;
/*!40000 ALTER TABLE `pettycash` DISABLE KEYS */;
/*!40000 ALTER TABLE `pettycash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenantcompany`
--

DROP TABLE IF EXISTS `tenantcompany`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tenantcompany` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(250) NOT NULL,
  `company_email` varchar(250) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `cp_name` varchar(250) NOT NULL,
  `cp_email` varchar(250) NOT NULL,
  `company_size` int NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `company_size_idx` (`company_size`),
  CONSTRAINT `company_size` FOREIGN KEY (`company_size`) REFERENCES `companysize` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenantcompany`
--

LOCK TABLES `tenantcompany` WRITE;
/*!40000 ALTER TABLE `tenantcompany` DISABLE KEYS */;
/*!40000 ALTER TABLE `tenantcompany` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(250) NOT NULL,
  `status` tinyint NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'admin',1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(2,'co-admin',1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(3,'supervisor',1,'2024-03-23 00:00:00','2024-03-23 00:00:00');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `email` varchar(45) NOT NULL,
  `pwd` varchar(45) NOT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `role_id` int NOT NULL,
  `status` tinyint NOT NULL DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_roleId_idx` (`role_id`),
  CONSTRAINT `fk_roleId` FOREIGN KEY (`role_id`) REFERENCES `user_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'aqeel','mmaqeel@pk.ibm.com','12345','923335825548',1,1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(3,'john doe','johndoe@example.com','12345','923335825548',3,1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(5,'shahzaib','shahzaib@example.com','1234','923335825548',2,1,'2024-03-23 00:00:00','2024-03-23 00:00:00'),(6,'test 5','example@gmial.com','abcd','003131',2,1,'2024-03-23 00:00:00','2024-03-23 00:00:00');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-25 23:38:56
