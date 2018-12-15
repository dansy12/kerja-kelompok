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
      <title>Form Login</title>
    </head>
    
    <body>
     <div id="home" class="navbar-fixed scrollspy">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="index.jsp" class="brand-logo center">GFE</a>
            <a href="index.jsp" data-target="mobile-nav" class="sidenav-trigger">
              <i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
          </div>
        </nav> 
      </div>

      <!-- side-nav -->
      <ul class="sidenav center" id="mobile-nav">
            <li><a class="waves-effect waves-light white darken-1 red-text">Login</a></li>
            <li><a class="waves-effect waves-light red white-text" href="signup.html">Sign Up</a></li>
      </ul>


      <section id="succes" class="succes grey lighten-4">
        <div class="row">
          <div class="col s12 m4 offset-m4">
            <div class="card-panel center satu">
                <%
                    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
                %>
                <h4>Registration Successfull</h4><br>
                <p>Click here to <a href="login.jsp">sign in</a></p>
                
                <%} else {
                %>
                <h4>Registration Unsuccessfull</h4>
                <%
                    }
                %>
            </div>
          </div>
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
