-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Des 2018 pada 17.34
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(5) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL DEFAULT '',
  `notlp` varchar(255) DEFAULT NULL,
  `regdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `email`, `notlp`, `regdate`) VALUES
(4, 'don', '123', 'null', '087883983642', '2018-12-09'),
(5, 'ibrahim', 'ibra', 'null', '12344677678768', '2018-12-09');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `foto1` varchar(255) DEFAULT NULL,
  `foto2` varchar(255) DEFAULT NULL,
  `foto3` varchar(255) DEFAULT NULL,
  `foto4` varchar(255) DEFAULT NULL,
  `foto5` varchar(255) DEFAULT NULL,
  `des` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id`, `brand`, `kategori`, `nama`, `harga`, `foto1`, `foto2`, `foto3`, `foto4`, `foto5`, `des`) VALUES
(1, 'Razer', 'keyboard', 'hunstman', 2400000, 'rz.png', 'rz.png', 'rz.png', 'rz.png', 'rz.png', 'Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok  Alasan Kenapa berbelanja di GOODGAMINGSHOP : â?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita â?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS â?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya â?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),
(2, 'Corsair', 'keyboard', 'strapon', 2000000, 'cr.jpg', 'cr.jpg', 'cr.jpg', 'cr.jpg', 'cr.jpg', 'Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok  Alasan Kenapa berbelanja di GOODGAMINGSHOP : â?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita â?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS â?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya â?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),
(3, 'Corsair', 'Mouse', 'Dark Core RGB', 1500000, 'corsair-darkcore1.png', 'corsair-darkcore2.png', 'corsair-darkcore3.jpg', 'corsair-darkcore4.jpg', 'corsair-darkcore5.jpg', 'Corsair Dark Core RGB SE Performance Wired / Wireless Gaming Mouse with Qi" Wireless Charging.\r\nThe CORSAIR DARK CORE RGB SE gaming mouse uses an ultra-fast 1ms 2.4GHz wireless connection, Qi" wireless charging and a 16,000 DPI optical sensor for true wireless gaming.\r\n\r\nSpecifications:\r\nMouse Warranty: Two years\r\nProg Buttons: 9\r\nDPI: 16,000 DPI\r\nSensor: PMW3367\r\nSensor Type: Optical\r\nMouse Backlighting: 4 Zone RGB\r\nOn Board Memory: Yes\r\nOn-board Memory Profiles: 3\r\nMouse button Type: Omron\r\nConnectivity: Wireless, Wired\r\nMouse Button Durability: 50M L/R Click\r\nGrip Type: Palm\r\nCUE Software: Supported in CUE 2.0\r\nCable: 1.8m Braided Fiber\r\nGame Type: FPS, MOBA\r\nReport Rate: 1000Hz\r\nBattery Life: Up to 16hrs with standard lighting or 24hrs with backlighting off\r\nBattery Type: Rechargeable Lithium-Polymer\r\n\r\nCompatibility:\r\nPC with USB 2.0 port\r\nWindows 10, Windows 8, or Windows 7\r\nAn internet connection is required to download the Corsair Utility Engine software\r\n\r\nPackage Contents:\r\nDARK CORE RGB SE Gaming Mouse\r\nUSB charging and data cable\r\nUSB wireless transceiver\r\nUSB cable adapter\r\nOne additional side grip\r\nQuick start guide\r\nWarranty card '),
(134, 'Razer', 'keyboard', 'asdaas', 2321213, 'Login.jpg', '', '', '', '', 'asdsadsadsa'),
(224, 'Steelseries', 'headset', 'Arctis PRO', 4500000, 'pro1.png', 'pro2.png', 'pro3.png', '', '', 'Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok Alasan Kenapa berbelanja di GOODGAMINGSHOP : Ã¢?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita Ã¢?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS Ã¢?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya Ã¢?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),
(543, 'Logitech', 'headset', 'asdsa', 12321312, '2.jpeg', '', '', '', '', 'asdas'),
(556, 'Logitech', 'mouse', 'G502', 1200000, 'g5021.png', 'g5022.png', 'g5023.png', 'g5024.png', 'g5025.png', 'Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok Alasan Kenapa berbelanja di GOODGAMINGSHOP : Ã¢?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita Ã¢?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS Ã¢?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya Ã¢?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),
(557, 'Corsair', 'Mouse', 'Harpoon', 500000, 'CHarpoon_1.png', 'CHarpoon_2.png', 'CHarpoon_3.png', NULL, NULL, '<h3>COMFORTABLE, DURABLE, AND READY TO GAME</h3>\r\n\r\nThe HARPOON RGB mouse is built to perform, featuring a 6000 DPI optical gaming<br> sensor with advanced tracking for precise control and lightweight, contoured<br> design to support the quickest of movements.<br>\r\n'),
(558, 'Corsair', 'Keyboard', 'Corsair K95', 600000, 'CK 95.png', 'CK 95_.png', 'CK95 RGB.png', NULL, NULL, '100% mechanical switches, 18 G keys and RGB color per-key backlighting for unprecedented customization and control\r\n\r\nThe Corsair Gaming K95 RGB mechanical gaming keyboard begins with the performance of the legendary K95, and adds multicolor per-key backlighting for virtually unlimited customization. Every key is backed with a Cherry MX RGB key switch for precise actuation and superior feel. 122 full key rollover and 100% anti-ghosting ensure accurate gameplay, and the 18 G-keys can hold up to 108 macros for faster gaming.\r\n'),
(559, 'Steelseries', 'Keyboard', 'Apex M 500', 950000, 'Apexm500_1.png', 'Apexm500_2.png', 'Apexm500_3.png', NULL, NULL, ' <h3>Apex M500</h3>\r\n\r\nCherry MX Mechanical Gaming Switches<br>\r\nBlue LED Illumination<br>\r\n100% Programmable with SteelSeries Engine<br>'),
(560, 'Steelseries', 'Keyboard', 'Apex M750', 1000000, 'Apexm750_1.png', 'Apexm750_2.png', 'Apexm750_3.png', NULL, NULL, '<h3>Apex M750</h3>\r\n\r\nThe Apex M750 combines showstopping lighting effects and crucial in-game <br>notifications with sleek aluminum construction and durable SteelSeries QX2<br>mechanical switches.<br>\r\n\r\n<ul>\r\n\r\n    <li>Pure performance QX2 mechanical switches</li>\r\n    <li>Durable 5000 Series aluminum alloy</li>\r\n    <li>Real-time Discord lighting notifications</li>\r\n    <li>Brilliant and dynamic per-key RGB lighting</li>\r\n</ul>\r\n\r\nTop Material\r\n\r\n5000 Series Aluminum Alloy <br>\r\nN-Key Roll Over\r\n\r\n104-Key(All)<br>\r\nAnti-Ghosting\r\n\r\n100% <br>\r\nIllumination\r\n\r\nIndividually controllable per-key RGB, including whole-keyboard patterns, and reactive typing effects<br>\r\nWeight\r\n\r\n1?kg / 2.2?lbs<br>\r\nHeight\r\n\r\n153.5?mm / 6?inches<br>\r\nWidth\r\n\r\n454?mm / 17.9?inches<br>\r\nDepth\r\n\r\n46.7?mm / 1.8?inches<br>\r\nCable Length\r\n\r\n2?m / 6.5?ft<br>'),
(561, 'Corsair', 'Mouse', 'Scimitar', 1070000, 'CScimitar_1.png', 'CScimitar_2.png', 'CScimitar_3.png', NULL, NULL, 'The SCIMITAR RGB gaming mouse revolutionizes game play with its Key Slider™<br>control system, 12 mechanical side buttons, and pro-proven 12000 DPI <br>optical sensor. Purpose built to deliver the ultimate MOBA/MMO gaming experience. <br>\r\n\r\n\r\nMouse Warranty: \r\nTwo years <br>\r\nProg Buttons:\r\n17<br>\r\nDPI:\r\n12,000 DPI<br>\r\nSensor:\r\nSDNS-3988<br>\r\nSensor Type:\r\nOptical<br>\r\nMouse Backlighting: \r\n4 Zone RGB<br>\r\nOn Board Memory:\r\nYes<br>\r\nOn-board Memory Profiles:\r\nNo<br>\r\nMouse button Type:\r\nOmron<br>\r\nConnectivity:\r\nWired<br>\r\nMouse Button Durability:\r\n20M L/R Click<br>\r\nGrip Type:\r\nPalm<br>\r\nWeight Tuning:\r\nNo\r\n'),
(562, 'Logitech', 'Mouse', 'G102', 260000, 'G102_1.png', 'G102_2.png', 'G102_3.png', NULL, NULL, '\r\n<br>ISI KEMASAN:<br>\r\n\r\n    G102 Gaming Mouse<br>\r\n    Dokumentasi pengguna<br>\r\n    Jaminan perangkat keras terbatas 2 tahun<br>\r\n\r\n<br>Spesifikasi Fisik<br>\r\n\r\n    Tinggi: 116,6 mm<br>\r\n    Lebar: 62,15 mm<br>\r\n    Tebal: 38,2 mm<br>\r\n    Berat: 85 g, mouse saja<br>\r\n    Panjang kabel: 2,10 m<br>\r\n\r\n<br>PENELUSURAN<br>\r\n\r\n    Resolusi: 200 – 8.000 dpi<br>\r\n    Zero smoothing/akselerasi/filtering<br>\r\n    Maks. akselerasi: > 25 G2Diuji pada Logitech G240 Gaming Mouse Pad<br>\r\n    Maks. kecepatan: > 200 IPS3Diuji pada Logitech G240 Gaming Mouse Pad<br>\r\n\r\n<br>KETANGGAPAN<br>\r\n\r\n    Format data USB: 16 bit/axis<br>\r\n    Report rate USB: 1.000 Hz (1 md)<br>\r\n    Mikroprosesor: 32-bit ARM<br>\r\n');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `notelp` varchar(14) NOT NULL,
  `email` varchar(25) NOT NULL,
  `regdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `notelp`, `email`, `regdate`) VALUES
(1, 'admin', 'admin', '081234567831', 'admin@admin.com', '2018-12-09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `id_2` (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=563;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
