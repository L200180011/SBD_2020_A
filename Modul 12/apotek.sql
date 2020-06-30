-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2020 at 03:50 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `apoteker`
--

CREATE TABLE `apoteker` (
  `id_apoteker` int(11) NOT NULL,
  `nama_apoteker` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `apoteker`
--

INSERT INTO `apoteker` (`id_apoteker`, `nama_apoteker`) VALUES
(90, 'Putri'),
(91, 'Utami');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL,
  `no_antriFK` int(11) NOT NULL,
  `id_pasienFK` int(11) NOT NULL,
  `nama_obat` varchar(45) DEFAULT NULL,
  `jenis_obat` varchar(45) DEFAULT NULL,
  `kegunaan` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `no_antriFK`, `id_pasienFK`, `nama_obat`, `jenis_obat`, `kegunaan`) VALUES
(1234, 59, 17, 'paramex', 'tablet', 'pusing'),
(1924, 61, 190, 'VitalongD', 'bubuk', 'energi'),
(1980, 90, 760, 'MU', 'kasar', 'pilek'),
(5143, 52, 13, 'puyer', 'bubuk kering', 'radang tenggorokan'),
(5643, 53, 19, 'OB', 'sirup ', 'pile'),
(8907, 500, 19, 'moleuu', 'cair', 'fluoooooooo');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama_pasien` varchar(45) DEFAULT NULL,
  `umur` int(11) DEFAULT NULL,
  `penyakit` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `umur`, `penyakit`) VALUES
(11, 'putri amelia', 19, 'Batuk'),
(14, 'Aulia Nugraheni', 22, 'Flu'),
(15, 'Putri Kikusok', 24, 'Typus'),
(16, 'Muhammad Bagaskara', 23, 'DBD'),
(156, 'CLAIRE', NULL, NULL),
(198, 'siwi', NULL, NULL),
(768, 'Clara', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pemberian_obat`
--

CREATE TABLE `pemberian_obat` (
  `no_antri` int(11) NOT NULL,
  `harga_obat` int(11) DEFAULT NULL,
  `tanggal_transaksi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemberian_obat`
--

INSERT INTO `pemberian_obat` (`no_antri`, `harga_obat`, `tanggal_transaksi`) VALUES
(50, 50000, '2020-06-01'),
(51, 25000, '2020-06-07'),
(52, 40000, '2020-05-19'),
(55, 500000, '2020-06-03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apoteker`
--
ALTER TABLE `apoteker`
  ADD PRIMARY KEY (`id_apoteker`),
  ADD UNIQUE KEY `nama_apoteker` (`nama_apoteker`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`) USING BTREE,
  ADD UNIQUE KEY `nama_obat` (`nama_obat`),
  ADD UNIQUE KEY `jenis_obat` (`jenis_obat`),
  ADD UNIQUE KEY `kegunaan` (`kegunaan`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`),
  ADD UNIQUE KEY `nama` (`nama_pasien`),
  ADD UNIQUE KEY `umur` (`umur`),
  ADD UNIQUE KEY `penyakit` (`penyakit`);

--
-- Indexes for table `pemberian_obat`
--
ALTER TABLE `pemberian_obat`
  ADD PRIMARY KEY (`no_antri`),
  ADD UNIQUE KEY `harga_obat` (`harga_obat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
