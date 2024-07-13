-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for klinik
CREATE DATABASE IF NOT EXISTS `klinik` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `klinik`;

-- Dumping structure for table klinik.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `id_dokter` int NOT NULL AUTO_INCREMENT,
  `nama_dokter` varchar(100) NOT NULL,
  `tempat` varchar(30) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `agama` varchar(30) NOT NULL,
  `spesialis` varchar(50) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  PRIMARY KEY (`id_dokter`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.dokter: ~10 rows (approximately)
DELETE FROM `dokter`;
INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `tempat`, `tgl_lahir`, `jenis_kelamin`, `agama`, `spesialis`, `no_telp`) VALUES
	(1, 'Dr. Andi Pratama', 'Jakarta', '1985-05-12', 'Laki-Laki', 'Islam', 'Dokter Spesialis', '081234567890'),
	(2, 'Dr. Lina Susanto', 'Surabaya', '1990-10-20', 'Perempuan', 'Kristen', 'Dokter Gigi', '082345678901'),
	(3, 'Dr. Ahmad Abdullah', 'Bandung', '1987-08-15', 'Laki-Laki', 'Islam', 'Dokter Spesialis Kardiovaskular', '083456789012'),
	(4, 'Dr. Rina Dewi', 'Yogyakarta', '1992-03-08', 'Perempuan', 'Kristen', 'Dokter Anak', '084567890123'),
	(5, 'Dr. Budi Santoso', 'Medan', '1989-11-25', 'Laki-Laki', 'Islam', 'Dokter Spesialis Bedah', '085678901234'),
	(6, 'Dr. Maria Fernandez', 'Denpasar', '1991-07-18', 'Perempuan', 'Katolik', 'Dokter Mata', '086789012345'),
	(7, 'Dr. Dian Pratiwi', 'Surabaya', '1988-09-30', 'Perempuan', 'Islam', 'Dokter Spesialis Kulit', '087890123456'),
	(8, 'Dr. Rudi Hermawan', 'Bandung', '1993-06-05', 'Laki-Laki', 'Islam', 'Dokter Psikiater', '088901234567'),
	(9, 'Dr. Siti Nurhayati', 'Jakarta', '1995-02-14', 'Perempuan', 'Islam', 'Dokter Kandungan', '089012345678'),
	(10, 'Dr. David Wang', 'Semarang', '1990-12-01', 'Laki-Laki', 'Kristen', 'Dokter Spesialis Jantung', '090123456789');

-- Dumping structure for table klinik.obat
CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` int NOT NULL AUTO_INCREMENT,
  `nama_obat` varchar(50) DEFAULT NULL,
  `harga` int DEFAULT NULL,
  `jenis_obat` varchar(50) DEFAULT NULL,
  `expired` date DEFAULT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.obat: ~7 rows (approximately)
DELETE FROM `obat`;
INSERT INTO `obat` (`id_obat`, `nama_obat`, `harga`, `jenis_obat`, `expired`, `stock`) VALUES
	(0, 'Ibuprofen', 17000, 'Syrup', '2023-12-31', 90),
	(1, 'Paracetamol', 15000, 'Tablet', '2023-12-31', 100),
	(2, 'Amoxicillin', 25000, 'Kapsul', '2024-06-30', 50),
	(3, 'Omeprazole', 18000, 'Tablet', '2023-09-30', 80),
	(5, 'Vitamin C', 10000, 'Tablet', '2024-08-31', 200),
	(6, 'Aspirin', 20000, 'Tablet', '2023-10-31', 60),
	(7, 'Loperamide', 22000, 'Kapsul', '2024-07-31', 40);

-- Dumping structure for table klinik.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `nik` varchar(40) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `goldar` varchar(2) NOT NULL,
  `tempat` varchar(30) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('Kawin','Belum Kawin') NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.pasien: ~10 rows (approximately)
DELETE FROM `pasien`;
INSERT INTO `pasien` (`nik`, `nama`, `jk`, `alamat`, `no_hp`, `goldar`, `tempat`, `tgl_lahir`, `status`) VALUES
	('0123456789', 'Siti Nurhayati', 'Perempuan', 'Jl. Gajah Mada No. 890', '090123456789', 'B', 'Jakarta', '1993-08-08', 'Kawin'),
	('1234567890', 'Andi Pratama', 'Laki-laki', 'Jl. Sudirman No. 123', '081234567890', 'A', 'Jakarta', '1990-01-01', 'Kawin'),
	('2345678901', 'Siti Rahayu', 'Perempuan', 'Jl. Ahmad Yani No. 456', '082345678901', 'B', 'Bandung', '1992-03-15', 'Belum Kawin'),
	('3456789012', 'Budi Susanto', 'Laki-laki', 'Jl. Gatot Subroto No. 789', '083456789012', 'O', 'Surabaya', '1985-06-20', 'Kawin'),
	('4567890123', 'Rina Dewi', 'Perempuan', 'Jl. Diponegoro No. 012', '084567890123', 'AB', 'Yogyakarta', '1991-11-10', 'Belum Kawin'),
	('5678901234', 'Ahmad Abdullah', 'Laki-laki', 'Jl. Imam Bonjol No. 345', '085678901234', 'A', 'Medan', '1994-09-05', 'Belum Kawin'),
	('6789012345', 'Maria Fernandez', 'Perempuan', 'Jl. Thamrin No. 678', '086789012345', 'B', 'Denpasar', '1988-07-25', 'Kawin'),
	('7890123456', 'Muhammad Ali', 'Laki-laki', 'Jl. Asia Afrika No. 901', '087890123456', 'O', 'Bogor', '1987-12-12', 'Kawin'),
	('8901234567', 'Linda Lee', 'Perempuan', 'Jl. Merdeka No. 234', '088901234567', 'AB', 'Semarang', '1993-04-30', 'Belum Kawin'),
	('9012345678', 'David Wang', 'Laki-laki', 'Jl. Veteran No. 567', '089012345678', 'A', 'Bandung', '1990-02-14', 'Belum Kawin');

-- Dumping structure for table klinik.pegawai
CREATE TABLE IF NOT EXISTS `pegawai` (
  `id_pegawai` int NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(100) NOT NULL,
  `jenis_kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `posisi` varchar(35) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `agama` varchar(30) NOT NULL,
  `tempat` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `status` enum('Tetap','Kontrak') NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.pegawai: ~12 rows (approximately)
