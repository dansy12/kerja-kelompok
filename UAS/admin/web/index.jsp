<%-- 
    Document   : index
    Created on : Oct 12, 2018, 4:38:11 PM
    Author     : Praktek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jdbc.koneksi"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
                        <form  method="post" action="simpan.jsp">
                            <div class="form-group">
                                <label for="exampleFormControlInput1">ID</label>
                                <input type="text" class="form-control" name="txtid" placeholder="Masukan ID">
                            </div>
                            <div class="form-group">
                            <label for="exampleFormControlInput1">Brand</label>
                                <select class="form-control" id="exampleFormControlSelect1" name="txtbrand">
                                <option value="Steelseries">Steelseries</option>
                                <option value="Razer">Razer</option>
                                <option value="Corsair">Corsair</option>
                                <option value="Logitech">Logitech</option>
                                </select>
                            </div><br>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Kategori</label>
                                <select class="form-control" id="exampleFormControlSelect1" name="txtkategori">
                                <option value="keyboard">keyboard</option>
                                <option value="mouse">mouse</option>
                                <option value="headset">headset</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Nama</label>
                                <input type="text" class="form-control" name="txtnama" placeholder="Masukan Nama">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Harga</label>
                                <input type="text" class="form-control" name="txtharga" placeholder="Masukan Harga" onkeypress="return angka(event)">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto1</label>
                                <input type="file" name="txtfoto1" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto2</label>
                                <input type="file" name="txtfoto2" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto3</label>
                                <input type="file" name="txtfoto3" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto4</label>
                                <input type="file" name="txtfoto4" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Foto5</label>
                                <input type="file" name="txtfoto5" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Deskripsi</label>
                                <input type="text" class="form-control" name="txtdes" placeholder="Masukan Harga">
                            </div>
                                    <input type="submit" class="btn btn-info" value="simpan" name="cmdsimpan">
                                    <input type="submit" class="btn btn-info" value="ubah" name="cmdsimpan">
                                    <input type="submit" class="btn btn-info" value="hapus" name="cmdsimpan">
                                    <input type="reset"  class="btn btn-danger" value="batal" name="cmdsimpan">
                                    <input type="submit"  class="btn btn-info" value="cari" name="cmdsimpan">
                        </form>
                        </div>
                </div>
                <div class="col-md-3"></div>\
                <div class="row"></div>
                <div class="col-md-12">
                        <table align="center" class="table table-striped"z>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">brand</th>
                            <th scope="col">kategori</th>
                            <th scope="col">nama</th>
                            <th scope="col">harga</th>
                            <th scope="col">foto1</th>
                            <th scope="col">foto2</th>
                            <th scope="col">foto3</th>
                            <th scope="col">foto4</th>
                            <th scope="col">foto5</th>
                            <th scope="col">deskripsi</th>
                        </tr>
                         <%
                             try
                                {
                                    koneksi konek=new koneksi();
                                    Connection conn=konek.bukaKoneksi();
                                    Statement st=conn.createStatement();
                                    String sql="select*from barang";
                                    ResultSet res=st.executeQuery(sql);
                                    while(res.next())
                                    {

                        %>
                        <tr>
                            <td scope="col"><% out.print(res.getString("id")); %></td>
                            <td scope="col"><% out.print(res.getString("brand")); %></td>
                            <td scope="col"><% out.print(res.getString("kategori")); %></td>
                            <td scope="col"><% out.print(res.getString("nama")); %></td>
                            <td scope="col"><% out.print(res.getString("harga")); %></td>
                            <td scope="col"><img width="200px" src="img/<% out.print(res.getString("foto1")); %>"></td>
                            <td scope="col"><img width="200px" src="img/<% out.print(res.getString("foto2")); %>"></td>
                            <td scope="col"><img width="200px" src="img/<% out.print(res.getString("foto3")); %>"></td>
                            <td scope="col"><img width="200px" src="img/<% out.print(res.getString("foto4")); %>"></td>
                            <td scope="col"><img width="200px" src="img/<% out.print(res.getString("foto5")); %>"></td>
                            <td scope="col"><% out.print(res.getString("des")); %></td>
                        </tr>

                        <%
                                    }
                        }
                           catch (Exception e)
                        {
                           out.print(e);
                        }

                         %>
                    </table>
                    </div>

            </div>
            <script>
                function angka(evt){
                    var charCode = (evt.which) ? evt.which : event.keyCode
                    if (charCode > 31 && (charCode < 48 || charCode > 57))

                        return false;
                    return true;
        }

                </script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>