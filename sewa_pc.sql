-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Jan 2023 pada 14.09
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewa_pc`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `id_customer` varchar(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jk` enum('Laki laki','Perempuan') NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`id_customer`, `nama`, `jk`, `telp`) VALUES
('C1', 'Gina', 'Perempuan', '081122334444'),
('C2', 'Aldi', 'Laki laki', '0811'),
('C3', 'Ade', 'Laki laki', '0822'),
('C4', 'Nadia', 'Perempuan', '081122'),
('C5', 'Agus', 'Laki laki', '088765');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pc`
--

CREATE TABLE `pc` (
  `id_pc` varchar(11) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `model` varchar(100) NOT NULL,
  `specification` varchar(255) NOT NULL,
  `rental_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pc`
--

INSERT INTO `pc` (`id_pc`, `brand`, `model`, `specification`, `rental_price`) VALUES
('PC1', 'Dell', 'Inspiron 15', 'Intel Core i5, 8GB RAM', 100000),
('PC2', 'Acer', 'Aspire VX15', 'Intel Core i7, 16GB RAM', 120000),
('PC3', 'Lenovo', 'Ideapad 330', 'Intel Core i3, 4GB RAM', 80000),
('PC4', 'HP', 'Pavilion 15', 'Intel Core i5, 8GB RAM', 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `rental`
--

CREATE TABLE `rental` (
  `id_rental` varchar(11) NOT NULL,
  `id_customer` varchar(11) NOT NULL,
  `id_pc` varchar(11) NOT NULL,
  `tanggal_rental` date NOT NULL,
  `tanggal_kembali` date NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `rental`
--

INSERT INTO `rental` (`id_rental`, `id_customer`, `id_pc`, `tanggal_rental`, `tanggal_kembali`, `harga`) VALUES
('R01', 'C1', 'PC1', '2023-01-10', '2023-01-11', 100000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indeks untuk tabel `pc`
--
ALTER TABLE `pc`
  ADD PRIMARY KEY (`id_pc`);

--
-- Indeks untuk tabel `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`id_rental`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_pc` (`id_pc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
