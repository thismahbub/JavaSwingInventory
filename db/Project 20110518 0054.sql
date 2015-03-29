-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema project
--

CREATE DATABASE IF NOT EXISTS project;
USE project;

--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(10) unsigned NOT NULL default '0',
  `name` varchar(30) NOT NULL,
  PRIMARY KEY  USING BTREE (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`category_id`,`name`) VALUES 
 (1,'Charger'),
 (2,'Caching'),
 (3,'Battery'),
 (4,'Sim Card'),
 (5,'Headphones'),
 (6,'Ribbon/ flexi'),
 (7,'Memory Card'),
 (8,'Ornaments'),
 (9,'Converter'),
 (10,'Glass Paper');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(10) unsigned NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` int(14) unsigned NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY  USING BTREE (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_id`,`name`,`phone`,`address`) VALUES 
 (1,'Md. rashes',1722346286,'Saver, Dhaka'),
 (2,'Md. Razib',1670437451,'Panthpath, Dhaka'),
 (3,'Shafiqul Islam',453453456,'Kanchpur Sonargaon'),
 (4,'Afsana Khan Jui',1722203332,'Netrokona, Bangladesh'),
 (5,'Sajjad Munna',1911123123,'Kanchpur monjil khola'),
 (6,'Md. Mahbub Alam',1556989805,'Kanchpur Narayangonj');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(10) unsigned NOT NULL auto_increment,
  `price` int(10) unsigned NOT NULL,
  `name` varchar(30) NOT NULL,
  `category_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`product_id`),
  KEY `FK_product_CatID` USING BTREE (`category_id`),
  CONSTRAINT `FK_product_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`product_id`,`price`,`name`,`category_id`) VALUES 
 (1,75,'Nokia 1200',1),
 (2,72,'Nokia 1600',1),
 (3,120,'HTC',1),
 (4,80,'SonyEricson',1),
 (5,87,'5310',6),
 (6,70,'JY0',6),
 (7,80,'N80',6),
 (8,75,'N70',6),
 (9,250,'HTC',5),
 (10,120,'N70',5),
 (11,150,'Express Music',5),
 (12,75,'Nokia 1208',5),
 (13,75,'Nokia 1200',3),
 (14,180,'WITH G',3),
 (15,200,'Nokia 6500',3),
 (16,600,'X3',3),
 (17,300,'N73',3),
 (18,8,'Nokia 1200',10),
 (19,30,'Nokia 1200',2),
 (20,20,'Nokia 1100',2),
 (21,78,'Nokia C5 Classic',2),
 (22,400,'Nokia X3',2),
 (23,45,'Nokia 1280',2),
 (24,70,'N70',2),
 (25,180,'N80',2),
 (26,15,'N70',9),
 (27,10,'Nokia 1600',9),
 (28,25,'C150',9),
 (29,20,'C115',9),
 (30,18,'X100',9),
 (31,150,'Banglalink',4),
 (32,120,'GP',4),
 (33,110,'Airtel',4),
 (34,100,'Robi',4),
 (35,140,'Teletalk',4),
 (36,135,'Citycell',4),
 (37,235,'MicroSD 1GB',7),
 (38,245,'MicroSD 2 GB',7),
 (39,350,'MiniSD 1 GB',7),
 (40,400,'MiniSD 2GB',7),
 (41,600,'SD 1 GB',7),
 (42,800,'SD 2GB',7),
 (43,400,'M2 1GB',7),
 (44,500,'M2 2 GB',7);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `purchase_id` int(10) unsigned NOT NULL default '0',
  `date` datetime NOT NULL,
  `supplier_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`purchase_id`),
  KEY `FK_Purchase_SuID` USING BTREE (`supplier_id`),
  CONSTRAINT `FK_purchase_supplier_id` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` (`purchase_id`,`date`,`supplier_id`) VALUES 
 (1,'2011-05-01 01:17:32',1),
 (2,'2011-05-02 01:24:57',1),
 (3,'2011-05-04 01:37:48',3),
 (4,'2011-05-06 01:41:12',1),
 (5,'2011-05-06 01:45:22',4),
 (6,'2011-05-08 01:46:55',5),
 (7,'2011-05-09 01:48:12',2),
 (8,'2011-05-10 01:49:31',5);
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;


--
-- Definition of table `purchase_detail`
--

