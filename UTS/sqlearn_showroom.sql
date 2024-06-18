-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2023 at 12:10 PM
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
-- Database: `sqlearn_showroom`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_brand` varchar(255) NOT NULL,
  `deskripsi_brand` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `nama_brand`, `deskripsi_brand`) VALUES
(1, 'Toyota', 'Toyota Indonesia merupakan salah satu produsen ternama mobil baru asal Jepang dengan 25 model pilihan dengan berbagai spesifikasi.'),
(2, 'Daihatsu', 'Daihatsu Indonesia merupakan produsen mobil baru dengan 9 model pilihan.'),
(3, 'Honda', 'Honda merupakan salah satu produsen kendaraan terbesar di dunia sejak tahun 1959 dan juga produsen mesin pembakaran dalam terbesar dengan produksi lebih dari 14 juta unit tiap tahun.'),
(4, 'Nissan', 'Nissan Indonesia merupakan produsen mobil baru dengan 5 model pilihan. Sebagai salah satu raksasa otomotif di Tanah Air, Nissan memiliki line-up 2 model MPV (Nissan Serena, Livina), serta 3 model SUV dan crossover (Nissan Magnite, Kicks E-Power, Xtrail).'),
(5, 'BMW', 'BMW Indonesia menyediakan hingga 23 model kendaraan penumpang di Indonesia dari berbagai jenis.'),
(6, 'Mercedes-Benz', 'Mercedes-Benz pastinya punya desain mewah, Mercedes-Benz juga dinilai sangat cocok untuk kalangan eksekutif yang mendambakan kendaraan berperforma sangat baik, fitur canggih dan berlimpah, serta desain-material kualitas premium.'),
(7, 'Audi', 'Audi merupakan salah satu produsen otomotif termuka dari Jerman. Brand otomotif yang berlogo empat cincin bergabung ini juga memiliki semboyan Vorsprung durch Technik yakni keunggulan melalui teknologi, tak ayal Audi tetap konsisten hingga kini dengan inovasi teknologinya dalam industri otomotif.'),
(8, 'Suzuki', 'Suzuki Indonesia merupakan produsen mobil baru dengan 11 model pilihan.'),
(9, 'Jaguar', 'Jaguar merupakan brand asal Inggris yang didirikan pada tahun 1922.');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama_mobil` varchar(255) NOT NULL,
  `tahun` year(4) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `isi_silinder` int(11) NOT NULL,
  `transmisi` varchar(255) NOT NULL,
  `bahan_bakar` varchar(255) NOT NULL,
  `kapasitas` int(11) NOT NULL,
  `id_brand` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`id`, `nama_mobil`, `tahun`, `harga`, `isi_silinder`, `transmisi`, `bahan_bakar`, `kapasitas`, `id_brand`) VALUES
