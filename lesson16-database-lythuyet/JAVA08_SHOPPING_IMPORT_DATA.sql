-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: java08_shopping
-- ------------------------------------------------------
-- Server version	8.0.18
USE JAVA08_SHOPPING;

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
-- Table structure for table `chitietdonhang`
--

DROP TABLE IF EXISTS `chitietdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhang` (
  `MaDH` int(11) NOT NULL,
  `MaMH` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  PRIMARY KEY (`MaDH`,`MaMH`),
  KEY `fk_DonHang_has_MatHang_MatHang1_idx` (`MaMH`),
  KEY `fk_DonHang_has_MatHang_DonHang1_idx` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_MatHang_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_MatHang_MatHang1` FOREIGN KEY (`MaMH`) REFERENCES `mathang` (`MaMH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES (1,1,1),(1,3,2),(1,4,1),(2,6,2),(2,8,2),(3,1,4),(3,2,2);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `MaDH` int(11) NOT NULL,
  `NgayTao` datetime NOT NULL,
  `PhiVanChuyen` double NOT NULL,
  `TongTien` double NOT NULL,
  `MaKH` int(11) NOT NULL,
  `MaLHTT` int(11) NOT NULL,
  PRIMARY KEY (`MaDH`),
  KEY `fk_DonHang_KhachHang1_idx` (`MaKH`),
  KEY `fk_DonHang_LHTT1_idx` (`MaLHTT`),
  CONSTRAINT `fk_DonHang_KhachHang1` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  CONSTRAINT `fk_DonHang_LHTT1` FOREIGN KEY (`MaLHTT`) REFERENCES `lhtt` (`MaLHTT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,'2020-12-18 16:33:20',46,0,1,1),(2,'2020-12-18 20:12:44',52,0,2,1),(3,'2020-12-17 18:19:24',40,0,3,2);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `MaHD` int(11) NOT NULL,
  `MaDH` int(11) NOT NULL,
  `SDTKhachHang` varchar(50) NOT NULL,
  `DiaChiGiaoHang` text NOT NULL,
  `SoTienCanThanhToan` double NOT NULL,
  PRIMARY KEY (`MaHD`,`MaDH`),
  KEY `fk_HoaDon_DonHang1_idx` (`MaDH`),
  CONSTRAINT `fk_HoaDon_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MaKH` int(11) NOT NULL,
  `TenKH` varchar(255) NOT NULL,
  `SoDienThoai` varchar(50) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `DiaChi` text NOT NULL,
  `MangXaHoi` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MaKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Lê Văn Khách','0936 126 363','defaul.com.tp@gmail.com','Nam Cao - Hòa Khánh - Đà nẵng','not found'),(2,'Hoàng Văn Nam','0936 126 363','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','not found'),(3,'Nguyễn Nam Bằng','0936 126 363','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','not found');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lhtt`
--

DROP TABLE IF EXISTS `lhtt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lhtt` (
  `MaLHTT` int(11) NOT NULL,
  `MoTa` text NOT NULL,
  PRIMARY KEY (`MaLHTT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lhtt`
--

LOCK TABLES `lhtt` WRITE;
/*!40000 ALTER TABLE `lhtt` DISABLE KEYS */;
INSERT INTO `lhtt` VALUES (1,'Tiền mặt'),(2,'Master card'),(3,'Ví điện tử');
/*!40000 ALTER TABLE `lhtt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaihang`
--

DROP TABLE IF EXISTS `loaihang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaihang` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(255) NOT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaihang`
--

LOCK TABLES `loaihang` WRITE;
/*!40000 ALTER TABLE `loaihang` DISABLE KEYS */;
INSERT INTO `loaihang` VALUES (1,'Áo'),(2,'Quần'),(3,'Giày dép'),(4,'Thắt lưng'),(5,'Mũ');
/*!40000 ALTER TABLE `loaihang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mathang`
--

DROP TABLE IF EXISTS `mathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mathang` (
  `MaMH` int(11) NOT NULL,
  `TenMH` varchar(255) NOT NULL,
  `Size` varchar(10) NOT NULL,
  `GiaMua` double NOT NULL,
  `GiaBan` double NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `MauSac` varchar(255) NOT NULL,
  `MaLoai` int(11) NOT NULL,
  PRIMARY KEY (`MaMH`),
  KEY `fk_MatHang_LoaiHang_idx` (`MaLoai`),
  CONSTRAINT `fk_MatHang_LoaiHang` FOREIGN KEY (`MaLoai`) REFERENCES `loaihang` (`MaLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mathang`
--

LOCK TABLES `mathang` WRITE;
/*!40000 ALTER TABLE `mathang` DISABLE KEYS */;
INSERT INTO `mathang` VALUES (1,'Áo sơ mi Nam','M',220,80,80,'Trắng',1),(2,'Áo sơ mi Nữ','M',180,80,80,'Hồng',1),(3,'Quần tây Nam','L',350,120,80,'Xanh',2),(4,'Quần jean Nam','L',320,120,120,'Đen',2),(5,'Quần jean Nữ','XL',320,120,280,'Đen',2),(6,'Giày da Nam','M',1000,400,280,'Nâu',3),(7,'Giày thể thao Nữ','L',600,200,400,'Trắng',3),(8,'Thắt lưng Nam','M',100,60,823,'Đen',4),(9,'Thắt lưng Nữ','M',200,80,900,'Đen',4),(10,'Mũ thể thao Nam','M',80,20,100,'Trắng',5);
/*!40000 ALTER TABLE `mathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `TenNV` varchar(255) NOT NULL,
  `SoDienThoai` varchar(50) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `DiaChi` text NOT NULL,
  `MaPB` int(11) NOT NULL,
  PRIMARY KEY (`MaNV`),
  KEY `fk_NhanVien_PhongBan1_idx` (`MaPB`),
  CONSTRAINT `fk_NhanVien_PhongBan1` FOREIGN KEY (`MaPB`) REFERENCES `phongban` (`MaPB`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Lê Tèo','0936 978 033','com.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng',1),(2,'Lê Na','0936 978 033','com.default.tp@gmail.com','Âu Cơ - Hòa Khánh - Đà Nẵng',1),(3,'Hoàng Bửi','0936 978 033','com.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng',2),(4,'Ngọc Thành','0936 978 033','com.default.tp@gmail.com','Lê Độ - Hòa Khánh - Đà Nẵng',1),(5,'Công Danh','0936 978 033','com.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng',2),(6,'Văn Hoàng','0936 978 033','com.default.tp@gmail.com','Âu Cơ - Hòa Khánh - Đà Nẵng',4),(7,'Minh Lê','0936 978 033','com.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng',2),(8,'Bảo Lê','0936 978 033','com.default.tp@gmail.com','Lê Độ - Hòa Khánh - Đà Nẵng',3),(9,'Lê Giao','0936 978 033','com.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng',3),(10,'Lê Hoàng','0936 978 033','com.default.tp@gmail.com','Âu Cơ - Hòa Khánh - Đà Nẵng',4);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongban`
--

DROP TABLE IF EXISTS `phongban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongban` (
  `MaPB` int(11) NOT NULL,
  `TenPB` varchar(255) NOT NULL,
  PRIMARY KEY (`MaPB`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongban`
--

LOCK TABLES `phongban` WRITE;
/*!40000 ALTER TABLE `phongban` DISABLE KEYS */;
INSERT INTO `phongban` VALUES (1,'Bộ phận quản lý'),(2,'Bộ phận nhân sự'),(3,'Bộ phận bảo vệ'),(4,'Bộ phận giao hàng');
/*!40000 ALTER TABLE `phongban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thongtingiaohang`
--

DROP TABLE IF EXISTS `thongtingiaohang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thongtingiaohang` (
  `MaDH` int(11) NOT NULL,
  `MaTTDH` int(11) NOT NULL,
  `ThoiGian` datetime NOT NULL,
  `MaNV` int(11) NOT NULL,
  PRIMARY KEY (`MaDH`,`MaTTDH`),
  KEY `fk_DonHang_has_TTDH_TTDH1_idx` (`MaTTDH`),
  KEY `fk_DonHang_has_TTDH_DonHang1_idx` (`MaDH`),
  KEY `fk_ThongTinGiaoHang_NhanVien1_idx` (`MaNV`),
  CONSTRAINT `fk_DonHang_has_TTDH_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_TTDH_TTDH1` FOREIGN KEY (`MaTTDH`) REFERENCES `ttdh` (`MaTTDH`),
  CONSTRAINT `fk_ThongTinGiaoHang_NhanVien1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thongtingiaohang`
--

LOCK TABLES `thongtingiaohang` WRITE;
/*!40000 ALTER TABLE `thongtingiaohang` DISABLE KEYS */;
INSERT INTO `thongtingiaohang` VALUES (1,3,'2020-12-14 18:20:20',10),(1,4,'2020-12-15 18:20:20',10),(1,5,'2020-12-16 18:20:20',10),(2,3,'2020-12-14 18:20:20',10),(2,4,'2020-12-15 18:20:20',10),(2,5,'2020-12-16 18:20:20',10),(3,3,'2020-12-14 18:20:20',10),(3,4,'2020-12-15 18:20:20',10),(3,5,'2020-12-16 18:20:20',10);
/*!40000 ALTER TABLE `thongtingiaohang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ttdh`
--

DROP TABLE IF EXISTS `ttdh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ttdh` (
  `MaTTDH` int(11) NOT NULL,
  `MoTa` text NOT NULL,
  PRIMARY KEY (`MaTTDH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ttdh`
--

LOCK TABLES `ttdh` WRITE;
/*!40000 ALTER TABLE `ttdh` DISABLE KEYS */;
INSERT INTO `ttdh` VALUES (1,'Yêu cầu đặt hàng'),(2,'Đặt hàng thành công'),(3,'Đang đóng gói'),(4,'Đang vận chuyển'),(5,'Giao hàng thành công');
/*!40000 ALTER TABLE `ttdh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-18 19:47:29
