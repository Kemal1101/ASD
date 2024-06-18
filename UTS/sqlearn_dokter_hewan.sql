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
-- Database: `sqlearn_dokter_hewan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pelayanan`
--

CREATE TABLE `pelayanan` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_pelayanan` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `pelayanan`
--

INSERT INTO `pelayanan` (`id`, `nama_pelayanan`, `harga`) VALUES
(1, 'Grooming Kucing', 55000),
(2, 'Grooming Anjing', 75000),
(3, 'Vaksin Anjing', 190000),
(4, 'Vaksin Kucing', 160000),
(5, 'Suntik Cacing', 125000);

-- --------------------------------------------------------

--
-- Table structure for table `reservasi`
--

CREATE TABLE `reservasi` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_user` bigint(20) UNSIGNED NOT NULL,
  `nama_peliharaan` varchar(255) NOT NULL,
  `jenis_peliharaan` varchar(255) NOT NULL,
  `jenis_kelamin_peliharaan` enum('Jantan','Betina') NOT NULL,
  `id_pelayanan` bigint(20) UNSIGNED NOT NULL,
  `status` enum('Pending','Accepted','Rejected','Completed') NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `reservasi`
--

INSERT INTO `reservasi` (`id`, `id_user`, `nama_peliharaan`, `jenis_peliharaan`, `jenis_kelamin_peliharaan`, `id_pelayanan`, `status`) VALUES
(1, 3, 'Ajax', 'Kucing', 'Jantan', 1, 'Accepted'),
(2, 4, 'Vue', 'Kucing', 'Betina', 4, 'Rejected'),
(3, 3, 'Ajax', 'Kucing', 'Jantan', 5, 'Rejected'),
(4, 4, 'Flask', 'Anjing', 'Jantan', 3, 'Completed'),
(5, 5, 'Sinatra', 'Kucing', 'Jantan', 6, 'Completed'),
(6, 4, 'Symfony', 'Kucing', 'Betina', 5, 'Pending'),
(7, 2, 'Ionic', 'Anjing', 'Jantan', 3, 'Accepted'),
(8, 5, 'Zikula', 'Kucing', 'Betina', 8, 'Accepted');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama` varchar(255) NOT NULL,
  `role` enum('admin','customer') NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `role`, `email`) VALUES
(1, 'Arrayna', '', 'arrayna@gmail.com'),
(2, 'Ruby', '', 'ruby@gmail.com'),
(3, 'Laravelo', '', 'laravelo@gmail.com'),
(4, 'Laravela', '', 'laravela@gmail.com'),
(5, 'Queryna', '', 'queryna@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pelayanan`
--
ALTER TABLE `pelayanan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservasi`
--
ALTER TABLE `reservasi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reservasi_id_user_foreign` (`id_user`),
  ADD KEY `reservasi_id_pelayanan_foreign` (`id_pelayanan`);

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
-- AUTO_INCREMENT for table `pelayanan`
--
ALTER TABLE `pelayanan`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `reservasi`
--
ALTER TABLE `reservasi`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservasi`
--
ALTER TABLE `reservasi`
  ADD CONSTRAINT `reservasi_id_pelayanan_foreign` FOREIGN KEY (`id_pelayanan`) REFERENCES `pelayanan` (`id`),
  ADD CONSTRAINT `reservasi_id_user_foreign` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
