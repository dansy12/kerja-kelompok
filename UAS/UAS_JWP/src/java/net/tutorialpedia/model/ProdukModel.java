package net.tutorialpedia.model;
 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author TutorialPedia.NET
 */
public class ProdukModel {
    String id, brand, kategori, nama, harga, foto1, foto2, foto3, foto4, foto5, des;
    KoneksiDB db = null;
 
    public ProdukModel() {
        db = new KoneksiDB();
    }
    
    public String getid() {
        return id;
    }
 
    public void setid(String id) {
        this.id = id;
    }
    
    public String getbrand() {
        return brand;
    }
 
    public void setbrand(String brand) {
        this.brand = brand;
    }
 
    public String getkategori() {
        return kategori;
    }
 
    public void setkategori(String kategori) {
        this.kategori = kategori;
    }
 
    public String getnama() {
        return nama;
    }
 
    public void setnama(String nama) {
        this.nama = nama;
    }
    
    public String getharga() {
        return harga;
    }
 
    public void setharga(String harga) {
        this.harga = harga;
    }
    
    public String getfoto1() {
        return foto1;
    }
 
    public void setfoto1(String foto1) {
        this.foto1 = foto1;
    }
    
    public String getfoto2() {
        return foto2;
    }
 
    public void setfoto2(String foto2) {
        this.foto2 = foto2;
    }
    
    public String getfoto3() {
        return foto3;
    }
 
    public void setfoto3(String foto3) {
        this.foto3 = foto3;
    }
    
    public String getfoto4() {
        return foto4;
    }
 
    public void setfoto4(String foto4) {
        this.foto4 = foto4;
    }
    
    public String getfoto5() {
        return foto5;
    }
 
    public void setfoto5(String foto5) {
        this.foto5 = foto5;
    }
    
    public String getdes() {
        return des;
    }
 
    public void setdes(String des) {
        this.des = des;
    }

    public List tampil() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang order by id asc";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
     public List tampilDenganId(String id){
          List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where id="+id;
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;   
     }
     
    public List tampilkeyboard() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where kategori = 'keyboard'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampilmouse() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where kategori = 'mouse'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampilheadset() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where kategori = 'headset'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampilsteelseries() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where brand = 'steelseries'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampillogitech() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where brand = 'logitech'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampilrazer() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where brand = 'razer'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
    
    public List tampilcorsair() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from barang where brand = 'corsair'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                ProdukModel pm = new ProdukModel();
                pm.setid(rs.getString("id"));
                pm.setbrand(rs.getString("brand"));
                pm.setkategori(rs.getString("kategori"));
                pm.setnama(rs.getString("nama"));
                pm.setharga(rs.getString("harga"));
                pm.setfoto1(rs.getString("foto1"));
                pm.setfoto2(rs.getString("foto2"));
                pm.setfoto3(rs.getString("foto3"));
                pm.setfoto4(rs.getString("foto4"));
                pm.setfoto5(rs.getString("foto5"));
                pm.setdes(rs.getString("des"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
}