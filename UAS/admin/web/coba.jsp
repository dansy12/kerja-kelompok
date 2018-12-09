<%-- 
    Document   : coba
    Created on : Dec 7, 2018, 11:39:11 AM
    Author     : donsa
--%>
<%@page import="jdbc.koneksi"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
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
            <div class="row">
                <form  method="post" action="tampil.jsp">
                    <input type="hidden" name="id" value="<% out.print(res.getString("id")); %>">
                <div class="col-md-4">
                  <div class="thumbnail">
                    <img src="img/<% out.print(res.getString("foto1")); %>" alt="...">
                    <input type="hidden" name="id" value="<% out.print(res.getString("foto1")); %>">
                    <div class="caption">
                      <h3><% out.print(res.getString("nama")); %></h3>
                      <input type="hidden" name="id" value="<% out.print(res.getString("nama")); %>">
                      <p><% out.print(res.getString("des")); %></p>
                      <input type="hidden" name="id" value="<% out.print(res.getString("des")); %>">
                      <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
                    </div>
                      <input type="submit"  class="btn btn-info" value="cari" name="cmdsimpan">
                  </div>
                </div>
                </form>
            </div>
                                <%
                                    }
                        }
                           catch (Exception e)
                        {
                           out.print(e);
                        }

                         %>
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
