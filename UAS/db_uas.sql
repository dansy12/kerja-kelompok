# Host: localhost  (Version 5.5.5-10.1.36-MariaDB)
# Date: 2018-12-10 00:28:36
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "admin"
#

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL DEFAULT '',
  `notlp` varchar(255) DEFAULT NULL,
  `regdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "admin"
#

INSERT INTO `admin` VALUES (4,'don','123','null','087883983642','2018-12-09'),(5,'ibrahim','ibra','null','12344677678768','2018-12-09');

#
# Structure for table "barang"
#

DROP TABLE IF EXISTS `barang`;
CREATE TABLE `barang` (
  `id` varchar(225) NOT NULL DEFAULT '',
  `brand` varchar(255) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `foto1` varchar(255) DEFAULT NULL,
  `foto2` varchar(255) DEFAULT NULL,
  `foto3` varchar(255) DEFAULT NULL,
  `foto4` varchar(255) DEFAULT NULL,
  `foto5` varchar(255) DEFAULT NULL,
  `des` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "barang"
#

INSERT INTO `barang` VALUES ('1','Razer','keyboard','hunstman',2400000,'rz.png','rz.png','rz.png','rz.png','rz.png','Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok  Alasan Kenapa berbelanja di GOODGAMINGSHOP : â?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita â?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS â?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya â?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),('134','Razer','keyboard','asdaas',2321213,'Login.jpg','','','','','asdsadsadsa'),('2','Corsair','keyboard','strapon',2000000,'cr.jpg','cr.jpg','cr.jpg','cr.jpg','cr.jpg','Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok  Alasan Kenapa berbelanja di GOODGAMINGSHOP : â?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita â?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS â?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya â?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),('224','Steelseries','headset','Arctis PRO',4500000,'pro1.png','pro2.png','pro3.png','','','Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok Alasan Kenapa berbelanja di GOODGAMINGSHOP : Ã¢?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita Ã¢?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS Ã¢?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya Ã¢?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~'),('543','Logitech','headset','asdsa',12321312,'2.jpeg','','','','','asdas'),('556','Logitech','mouse','G502',1200000,'g5021.png','g5022.png','g5023.png','g5024.png','g5025.png','Hi , silahkan di order barangnya . info untuk calon pembeli GGS mempunyai standart packingan yang baik dengan lapisan bubble wrap free untuk pembeli . Ada kala nya cabang expedisi daerah pengantaran anda agak sedikit kasar , untuk benar2 menjaga kebaikan bentuk box barang saran kami gunakan extra bubble : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-bubble-wrap extra kardus : https://www.tokopedia.com/goodgamingm2m/ekstra-packaging-kardus kami sangat ingin barang anda sampai tujuan mulus tanpa penyok Alasan Kenapa berbelanja di GOODGAMINGSHOP : Ã¢?? Kita adalah TOKO STOCK bukan Dropshipper / CALO barang ,sehingga barang langsung di kirim dari Gudang Kita Ã¢?? Karena stockist proses pengurusan Garansi / After Sales akan jauh lebih tercontrol dari pihak GGS Ã¢?? Kita mempunyai layanan 1 pintu untuk urusan garansi / servican . After sales akan sangat terjamin ketepatannya Ã¢?? Kita Tidak hanya menjual barang baru , kita mempunyai layanan garansi , layanan rakit PC , pembelian barang Bekas ONE STOP SOLUTION FOR YOUR MAXIMUM SHOPPING GAMING GEAR EXPERIENCE ~');