DROP TABLE IF EXISTS `purchase_detail`;
CREATE TABLE `purchase_detail` (
  `purchase_id` int(10) unsigned NOT NULL default '0',
  `product_id` int(10) unsigned NOT NULL,
  `Quantity` int(5) unsigned NOT NULL,
  `Price` int(5) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`purchase_id`,`product_id`),
  KEY `FK_Purchase_Detail_PID` USING BTREE (`product_id`),
  CONSTRAINT `FK_purchase_detail_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_purchase_detail_purchase_id` FOREIGN KEY (`purchase_id`) REFERENCES `purchase` (`purchase_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_detail`
--

/*!40000 ALTER TABLE `purchase_detail` DISABLE KEYS */;
INSERT INTO `purchase_detail` (`purchase_id`,`product_id`,`Quantity`,`Price`) VALUES 
 (1,1,10,75),
 (1,2,3,72),
 (1,3,5,120),
 (1,4,5,80),
 (2,5,5,87),
 (2,6,9,70),
 (2,7,10,80),
 (2,8,15,75),
 (3,9,20,250),
 (3,10,10,120),
 (3,11,10,150),
 (3,12,5,75),
 (3,13,5,75),
 (3,14,10,180),
 (4,15,6,200),
 (4,16,6,600),
 (4,17,15,300),
 (4,18,10,8),
 (5,19,20,30),
 (5,20,15,20),
 (5,21,30,78),
 (5,22,20,400),
 (5,23,40,45),
 (5,24,50,70),
 (6,25,10,180),
 (6,26,25,15),
 (6,27,15,10),
 (6,28,20,25),
 (6,29,25,20),
 (6,30,20,18),
 (7,31,50,150),
 (7,32,30,120),
 (7,33,30,110),
 (7,34,20,100),
 (7,35,15,140),
 (7,36,10,135),
 (8,37,20,235),
 (8,38,50,245),
 (8,39,10,350),
 (8,40,20,400),
 (8,41,10,600),
 (8,42,20,800);
/*!40000 ALTER TABLE `purchase_detail` ENABLE KEYS */;


--
-- Definition of table `sales`
--

DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales` (
  `sales_id` int(10) unsigned NOT NULL default '0',
  `date` datetime NOT NULL,
  `customer_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`sales_id`),
  KEY `FK_sales_CID` USING BTREE (`customer_id`),
  CONSTRAINT `FK_sales_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` (`sales_id`,`date`,`customer_id`) VALUES 
 (1,'2011-05-03 01:26:24',1),
 (2,'2011-05-09 01:51:51',2);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;


--
-- Definition of table `sales_detail`
--

DROP TABLE IF EXISTS `sales_detail`;
CREATE TABLE `sales_detail` (
  `sales_id` int(10) unsigned NOT NULL default '0',
  `product_id` int(10) unsigned NOT NULL,
  `Quantity` int(5) unsigned NOT NULL,
  `price` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`sales_id`,`product_id`),
  KEY `FK_sales_detail_PID` USING BTREE (`product_id`),
  CONSTRAINT `FK_sales_detail_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_sales_detail_sales_id` FOREIGN KEY (`sales_id`) REFERENCES `sales` (`sales_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_detail`
--

/*!40000 ALTER TABLE `sales_detail` DISABLE KEYS */;
INSERT INTO `sales_detail` (`sales_id`,`product_id`,`Quantity`,`price`) VALUES 
 (1,1,1,75),
 (1,2,1,72),
 (1,3,3,120),
 (1,4,2,80),
 (2,2,1,72),
 (2,12,1,75),
 (2,16,3,600),
 (2,20,1,20),
 (2,25,1,180),
 (2,27,1,10),
 (2,31,2,150);
/*!40000 ALTER TABLE `sales_detail` ENABLE KEYS */;


--
-- Definition of table `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `product_id` int(10) unsigned NOT NULL default '0',
  `quantity` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`product_id`),
  CONSTRAINT `FK_stock_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`product_id`,`quantity`) VALUES 
 (1,9),
 (2,1),
 (3,2),
 (4,3),
 (5,5),
 (6,9),
 (7,10),
 (8,15),
 (9,20),
 (10,10),
 (11,10),
 (12,4),
 (13,5),
 (14,10),
 (15,6),
 (16,3),
 (17,15),
 (18,10),
 (19,20),
 (20,14),
 (21,30),
 (22,20),
 (23,40),
 (24,50),
 (25,9),
 (26,25),
 (27,14),
 (28,20),
 (29,25),
 (30,20),
 (31,48),
 (32,30),
 (33,30),
 (34,20),
 (35,15),
 (36,10),
 (37,20),
 (38,53),
 (39,10),
 (40,20),
 (41,10),
 (42,20),
 (43,0),
 (44,0);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;


--
-- Definition of table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `supplier_id` int(10) unsigned NOT NULL auto_increment,
  `phone` int(14) unsigned NOT NULL,
  `name` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY  USING BTREE (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`supplier_id`,`phone`,`name`,`address`) VALUES 
 (1,1556989805,'Jewel','Dkaka 1100'),
 (2,1234567891,'Shamim','Dhaka 1100'),
 (3,1711253647,'Arun','Dhaka 1100'),
 (4,1911889393,'Shojib','Dhaka 1100'),
 (5,1190678911,'Gono Molla','Chitang Road'),
 (6,123456789,'Kamal Associate','Dhaka');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
