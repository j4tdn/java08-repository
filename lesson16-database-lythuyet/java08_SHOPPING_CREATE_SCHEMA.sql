-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java08_shopping
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java08_shopping` ;

-- -----------------------------------------------------
-- Schema java08_shopping
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java08_shopping` DEFAULT CHARACTER SET utf8 ;
USE `java08_shopping` ;

-- -----------------------------------------------------
-- Table `java08_shopping`.`LoaiHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`LoaiHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`LoaiHang` (
  `MaLoai` INT NOT NULL,
  `TenLoai` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLoai`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`MatHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`MatHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`MatHang` (
  `MaMH` INT NOT NULL,
  `TenMH` VARCHAR(255) NOT NULL,
  `Size` VARCHAR(10) NOT NULL,
  `GiaMua` DOUBLE NOT NULL,
  `GiaBan` DOUBLE NOT NULL,
  `SoLuong` INT NOT NULL,
  `MauSac` VARCHAR(255) NOT NULL,
  `MaLoai` INT NULL,
  PRIMARY KEY (`MaMH`),
  INDEX `fk_MatHang_LoaiHang_idx` (`MaLoai` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_LoaiHang`
    FOREIGN KEY (`MaLoai`)
    REFERENCES `java08_shopping`.`LoaiHang` (`MaLoai`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`LHTT`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`LHTT` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`LHTT` (
  `MaLHTT` INT NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLHTT`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`PhongBan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`PhongBan` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`PhongBan` (
  `MaPB` INT NOT NULL,
  `TenPB` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaPB`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`KhachHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`KhachHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`KhachHang` (
  `MaKH` INT NOT NULL,
  `TenKH` VARCHAR(255) NULL,
  `SoDienThoai` VARCHAR(45) NULL,
  `Email` VARCHAR(255) NULL,
  `DiaChi` TEXT NULL,
  `MangXaHoi` VARCHAR(45) NULL,
  PRIMARY KEY (`MaKH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`NhanVien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`NhanVien` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`NhanVien` (
  `MaNV` INT NOT NULL,
  `TenNV` VARCHAR(255) NULL,
  `SoDienThoai` VARCHAR(255) NULL,
  `Email` VARCHAR(45) NULL,
  `DiaChi` VARCHAR(45) NULL,
  `PhongBan` INT NULL,
  PRIMARY KEY (`MaNV`),
  INDEX `fk_NhanVien_PhongBan1_idx` (`PhongBan` ASC) VISIBLE,
  CONSTRAINT `fk_NhanVien_PhongBan1`
    FOREIGN KEY (`PhongBan`)
    REFERENCES `java08_shopping`.`PhongBan` (`MaPB`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`TTDH`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`TTDH` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`TTDH` (
  `MaTTDH` INT NOT NULL,
  `MoTa` TEXT NOT NULL,
  PRIMARY KEY (`MaTTDH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`DonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`DonHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`DonHang` (
  `MaDH` INT NOT NULL,
  `NgayTao` DATETIME NULL,
  `PhiVanChuyen` DOUBLE NULL,
  `TongTien` DOUBLE NULL,
  `MaKH` INT NOT NULL,
  `LHTT` INT NOT NULL,
  PRIMARY KEY (`MaDH`),
  INDEX `fk_DonHang_KhachHang1_idx` (`MaKH` ASC) VISIBLE,
  INDEX `fk_DonHang_LHTT1_idx` (`LHTT` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_KhachHang1`
    FOREIGN KEY (`MaKH`)
    REFERENCES `java08_shopping`.`KhachHang` (`MaKH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_LHTT1`
    FOREIGN KEY (`LHTT`)
    REFERENCES `java08_shopping`.`LHTT` (`MaLHTT`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`ChiTietDonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`ChiTietDonHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`ChiTietDonHang` (
  `DonHang_MaDH` INT NOT NULL,
  `MatHang_MaMH` INT NOT NULL,
  `SoLuong` INT NOT NULL,
  PRIMARY KEY (`DonHang_MaDH`, `MatHang_MaMH`),
  INDEX `fk_DonHang_has_MatHang_MatHang1_idx` (`MatHang_MaMH` ASC) VISIBLE,
  INDEX `fk_DonHang_has_MatHang_DonHang1_idx` (`DonHang_MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_has_MatHang_DonHang1`
    FOREIGN KEY (`DonHang_MaDH`)
    REFERENCES `java08_shopping`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_has_MatHang_MatHang1`
    FOREIGN KEY (`MatHang_MaMH`)
    REFERENCES `java08_shopping`.`MatHang` (`MaMH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`ThongTinGiaoHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`ThongTinGiaoHang` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`ThongTinGiaoHang` (
  `DonHang_MaDH` INT NOT NULL,
  `TTDH_MaTTDH` INT NOT NULL,
  `ThoiGian` DATETIME NULL,
  `NhanVien` INT NOT NULL,
  PRIMARY KEY (`DonHang_MaDH`, `TTDH_MaTTDH`),
  INDEX `fk_DonHang_has_TTDH_TTDH1_idx` (`TTDH_MaTTDH` ASC) VISIBLE,
  INDEX `fk_DonHang_has_TTDH_DonHang1_idx` (`DonHang_MaDH` ASC) VISIBLE,
  INDEX `fk_ThongTinGiaoHang_NhanVien1_idx` (`NhanVien` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_has_TTDH_DonHang1`
    FOREIGN KEY (`DonHang_MaDH`)
    REFERENCES `java08_shopping`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_has_TTDH_TTDH1`
    FOREIGN KEY (`TTDH_MaTTDH`)
    REFERENCES `java08_shopping`.`TTDH` (`MaTTDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ThongTinGiaoHang_NhanVien1`
    FOREIGN KEY (`NhanVien`)
    REFERENCES `java08_shopping`.`NhanVien` (`MaNV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java08_shopping`.`HoaDon`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java08_shopping`.`HoaDon` ;

CREATE TABLE IF NOT EXISTS `java08_shopping`.`HoaDon` (
  `MaHD` INT NOT NULL,
  `MaDH` INT NOT NULL,
  `SoDTKhachHang` VARCHAR(45) NULL,
  `SoTienCanThanhToan` VARCHAR(45) NULL,
  PRIMARY KEY (`MaHD`, `MaDH`),
  INDEX `fk_HoaDon_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_HoaDon_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `java08_shopping`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
