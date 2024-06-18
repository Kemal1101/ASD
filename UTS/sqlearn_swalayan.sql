-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2023 at 12:35 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sqlearn_swalayan`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_brand` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `nama_brand`) VALUES
(1, 'ASUS'),
(2, 'SanDisk'),
(3, 'SGM'),
(4, 'Formula'),
(5, 'HotWheels'),
(6, 'Indomilk'),
(7, 'Wardah'),
(8, 'Walls'),
(9, 'Lego'),
(10, 'Dancow'),
(11, 'Kopiko'),
(12, 'Pepsodent'),
(13, 'Rexona');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_kategori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id`, `nama_kategori`) VALUES
(1, 'Laptop dan Komputer'),
(2, 'Mainan'),
(3, 'Makanan dan Susu Bayi'),
(4, 'Es Krim'),
(5, 'Susu, Kopi, dan Teh'),
(6, 'Kosmetik'),
(7, 'Perawatan Badan'),
(8, 'Perawatan Diri'),
(9, 'Kesehatan');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `id_kategori` bigint(20) UNSIGNED NOT NULL,
  `id_brand` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`id`, `nama_produk`, `stock`, `harga`, `id_kategori`, `id_brand`) VALUES
(1, 'Wardah Shampoo Anti Dandruff 170Ml', 25, 25500, 6, 7),
(2, 'Rexona Deo Roll On Men Motionsense Invisible+Antibacterial 45Ml', 20, 20700, 8, 13),
(3, 'Dancow Fortigro Susu Bubuk Instant Polybag 10X27g', 28, 28900, 5, 10),
(4, 'Rexona Roll-On Glowing White 40Ml', 12, 12500, 8, 13),
(5, 'Hot Wheels Fast & Furious Ford GT-40 08', 49, 49900, 2, 5),
(6, 'Pepsodent Action 123 Pasta Gigi Herbal 190G', 12, 12500, 10, 12),
(7, 'SANDISK 32 GB USB CRUZER BLADE CZ50', 9, 99000, 1, 2),
(8, 'Formula Pasta Gigi + Sikat Gigi Sparkling White 190G', 9, 9400, 8, 4),
(9, 'Kopiko Coffee Latte 78C 240Ml', 6, 6000, 5, 11),
(10, 'SANDISK 64 GB USB CRUZER BLADE CZ50', 14, 149000, 1, 2),
(11, 'Kopiko Minuman Kopi Susu Lucky Day 180Ml', 6, 6000, 11, 11),
(12, 'HOT WHEELS BATMOBILE TUMBLER LIMITED EDITION', 3, 3999900, 2, 5),
(13, 'Pepsodent Bamboo Salt Sikat Gigi Soft Multipack (Isi 2)', 25, 25400, 8, 12),
(14, 'SGM Eksplor 5+ Pro-Gressmaxx Susu Pertumbuhan Madu 400G', 30, 30500, 5, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `products_category_id_foreign` (`id_kategori`),
  ADD KEY `products_brand_id_foreign` (`id_brand`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `produk`
--
ALTER TABLE `produk`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `produk`
--
ALTER TABLE `produk`
  ADD CONSTRAINT `products_brand_id_foreign` FOREIGN KEY (`id_brand`) REFERENCES `brand` (`id`),
  ADD CONSTRAINT `products_category_id_foreign` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
