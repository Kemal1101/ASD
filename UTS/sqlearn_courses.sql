-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2023 at 03:33 PM
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
-- Database: `sqlearn_courses`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_transaksi` bigint(20) UNSIGNED NOT NULL,
  `id_kursus` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id`, `id_transaksi`, `id_kursus`) VALUES
(1, 1, 7),
(2, 1, 10),
(3, 1, 13),
(4, 2, 2),
(5, 2, 3),
(6, 3, 5),
(7, 3, 3),
(8, 4, 1),
(9, 4, 2),
(10, 5, 4),
(11, 6, 6),
(12, 7, 3);

-- --------------------------------------------------------

--
-- Table structure for table `kursus`
--

CREATE TABLE `kursus` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `judul` varchar(255) NOT NULL,
  `pembuat` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `kursus`
--

INSERT INTO `kursus` (`id`, `judul`, `pembuat`, `harga`) VALUES
(1, 'Riset Akuntansi Membumikan Religiolitas - Political Economy of Accounting (PEA) vs Revolusi (Akuntansi) Buya Hamka', 'Ari Kamayanti', 180000),
(2, 'Metodologi Konstruktif', 'Anonim', 120000),
(3, 'Metodologi-Dramaturgi', 'Dr.Aji Dedi Mulawarman', 120000),
(4, 'Metodologi-Menggerakkan Hijrah', 'Dr.Aji Dedi Mulawarman', 120000),
(5, 'Metodologi-Orientalisme', 'Bu Ari', 120000),
(6, 'Metodologi-Simulakra', 'Ari Kamayanti', 120000),
(7, 'Understanding to Constructing Social Reality - Koleksi dan Analisis Data Komunitas: Facebook dan Whatsapp Group', 'Anita Kristina', 50000),
(8, 'Understanding to Constructing Social Reality - Mengintai Sebagai Metode Koleksi Data Netnografi', 'La Ode Sumail', 50000),
(9, 'Understanding to Constructing Social Reality - Penyajian Netnografi', 'Novrida Qudsi Lutfillah', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_user` bigint(20) UNSIGNED NOT NULL,
  `total` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `tanggal_transaksi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `id_user`, `total`, `status`, `tanggal_transaksi`) VALUES
(1, 1, 540000, 'completed', '2022-06-19'),
(2, 5, 360000, 'failed', '2022-06-19'),
(3, 3, 360000, 'pending', '2022-06-24'),
(4, 2, 300000, 'completed', '2022-05-19'),
(5, 5, 120000, 'pending', '2022-06-24'),
(6, 8, 120000, 'completed', '2022-07-03'),
(7, 9, 300000, 'completed', '2022-07-03'),
(8, 2, 120000, 'completed', '2022-07-03');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_user` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nomor_telepon` varchar(15) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama_user`, `email`, `nomor_telepon`, `jenis_kelamin`, `tanggal_lahir`) VALUES
(1, 'Laravelia Putri', 'laravelia.putri@gmail.com', '085771245934', 'P', '2002-02-06'),
(2, 'Ruby Arrayna', 'rubyarrayna@gmail.com', '081328094410', 'P', '2000-03-17'),
(3, 'Flutterina', 'flutterina@gmail.com', '081328094402', 'P', '2000-05-22'),
(4, 'Raden Ayu Pythonia', 'pythonia@gmail.com', '082126758866', NULL, NULL),
(5, 'Jason Andreas Van Abe', 'jasonandreas@gmail.com', '08129331561', 'L', '2002-06-24'),
(6, 'Syah Qory Latifa', 'qorylatifa@gmail.com', '08134559034', NULL, '2001-12-10'),
(7, 'Taylor Swift', 't.swift@gmail.com', '081541331846', 'P', NULL),
(8, 'Vue Jason', 'jason.vue@gmail.com', '081548963392', NULL, NULL),
(9, 'Max Bayesian', 'bayesian@gmail.com', '081954355831', 'L', '2001-05-28'),
(10, 'Cynthia Sri Susanti', 'cynthia.ss@gmail.com', '089452424423', 'P', '2001-01-09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transaction_details_transaction_id_foreign` (`id_transaksi`),
  ADD KEY `transaction_details_course_id_foreign` (`id_kursus`);

--
-- Indexes for table `kursus`
--
ALTER TABLE `kursus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transactions_user_id_foreign` (`id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `kursus`
--
ALTER TABLE `kursus`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `transaction_details_course_id_foreign` FOREIGN KEY (`id_kursus`) REFERENCES `kursus` (`id`),
  ADD CONSTRAINT `transaction_details_transaction_id_foreign` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transactions_user_id_foreign` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
