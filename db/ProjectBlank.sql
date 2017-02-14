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

INSERT INTO `customer` (`customer_id`,`name`,`phone`,`address`) VALUES 
 (1,'Md. rashes',1722346286,'Saver, Dhaka'),
 (2,'Md. Razib',1670437451,'Panthpath, Dhaka'),
 (3,'Shafiqul Islam',453453456,'Kanchpur Sonargaon'),
 (4,'Afsana Khan Jui',1722203332,'Netrokona, Bangladesh'),
 (5,'Sajjad Munna',1911123123,'Kanchpur monjil khola'),
 (6,'Md. Mahbub Alam',1556989805,'Kanchpur Narayangonj'),
 (7,'gdfg',456456,'sdfgdfg');

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

INSERT INTO `stock` (`product_id`,`quantity`) VALUES 
 (1,0),
 (2,0),
 (3,0),
 (4,0),
 (5,0),
 (6,0),
 (7,0),
 (8,0),
 (9,0),
 (10,0),
 (11,0),
 (12,0),
 (13,0),
 (14,0),
 (15,0),
 (16,0),
 (17,0),
 (18,0),
 (19,0),
 (20,0),
 (21,0),
 (22,0),
 (23,0),
 (24,0),
 (25,0),
 (26,0),
 (27,0),
 (28,0),
 (29,0),
 (30,0),
 (31,0),
 (32,0),
 (33,0),
 (34,0),
 (35,0),
 (36,0),
 (37,0),
 (38,3),
 (39,0),
 (40,0),
 (41,0),
 (42,0),
 (43,0),
 (44,0);

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

INSERT INTO `supplier` (`supplier_id`,`phone`,`name`,`address`) VALUES 
 (1,1556989805,'Jewel','Dkaka 1100'),
 (2,1234567891,'Shamim','Dhaka 1100'),
 (3,1711253647,'Arun','Dhaka 1100'),
 (4,1911889393,'Shojib','Dhaka 1100'),
 (5,1190678911,'Gono Molla','Chitang Road'),
 (6,123456789,'Kamal Associate','Dhaka');
