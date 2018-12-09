<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<jsp:useBean id="cart" scope="session" class="beans.ShoppingCart"/>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

       <!-- My CSS -->
      <link rel="stylesheet" type="text/css" href="css/style.css">

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <title>Form Login</title>
    <body>

     <div class="navbar-fixed">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="index.jsp" class="brand-logo">GFE</a>
            <a href="index.html" data-target="mobile-nav" class="sidenav-trigger">
              <i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
              <li><a class="waves-effect waves-light btn white red-text">Login</a></li>
              <li><a class="waves-effect waves-light btn red white-text" href="signup.html">Sign Up</a></li>
            </ul>
          </div>
        </nav>
      </div>

      <!-- side-nav -->
      <ul class="sidenav center" id="mobile-nav">
            <li><a class="waves-effect waves-light white darken-1 red-text">Login</a></li>
            <li><a class="waves-effect waves-light red white-text" href="signup.html">Sign Up</a></li>
      </ul>


      <!-- Shopping Cart -->
       <section id="about" class="about scrollspy">
        <div class="container">
            <center>
            <table class="table">
                <thead class="lighten-4">
                  <tr>
                    <th align="center">Foto</th>
                        <th align="center">Brand</th>
                        <th align="center">Kategori</th>
                        <th align="center">Nama</th>
                        <th align="center">Harga</th>
                        <th align="center">Jumlah</th>
                  </tr>
                </thead>
                <tbody>
                  <%
                        Enumeration e = cart.getEnumeration();
                        String[] tmpItem;
                        while(e.hasMoreElements())
                        {
                          tmpItem=(String[])e.nextElement();
                    %>
                    
                    <tr>
                        <td align="center"><img src="img/<%=tmpItem[6]%>" width="100px" height="100px"></td>
                        <td align="center"><%=tmpItem[4]%></td>
                        <td align="center"><%=tmpItem[5]%></td>
                        <td align="center"><%=tmpItem[1]%></td>
                        <td align="center"><%=tmpItem[2]%></td>
                        <td align="center"><%=tmpItem[3]%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            </center><BR><BR>
            <a href="index.jsp" class="waves-effect waves-light btn red darken-2 center">Continue Shopping</a>
        </div>   
        </section>
     
      <footer class="red darken-2 center white-text">
          <p class="flow-text"> Gaming For Everyone. Copyright 2018. </p>
        </footer>

      <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="js/materialize.min.js"></script>

      <script>
        const sideNav = document.querySelectorAll('.sidenav');
        M.Sidenav.init(sideNav);


      </script>


    </body>
  </html>