(1, 'Daihatsu Rocky 1.0 R TC MT', 2021, 232400000, 998, 'Otomatis', 'Bensin', 5, 2),
(2, 'Civic Type R 6 Speed MT', 2021, 1177000000, 1996, 'Otomatis', 'Bensin', 3, 3),
(3, 'Mercedes-Benz AMG GT R Coupe', 2021, 7165000000, 6250, 'Otomatis', 'Bensin', 2, 6),
(4, 'Toyota Alphard 2.5 X AT', 2021, 1064000000, 2494, 'Otomatis', 'Bensin', 6, 1),
(5, 'Mini Electric', 2022, 1046000000, 28, 'Otomatis', 'Electric', 4, 10),
(6, 'Audi RS4', 2021, 2543000000, 2894, 'Otomatis', 'Bensin', 5, 7),
(7, 'Suzuki Ertiga', 2021, 227300000, 1462, 'Otomatis', 'Bensin', 7, 8),
(8, 'BMW 218i', 2022, 880000000, 1499, 'Otomatis', 'Bensin', 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `no_ktp` varchar(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `email` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `no_ktp`, `nama`, `alamat`, `no_hp`, `email`, `jenis_kelamin`) VALUES
(1, '3497172758716740', 'Indra Setiawan Budiaman', 'Wisma Gading Permai Menara A3, DKI Jakarta', '021-45850160', 'setiawan.indra@gmail.com', 'Laki-Laki'),
(2, '3034951691552804', 'Agung Sukarno Darmali', 'JL.Raya Singosari No.119, Malang', '0341-452383', 'agungdarmali@gmail.com', 'Laki-Laki'),
(3, '5827240038265099', 'Erlin Batari Irawan', 'Jl Sultan Iskandar Muda 1, Sumatera Utara', '061-7151971', 'erlinbatari@gmail.com', 'Perempuan'),
(4, '3562169714016894', 'Ratna Leony Pranoto', 'Jl Lombok 10, Jawa Barat', '022-4210047', 'leonypranoto@gmail.com', 'Perempuan'),
(5, '7297245475007300', 'Widyawati Siska Tanudjaja', 'Kompl Kings Shopping Centre, Jawa Barat', '022-4200367', 'widyawati@gmail.com', 'Perempuan'),
(6, '9657831922919604', 'Melati Nirmala Tahyadi', 'Jl Tamblong 27, Jawa Barat', '022-4205765', 'melatinirmala@gmail.com', 'Perempuan'),
(7, '4559446182773616', 'Wulan Devi Irawan', 'Jl Pemuda 27, Jawa Timur', '031-5343373', 'devirawan@gmail.com', 'Perempuan'),
(8, '7184419737898422', 'Budi Agung Pranata', ' Jl Balikpapan 22 B, Dki Jakarta', '021-63864066', 'pranatagung@gmail.com', 'Laki-Laki'),
(9, '2253794088168868', 'Purnama Suharto Santoso', 'Jl Blunyah Gede 106 Yogyakarta, Jawa Tengah', '0274-523370', 'suharto@gmail.com', 'Laki-Laki'),
(10, '7166486323811203', 'Ridwan Iman Hadiman', 'Jl Brigjen Katamso 421, Sumatera Utara', '061-4159079', 'hadiman@gmail.com', 'Laki-Laki');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `no_nota` varchar(255) NOT NULL,
  `id_pelanggan` bigint(20) UNSIGNED NOT NULL,
  `id_mobil` bigint(20) UNSIGNED NOT NULL,
  `tanggal_pemesanan` date NOT NULL,
  `tanggal_pengiriman` date NOT NULL,
  `jenis_pembayaran` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `no_nota`, `id_pelanggan`, `id_mobil`, `tanggal_pemesanan`, `tanggal_pengiriman`, `jenis_pembayaran`, `status`) VALUES
(1, 'GR210609095833', 9, 4, '2021-06-09', '2021-06-22', 'Tunai', 'Selesai'),
(2, 'GR210611114121', 2, 7, '2021-06-11', '2021-06-30', 'Transfer', 'Selesai'),
(3, 'GR210611121904', 3, 2, '2021-06-11', '2021-06-27', 'Tunai', 'Pending'),
(4, 'GR210611123318', 4, 5, '2021-06-11', '2021-06-20', 'Tunai', 'Selesai'),
(5, 'GR210611124018', 3, 2, '2021-06-11', '2021-06-22', 'Transfer', 'Pending'),
(6, 'GR210611124147', 6, 2, '2021-06-11', '2021-06-16', 'Transfer', 'Pending'),
(7, 'GR210611124421', 1, 1, '2021-06-11', '2021-06-16', 'Transfer', 'Pending'),
(8, 'GR210611124637', 8, 1, '2021-06-11', '2021-06-09', 'Tunai', 'Pending'),
(9, 'GR210611033915', 9, 4, '2021-06-11', '2021-06-24', 'Tunai', 'Selesai'),
(10, 'GR210611034917', 1, 8, '2021-06-11', '2021-06-16', 'Tunai', 'Selesai'),
(11, 'GR210613031234', 1, 4, '2021-06-13', '2021-06-30', 'Tunai', 'Selesai'),
(12, 'GR210618101551', 2, 4, '2021-06-18', '2021-06-09', 'Tunai', 'Pending'),
(13, 'GR210620111920', 3, 3, '2021-06-20', '2021-06-03', 'Tunai', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cars_brand_id_foreign` (`id_brand`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `transactions_no_nota_unique` (`no_nota`),
  ADD KEY `transactions_customer_id_foreign` (`id_pelanggan`),
  ADD KEY `transactions_car_id_foreign` (`id_mobil`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `mobil`
--
ALTER TABLE `mobil`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mobil`
--
ALTER TABLE `mobil`
  ADD CONSTRAINT `cars_brand_id_foreign` FOREIGN KEY (`id_brand`) REFERENCES `brand` (`id`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transactions_car_id_foreign` FOREIGN KEY (`id_mobil`) REFERENCES `mobil` (`id`),
  ADD CONSTRAINT `transactions_customer_id_foreign` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
