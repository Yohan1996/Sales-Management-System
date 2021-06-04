-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 28, 2021 at 11:59 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jk_sales_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `branchadminlogin`
--

DROP TABLE IF EXISTS `branchadminlogin`;
CREATE TABLE IF NOT EXISTS `branchadminlogin` (
  `ID` int(15) NOT NULL AUTO_INCREMENT,
  `AdminID` varchar(20) NOT NULL,
  `AdminName` varchar(50) NOT NULL,
  `Branch` varchar(20) NOT NULL,
  `TP` varchar(15) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `UserName` varchar(20) NOT NULL,
  `Psw` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branchadminlogin`
--

INSERT INTO `branchadminlogin` (`ID`, `AdminID`, `AdminName`, `Branch`, `TP`, `Email`, `UserName`, `Psw`) VALUES
(2, 'A001', 'Nuwan Gihan', 'Galle', '98765477', 'nuwan@gmail.com', 'nuwan', '1234'),
(3, 'A002', 'Gihan', 'Matara', '0412365453', 'Gihan@gmail.com', 'gihan', '1234'),
(4, 'A003', 'Pradip Rangana', 'Kandy', '0774343234', 'kandyjk@gmail.com', 'pradip', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `branch_details`
--

DROP TABLE IF EXISTS `branch_details`;
CREATE TABLE IF NOT EXISTS `branch_details` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BranchID` varchar(15) NOT NULL,
  `BranchName` varchar(25) NOT NULL,
  `BranchAddress` varchar(50) NOT NULL,
  `BranchEmail` varchar(30) NOT NULL,
  `BranchTP` varchar(15) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch_details`
--

INSERT INTO `branch_details` (`ID`, `BranchID`, `BranchName`, `BranchAddress`, `BranchEmail`, `BranchTP`) VALUES
(25, 'B003', 'Kandy', '12/5, Main Road, Kandy', 'kandyjk@gmail.com', '0312356546'),
(24, 'B002', 'Matara', '65, Main Road, Matara', 'matarajk@gmail.com', '0412366754'),
(26, 'B004', 'Galle', '12, Main Road, Galle', 'gallejk@gmail.com', '0912365431');

-- --------------------------------------------------------

--
-- Table structure for table `customers_details`
--

DROP TABLE IF EXISTS `customers_details`;
CREATE TABLE IF NOT EXISTS `customers_details` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `CustomerID` varchar(15) NOT NULL,
  `CustomerName` varchar(50) NOT NULL,
  `CustomerGender` varchar(10) NOT NULL,
  `CustomerTP` varchar(15) NOT NULL,
  `CustomerAddres` varchar(50) NOT NULL,
  `CustomerEmail` varchar(30) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers_details`
--

INSERT INTO `customers_details` (`No`, `CustomerID`, `CustomerName`, `CustomerGender`, `CustomerTP`, `CustomerAddres`, `CustomerEmail`) VALUES
(2, '954562342V', 'kavitha', 'female', '0776435423', 'Julgaha, Galle', 'kavitha@gmail.com'),
(6, '980234356V', 'kalana perera', 'male', '0775433452', 'Main road, Galle', 'kalana@gmail.com'),
(5, '960323345V', 'Banuka Perera', 'Male', '0775645343', 'Main Road, Matara', 'banuka@gmail.com'),
(7, '934532666V', 'Vikasitha', 'male', '0774534231', 'Main road, Galle', 'vikasitha@gmail.com'),
(8, '913423445V', 'Janith', 'Male', '0915645444', 'Matara', 'janith@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `customers_purchase`
--

DROP TABLE IF EXISTS `customers_purchase`;
CREATE TABLE IF NOT EXISTS `customers_purchase` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `ReferenceID` varchar(15) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Addres` varchar(50) NOT NULL,
  `TP` varchar(15) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `ProductID` varchar(15) NOT NULL,
  `ProductName` varchar(30) NOT NULL,
  `Price` varchar(10) NOT NULL,
  `Quality` varchar(10) NOT NULL,
  `TotalPrice1` varchar(10) NOT NULL,
  `ProductID2` varchar(15) NOT NULL,
  `ProductName2` varchar(30) NOT NULL,
  `Price2` varchar(10) NOT NULL,
  `Quality2` varchar(10) NOT NULL,
  `TotalPrice2` varchar(10) NOT NULL,
  `PaymentMethod` varchar(15) NOT NULL,
  `BranchName` varchar(25) NOT NULL,
  `AllPrice` varchar(10) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers_purchase`
--

INSERT INTO `customers_purchase` (`No`, `ReferenceID`, `NIC`, `Name`, `Addres`, `TP`, `Email`, `ProductID`, `ProductName`, `Price`, `Quality`, `TotalPrice1`, `ProductID2`, `ProductName2`, `Price2`, `Quality2`, `TotalPrice2`, `PaymentMethod`, `BranchName`, `AllPrice`) VALUES
(31, 'R0006', '913423445V', 'Janith', 'Matara', '0915645444', 'janith@gmail.com', 'P0012', 'LENOVO V15-IIL', '120000', '2', '240000.0', '', '', '', '', '', 'Card', 'Matara', '240000.0'),
(32, 'R0007', '960323345V', 'Banuka Perera', 'Main Road, Matara', '0775645343', 'banuka@gmail.com', 'P0008', 'DELL INSPIRON', '105000', '1', '105000.0', 'P0009', 'ACER ASPIRE A515', '105000', '2', '210000.0', 'Card', 'Matara', '315000.0'),
(29, 'R0004', '913423445V', 'Janith', 'Matara', '0915645444', 'janith@gmail.com', 'P0006', 'MSI MODERN 15', '175000', '1', '175000.0', 'P0009', 'ACER ASPIRE A515', '105000', '1', '105000.0', 'Cash', 'Galle ', '280000.0'),
(30, 'R0005', '934532666V', 'Vikasitha', 'Main road, Galle', '0774534231', 'vikasitha@gmail.com', 'P0010', 'ACER A515 I7', '170000', '1', '170000.0', 'P0012', 'LENOVO V15-IIL', '120000', '1', '120000.0', 'Card', 'Galle ', '290000.0'),
(27, 'R0002', '954562342V', 'kavitha', 'Julgaha, Galle', '0776435423', 'kavitha@gmail.com', 'P0008', 'DELL INSPIRON', '105000', '2', '210000.0', '', '', '', '', '', 'Card', 'Kandy', '210000.0'),
(28, 'R0003', '913423445V', 'Janith', 'Matara', '0915645444', 'janith@gmail.com', 'P0009', 'ACER ASPIRE A515', '105000', '2', '210000.0', '', '', '', '', '', 'Card', 'Kandy', '210000.0'),
(26, 'R0001', '960323345V', 'Banuka Perera', 'Main Road, Matara', '0775645343', 'banuka@gmail.com', 'P0005', 'DELL G3', '200000', '2', '400000.0', '', '', '', '', '', 'Card', 'Galle ', '400000.0');

-- --------------------------------------------------------

--
-- Table structure for table `headofficeadmins`
--

DROP TABLE IF EXISTS `headofficeadmins`;
CREATE TABLE IF NOT EXISTS `headofficeadmins` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `AdminID` varchar(15) NOT NULL,
  `AdminName` varchar(50) NOT NULL,
  `TP` varchar(15) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `UserName` varchar(25) NOT NULL,
  `Psw` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `headofficeadmins`
--

INSERT INTO `headofficeadmins` (`ID`, `AdminID`, `AdminName`, `TP`, `Email`, `UserName`, `Psw`) VALUES
(3, 'A001', 'Yohan Jayasuriya', '0776785829', 'yohan@gmail.com', 'yohan', '1234'),
(4, 'A002', 'Kasun Perera', '0718964533', 'kasun33@gmail.com', 'kasun', '1234'),
(5, 'A004', 'Malith Rathnayaka', '0112456378', 'malith@gmail.com', 'malith', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `ProductID` varchar(15) NOT NULL,
  `ProductName` varchar(30) NOT NULL,
  `StockInHead` int(10) NOT NULL,
  `StockInGalle` int(10) NOT NULL,
  `StockInMatara` int(10) NOT NULL,
  `StockInKandy` int(10) NOT NULL,
  `CostPrice` int(10) NOT NULL,
  `RetailPrice` int(10) NOT NULL,
  `Warranty` varchar(10) NOT NULL,
  `ProductDiscription` varchar(150) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`No`, `ProductID`, `ProductName`, `StockInHead`, `StockInGalle`, `StockInMatara`, `StockInKandy`, `CostPrice`, `RetailPrice`, `Warranty`, `ProductDiscription`) VALUES
(10, 'P0005', 'DELL G3', 30, 20, 25, 20, 185000, 200000, '2', '10th Generation Intel® Core™ i5-10300H'),
(11, 'P0006', 'MSI MODERN 15', 20, 20, 10, 15, 160000, 175000, '3', 'Intel® Core™ i5 10210U Processor'),
(9, 'P0004', 'HP -15S', 30, 25, 19, 18, 65000, 75000, '3', 'Intel Celeron N4020 Processor 4M Cache'),
(6, 'P0003', 'Asus', 22, 26, 22, 40, 88000, 100000, '3', 'Intel® Core™ i3 1115G4 Processor, 6M Cache, up to 4.1 GHz\''),
(12, 'P0007', 'HP LAPTOP 15', 35, 37, 24, 21, 95000, 105000, '3', 'Intel® Core™ i3-10110U \'1.6 GHz base'),
(13, 'P0008', 'DELL INSPIRON', 43, 40, 22, 36, 98000, 105000, '2', '11th Generation Intel® Core™ i7-1165G7 Processor'),
(14, 'P0009', 'ACER ASPIRE A515', 50, 43, 42, 30, 95000, 105000, '3', 'Intel® Core™ i5 1135G7'),
(15, 'P0010', 'ACER A515 I7', 30, 28, 27, 23, 160000, 170000, '2', 'Core i7-1165G7'),
(16, 'P0011', 'ACER ASPIRE A315', 20, 15, 22, 23, 120000, 130000, '3', 'Intel Core i5-10210U Processor '),
(17, 'P0012', 'LENOVO V15-IIL', 18, 21, 12, 15, 110000, 120000, '3', 'intel i5- 1035G1 10th Gen processor'),
(18, 'P0013', 'LENOVO L340', 24, 34, 27, 30, 55000, 65000, '3', 'Intel Pentium 4205U - 1.8 GHz \'no Turbo Boost\'');

-- --------------------------------------------------------

--
-- Table structure for table `request_details`
--

DROP TABLE IF EXISTS `request_details`;
CREATE TABLE IF NOT EXISTS `request_details` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `RequestID` varchar(15) NOT NULL,
  `ProductID` varchar(15) NOT NULL,
  `ProductName` varchar(25) NOT NULL,
  `RequestFrom` varchar(25) NOT NULL,
  `RequestTo` varchar(25) NOT NULL,
  `Quantity` varchar(10) NOT NULL,
  `Date` varchar(10) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request_details`
--

INSERT INTO `request_details` (`No`, `RequestID`, `ProductID`, `ProductName`, `RequestFrom`, `RequestTo`, `Quantity`, `Date`) VALUES
(16, 'R0004', 'P0008', 'DELL INSPIRON', 'Kandy', 'Head-Office', '5', '2021/02/24'),
(15, 'R0003', 'P0009', 'ACER ASPIRE A515', 'Kandy', 'Matara', '10', '2021/02/24'),
(17, 'R0005', 'P0006', 'MSI MODERN 15', 'Kandy', 'Galle', '5', '2021/02/24'),
(18, 'R0006', 'P0012', 'LENOVO V15-IIL', 'Kandy', 'Head-Office', '4', '2021/02/24'),
(21, 'R0009', 'P0013', 'LENOVO L340', 'Galle', 'Kandy', '5', '2021/02/24'),
(22, 'R0010', 'P0013', 'LENOVO L340', 'Galle', 'Matara', '13', '2021/02/24');

-- --------------------------------------------------------

--
-- Table structure for table `transfer_details`
--

DROP TABLE IF EXISTS `transfer_details`;
CREATE TABLE IF NOT EXISTS `transfer_details` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `TransferID` varchar(15) NOT NULL,
  `RequestID` varchar(15) NOT NULL,
  `ProductID` varchar(15) NOT NULL,
  `ProductName` varchar(25) NOT NULL,
  `TransferTo` varchar(25) NOT NULL,
  `TransferFrom` varchar(25) NOT NULL,
  `Quantity` varchar(10) NOT NULL,
  `RequestResivedDate` date NOT NULL,
  `TransferDate` date NOT NULL,
  `VehicleID` varchar(15) NOT NULL,
  `DriverID` varchar(15) NOT NULL,
  `TransferStatus` varchar(15) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=65 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transfer_details`
--

INSERT INTO `transfer_details` (`No`, `TransferID`, `RequestID`, `ProductID`, `ProductName`, `TransferTo`, `TransferFrom`, `Quantity`, `RequestResivedDate`, `TransferDate`, `VehicleID`, `DriverID`, `TransferStatus`) VALUES
(62, 'T0005', 'R0011', 'P0006', 'MSI MODERN 15', 'Galle', 'Matara', '2', '2021-02-24', '2021-02-25', 'V0010', 'D0010', 'Delivered'),
(63, 'T0006', 'R0012', 'P0013', 'LENOVO L340', 'Matara', 'Kandy', '4', '2021-02-24', '2021-02-25', 'V0003', 'D0003', 'Accepted'),
(64, 'T0007', 'R0008', 'P0012', 'LENOVO V15-IIL', 'Galle', 'Kandy', '6', '2021-02-24', '2021-02-27', 'V0003', 'Jagath', 'Accepted'),
(61, 'T0004', 'R0013', 'P0005', 'DELL G3', 'Matara', 'Galle', '5', '2021-02-24', '2021-02-25', 'V0008', 'D0008', 'Transpoting'),
(60, 'T0003', 'R0007', 'P0007', 'HP LAPTOP 15', 'Galle', 'Head-Office', '5', '2021-02-24', '2021-02-25', 'V0004', 'D0004', 'Transpoting'),
(59, 'T0002', 'R0002', 'P0011', 'ACER ASPIRE A315', 'Matara', 'Head-Office', '4', '2021-02-24', '2021-02-25', 'V0005', 'D0005', 'Delivered'),
(58, 'T0001', 'R0001', 'P0010', 'ACER A515 I7', 'Matara', 'Galle', '4', '2021-02-24', '2021-02-24', 'V0006', 'D0006', 'Accepted');

-- --------------------------------------------------------

--
-- Table structure for table `vehicles_details`
--

DROP TABLE IF EXISTS `vehicles_details`;
CREATE TABLE IF NOT EXISTS `vehicles_details` (
  `No` int(15) NOT NULL AUTO_INCREMENT,
  `VehicleID` varchar(15) NOT NULL,
  `DriverID` varchar(15) NOT NULL,
  `DriverName` varchar(50) NOT NULL,
  `DriverTP` varchar(15) NOT NULL,
  `VehicleType` varchar(15) NOT NULL,
  `VehicleOwn` varchar(20) NOT NULL,
  `Availability` varchar(10) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicles_details`
--

INSERT INTO `vehicles_details` (`No`, `VehicleID`, `DriverID`, `DriverName`, `DriverTP`, `VehicleType`, `VehicleOwn`, `Availability`) VALUES
(16, 'V0005', 'D0005', 'Pavara', '0785452342', 'Van', 'Head-Office', 'Available'),
(15, 'V0004', 'D0004', 'Kalana', '0765434234', 'Van', 'Head-Office', 'Available'),
(14, 'V0003', 'D0003', 'Jagath', '0765453452', 'Van', 'Kandy', 'Available'),
(13, 'V0002', 'D0002', 'Sumudu', '0786545234', 'Van', 'Kandy', 'Available'),
(12, 'V0001', 'D0001', 'Dasun', '0786754231', 'Van', 'Head-Office', 'Avilable'),
(17, 'V0006', 'D0006', 'Pamith', '0714562232', 'Van', 'Galle', 'Available'),
(18, 'V0007', 'D0007', 'Saman', '071234343', 'Van', 'Galle', 'Available'),
(20, 'V0009', 'D0009', 'Kanishka', '0713425454', 'Van', 'Matara', 'Available'),
(21, 'V0010', 'D0010', 'Tharuka', '0756434324', 'Van', 'Matara', 'Available'),
(22, 'V0011', 'D0011', 'Kusal', '0786523211', 'Van', 'Galle', 'Available'),
(23, 'V0012', 'D0012', 'Sunil', '0786542344', 'Van', 'Kandy', 'Available'),
(24, 'V0013', 'V0012', 'Pavan', '0775444432', 'Van', 'Galle', 'Available');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
