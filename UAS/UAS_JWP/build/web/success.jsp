<%-- 
    Document   : success
    Created on : Dec 10, 2018, 11:15:52 PM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<jsp:useBean id="cart" scope="session" class="beans.ShoppingCart"/>
 <!DOCTYPE html>
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
    <title>Success</title>
    <body>

     <div id="home" class="navbar-fixed scrollspy">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="index.jsp" class="brand-logo center">GFE</a>
            <a href="index.jsp" data-target="mobile-nav" class="sidenav-trigger">
              <i class="material-icons">menu</i></a>
              <ul class="left hide-on-med-and-down">
            </ul>
            <ul class="right hide-on-med-and-down">
                <%
                    String id = request.getParameter("id");
                    if(id!=null)
                    {
                        String brand = request.getParameter("brand");
                        Float price = new Float(request.getParameter("price"));
                        String kategori = request.getParameter("kategori");
                        String nama = request.getParameter("nama");
                        String foto = request.getParameter("foto");
                        cart.addItem(id, nama, price.floatValue(), 1, brand, kategori, foto );
                    }
                %>       
                    <%
                        if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
                    %>
                    <li><a class="waves-effect waves-light btn white darken-1 red-text" href="signup.jsp">Sign Up</a></li>
                    <li><a class="waves-effect waves-light btn red white-text" href="login.jsp">Sign In</a></li>
                    <%} else {
                    %>
                    <li class="active">
                        <%
                            if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
                        %>

                        <%} else {
                        %>
                        &nbsp;Hello
                        <%=session.getAttribute("userid")%>&nbsp;
                        <%
                            }
                        %>
                    </li>
                    <li><a class="waves-effect waves-light btn red white-text" href="logout.jsp">Sign Out</a></li>
                    <%
                        }
                    %>
              <li><a href="cart.jsp"><i class="material-icons">shopping_cart</i></a></li>
              <li><%= cart.getNumOfItems() %></li>
              <li><a href="cart.jsp"></a></li>
            </ul>
          </div>
        </nav> 
      </div>

      <!-- side-nav -->
      <ul class="sidenav center" id="mobile-nav">
          <li><a class="waves-effect waves-light white darken-1 red-text" href="login.jsp">Login</a></li>
            <li><a class="waves-effect waves-light red white-text" href="signup.jsp">Sign Up</a></li>
      </ul>


      <!-- Form Login -->
      <section id="succes" class="succes grey lighten-4">
        <div class="row">
          <div class="col s12 m4 offset-m4">
            <div class="card-panel center satu">
              <form>
              <h4>Order Successfull.</h4>
              <p>Silahkan Transfer Ke Rekening yang tertera di bawah</p>
              <img src="img/bca.png">
              <p>1234567890<br>A/N PT. GFE</p>
              <img src="img/mandiri.png">
              <p>1234567890054326<br>A/N PT. GFE</p>
              <img src="img/bri.png">
              <p>123456789025<br>A/N PT. GFE</p>
              </form>
            </div>
          </div>
        </div>
        <a class="waves-effect waves-light btn-small red center" href="index.jsp">Continue Shopping</a>
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
