<%-- 
    Document   : simpan
    Created on : Oct 12, 2018, 5:22:22 PM
    Author     : Praktek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jdbc.koneksi"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
         <%
            String id=request.getParameter("txtid");
            String brand=request.getParameter("txtbrand");
            String kategori=request.getParameter("txtkategori");
            String nama=request.getParameter("txtnama");
            String harga=request.getParameter("txtharga");
            String foto1=request.getParameter("txtfoto1");
            String foto2=request.getParameter("txtfoto2");
            String foto3=request.getParameter("txtfoto3");
            String foto4=request.getParameter("txtfoto4");
            String foto5=request.getParameter("txtfoto5");
            String des=request.getParameter("txtdes");
            String dapat=request.getParameter("cmdsimpan");
            if(dapat.toString().equals("simpan"))
            {
                try
                    {
                        koneksi konek=new koneksi();
                        Connection conn=konek.bukaKoneksi();
                        Statement st=conn.createStatement();
                        String sql="insert into barang(id, brand, kategori, nama, harga, foto1, foto2, foto3, foto4, foto5, des)" +
                        "values('"+id+"','"+brand+"','"+kategori+"','"+nama+"','"+harga+"','"+foto1+"','"+foto2+"','"+foto3+"','"+foto4+"','"+foto5+"','"+des+"')";
                        st.executeUpdate(sql);
                        conn.close();
                        out.print("berhasil disimpan");
                        out.print("&nbsp;<a href='index.jsp'>Kembali</a>");
                    }
                catch(Exception e)
                {
                    out.print(e);
                }
            }
            
            else if(dapat.toString().equals("cari"))
                {
                    try
                    {
                        koneksi konek=new koneksi();
                        Connection conn=konek.bukaKoneksi();
                        Statement st=conn.createStatement();
                        String sql="select*from barang where id='"+id+"'";
                        ResultSet res=st.executeQuery(sql);
                        if(res.next())
                        {
                        %>
                        <div class="row">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                  <!-- Brand and toggle get grouped for better mobile display -->
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Home</a>
                  </div>

                  <!-- Collect the nav links, forms, and other content for toggling -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                      <li><a href="#">Data Siswa <span class="sr-only">(current)</span></a></li>
                      <li><a href="#">Data Guru</a></li>
                    </ul>
                  </div>
                </div>
            </nav>
        </div>
                        <div class="row">
                            <div class="col-md-3"></div>
                            <div class="col-md-6">
                                <div class="well well-lg">
                                    <form action="simpan.jsp" method='post'>
                                        <div class="form-group">
                                <label for="exampleFormControlInput1">ID</label>
                                <input type="text" class="form-control" name="txtid" placeholder="Masukan ID" value="<%=res.getString(1)%>">
                            </div>
                            <div class="form-group">
                            <label for="exampleFormControlInput1">Brand</label>
                                <select class="form-control" id="exampleFormControlSelect1" name="txtbrand" value="<%=res.getString(2)%>">
                                <option value="Steelseries">Steelseries</option>
                                <option value="Razer">Razer</option>
                                <option value="Corsair">Corsair</option>
                                <option value="Logitech">Logitech</option>
                                </select>
                            </div><br>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Kategori</label>
                                <select class="form-control" id="exampleFormControlSelect1" name="txtkategori" value="<%=res.getString(3)%>">
                                <option value="keyboard">keyboard</option>
                                <option value="mouse">mouse</option>
                                <option value="headset">headset</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Nama</label>
                                <input type="text" class="form-control" name="txtnama" placeholder="Masukan Nama" value="<%=res.getString(4)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Harga</label>
                                <input type="text" class="form-control" name="txtharga" placeholder="Masukan Harga" onkeypress="return angka(event)" value="<%=res.getString(5)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto1</label>
                                <input type="file" name="txtfoto1" class="form-control" value="<%=res.getString(6)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto2</label>
                                <input type="file" name="txtfoto2" class="form-control" value="<%=res.getString(7)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto3</label>
                                <input type="file" name="txtfoto3" class="form-control" value="<%=res.getString(8)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto4</label>
                                <input type="file" name="txtfoto4" class="form-control" value="<%=res.getString(9)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto5</label>
                                <input type="file" name="txtfoto5" class="form-control" value="<%=res.getString(10)%>">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Deskripsi</label>
                                <input type="text" class="form-control" name="txtdes" placeholder="Masukan Deskripsi"  value="<%=res.getString(11)%>">
                            </div>
                                                <input type="submit" class="btn btn-info" value="simpan" name="cmdsimpan">
                                                <input type="submit" class="btn btn-info" value="ubah" name="cmdsimpan">
                                                <input type="submit" class="btn btn-info" value="hapus" name="cmdsimpan">
                                                <a href='index.jsp'><input type="button"  class="btn btn-danger" value="kembali"></a>

                                    </form>
                                </div>       
                            </div>
                            <div class="col-md-3"></div>
                        </div>           
                         <%
                        }   
                    }       
               catch (Exception e)
            {
               out.print(e);
            }
            }
            
          else if (dapat.toString().equals("ubah"))
            { 
                try
            { 
                koneksi konek = new koneksi();
                Connection conn = konek.bukaKoneksi();
                Statement st = conn.createStatement();
                String sql ="update barang set brand ='"+brand+"', kategori ='"+kategori+"', nama ='"+nama+"', harga ='"+harga+"', foto1 ='"+foto1+"', foto2 ='"+foto2+"', foto3 ='"+foto3+"', foto4 ='"+foto4+"', foto5 ='"+foto5+"', des ='"+des+"',"
                + "where id = '"+id+"'";
                st.executeUpdate(sql);
                conn.close();
                out.print("Berhasil di ubah");
                out.print("&nbsp;<a href='index.jsp'>Kembali</a>");
            }
         catch(Exception e)
        {
        out.print(e);
    }
}
         else if (dapat.toString().equals("hapus"))
            { 
                try
            { 
                koneksi konek = new koneksi();
                Connection conn = konek.bukaKoneksi();
                Statement st = conn.createStatement();
                String sql ="delete from barang where id ='"+id+"'";
                st.executeUpdate(sql);
                conn.close();
                out.print("Berhasil di hapus");
                out.print("&nbsp;<a href='index.jsp'>Kembali</a>");
            }
         catch(Exception e)
        {
        out.print(e);
    }
}
                
%>
    </body>
</html>