DELETE FROM `pegawai`;
INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `jenis_kelamin`, `posisi`, `alamat`, `no_hp`, `agama`, `tempat`, `tanggal_lahir`, `status`) VALUES
	(1, 'John Doe', 'Laki-Laki', 'Manager', 'Jl. Ahmad Yani No. 123', '081234567890', 'Islam', 'Jakarta', '1990-01-01', 'Tetap'),
	(3, 'Michael Johnson', 'Laki-Laki', 'Supervisor', 'Jl. Gatot Subroto No. 789', '083456789012', 'Islam', 'Surabaya', '1985-06-20', 'Tetap'),
	(4, 'Sarah Williams', 'Perempuan', 'Karyawan', 'Jl. Diponegoro No. 012', '084567890123', 'Kristen', 'Yogyakarta', '1991-11-10', 'Tetap'),
	(5, 'Ahmad Abdullah', 'Laki-Laki', 'Karyawan', 'Jl. Imam Bonjol No. 345', '085678901234', 'Islam', 'Medan', '1994-09-05', 'Tetap'),
	(6, 'Maria Fernandez', 'Perempuan', 'Karyawan', 'Jl. Thamrin No. 678', '086789012345', 'Katolik', 'Denpasar', '1988-07-25', 'Tetap'),
	(7, 'Muhammad Ali', 'Laki-Laki', 'Supervisor', 'Jl. Asia Afrika No. 901', '087890123456', 'Islam', 'Bogor', '1987-12-12', 'Tetap'),
	(8, 'Linda Lee', 'Perempuan', 'Karyawan', 'Jl. Merdeka No. 234', '088901234567', 'Buddha', 'Semarang', '1993-04-30', 'Kontrak'),
	(9, 'David Wang', 'Laki-Laki', 'Karyawan', 'Jl. Veteran No. 567', '089012345678', 'Kristen', 'Bandung', '1990-02-14', 'Kontrak'),
	(10, 'Siti Nurhayati', 'Perempuan', 'Karyawan', 'Jl. Gajah Mada No. 890', '090123456789', 'Islam', 'Jakarta', '1993-08-08', 'Tetap'),
	(11, 'Rudi Hermawan', 'Laki-Laki', 'Karyawan', 'Jl. Pahlawan No. 123', '091234567890', 'Islam', 'Surabaya', '1989-05-18', 'Kontrak'),
	(12, 'Jane Smith', 'Perempuan', 'Asisten Manager', 'Jl. Sudirman No. 456', '082345678901', 'Kristen', 'Bandung', '1992-03-15', 'Kontrak');

-- Dumping structure for table klinik.rekam_medis
CREATE TABLE IF NOT EXISTS `rekam_medis` (
  `id_berobat` int NOT NULL AUTO_INCREMENT,
  `nik` varchar(40) DEFAULT NULL,
  `id_dokter` int DEFAULT NULL,
  `tgl_berobat` date DEFAULT NULL,
  `keluhan` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_berobat`),
  KEY `id_pasien` (`nik`),
  KEY `id_dokter` (`id_dokter`),
  CONSTRAINT `id_dokter` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`) ON UPDATE CASCADE,
  CONSTRAINT `nik` FOREIGN KEY (`nik`) REFERENCES `pasien` (`nik`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.rekam_medis: ~2 rows (approximately)
DELETE FROM `rekam_medis`;
INSERT INTO `rekam_medis` (`id_berobat`, `nik`, `id_dokter`, `tgl_berobat`, `keluhan`) VALUES
	(4, '5678901234', 1, '2023-07-08', 'Test'),
	(5, '5678901234', 1, '2023-07-08', 'Test');

-- Dumping structure for table klinik.transaksi
CREATE TABLE IF NOT EXISTS `transaksi` (
  `id_transaksi` int NOT NULL AUTO_INCREMENT,
  `id_berobat` int NOT NULL DEFAULT '0',
  `total_biaya` int DEFAULT NULL,
  `cash` int DEFAULT NULL,
  `kembalian` int DEFAULT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_berobat` (`id_berobat`),
  CONSTRAINT `id_berobat` FOREIGN KEY (`id_berobat`) REFERENCES `rekam_medis` (`id_berobat`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.transaksi: ~2 rows (approximately)
DELETE FROM `transaksi`;
INSERT INTO `transaksi` (`id_transaksi`, `id_berobat`, `total_biaya`, `cash`, `kembalian`) VALUES
	(2, 4, 90000, 90000, 0),
	(3, 4, 90000, 90000, 0);

-- Dumping structure for table klinik.user
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table klinik.user: ~2 rows (approximately)
DELETE FROM `user`;
INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
	(1, 'admin', 'admin'),
	(2, 'unindraku', 'unindraku');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
