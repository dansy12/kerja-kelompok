<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.tutorialpedia.model.ProdukModel"%>
<!DOCTYPE html>
<%-- 
    <jsp:useBean> utk memanipulasi objek di java
--%>
<jsp:useBean id="cart" scope="session" class="beans.ShoppingCart" />
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
      <title>Gaming For Everyone</title>
    </head>  
      <body 
        <!-- navbar -->
      <div id="home" class="navbar-fixed scrollspy">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="index.jsp" class="brand-logo center">GFE</a>
            <a href="index.jsp" data-target="mobile-nav" class="sidenav-trigger">
              <i class="material-icons">menu</i></a>
              <ul class="left hide-on-med-and-down">
              <li><a href="#clients">Brand</a></li>
              <li><a href="#product">Product</a></li>
              <li><a href="#contact">Contact Us</a></li>
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
              <li><%=            
                    cart.getNumOfItems()
                %></li>
              <li><a href="cart.jsp"></a></li>
            </ul>
          </div>
        </nav> 
      </div>


      <!-- side-nav -->
      <ul class="sidenav center" id="mobile-nav">
            <li><a href="#about">About Us</a></li>
            <li><a href="#clients">Brand</a></li>
            <li><a href="#services">Service</a></li>
            <li><a href="#product">Product</a></li>
            <li><a href="#contact">Contact Us</a></li>
            <li><a class="waves-effect waves-light btn red white-text" href="login.html">Login</a></li>
            <li><a class="waves-effect waves-light btn white darken-1 red-text" href="signup.html">Sign Up</a></li>
      </ul>

      <!-- slider -->
       <div class="slider">
        <ul class="slides">
          <li>
            <img src="img/lg.png"> <!-- random image -->
            <div class="caption center-align">
              <h3 class="blue-text">LOGITECH</h3>
              <h5 class="light blue-text text-darken-3">Gaming</h5>
            </div>
          </li>
          <li>
            <img src="img/rz.png"> <!-- random image -->
            <div class="caption right-align">
              <h3 class="green-text text-darken-3">RAZER</h3>
              <h5 class="light grey-text text-lighten-3">Hunstman</h5>
            </div>
          </li>
          <li>
            <img src="img/cr.jpg"> <!-- random image -->
            <div class="caption left-align">
              <h3 class="yellow-text text text-darken-3">CORSAIR</h3>
              <h5 class="light grey-text text-lighten-3">K70 RGB</h5>
            </div>
          </li>
          <li>
            <img src="img/ss.png"> <!-- random image -->
            <div class="caption left-align">
              <h3 class="white-text text-darken-3">STEELSERIES</h3>
              <h5 class="light black-text text-darken-3">Aritcs Pro Wireless</h5>
            </div>
          </li>
        </ul>
      </div>
      <!-- Search -->
      <section id="search" class="section section-search red darken-2
      white-text center scrollspy">
      <div class="container">
        <div class="row">
          <div class="col s12">
            <h3>Search Here</h3>
            <div class="input-field">
              <input type="text" id="autocomplete-input" 
              class="white black-text autocomplete">
            </div>
          </div>
          
        </div>
        
      </div>
        
      </section>

    <!-- CLient Parallax -->

    <div id="clients" class="parallax-container scrollspy">
      <div class="parallax"><img src="img/Login.jpg"></div>

      <div class="container clients">
        <h3 class="center light white-text">Brand</h3>
        <div class="row">
          <div class="col m3 s12 center">
              <a href="logitech.jsp"><img src="img/Clients/logitech.png" href=""></a>
          </div>
          <div class="col m3 s12 center">
              <a href="steelseries.jsp"><img src="img/Clients/steelseries.png"> </a>
          </div>
          <div class="col m3 s12 center">
              <a href="corsair.jsp"><img src="img/Clients/corsair.png"> </a>
          </div>
          <div class="col m3 s12 center">
              <a href="razer.jsp"><img src="img/Clients/razer.png"></a>
          </div>
        </div>
      </div>
    </div>

    <!-- Section brand -->
    <section id="product" class="product scrollspy">
      <div class="container">
        <h3 class="light grey-text text-darken-3">Steelseries</h3>
        <div class="row">
                    <%
                        ProdukModel pm = new ProdukModel();
                        List<ProdukModel> data = new ArrayList<ProdukModel>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                            data = pm.tampilsteelseries();
                        }
                        for (int x = 0; x < data.size(); x++) {
                    %>
            <div class="col m3 s12">
              <div class="card small">
                <div class="card-image">
                    <form action="steelseries.jsp" method="post">
                        <a href="tampilan/tampil.html"><img src="img/<%=data.get(x).getfoto1()%>" width="300px" height="150px"></a>
                        </div>
                        <div class="card-content">
                          <p><%=data.get(x).getbrand()%>&nbsp;<%=data.get(x).getnama()%></p> 
                          <a href="tampilan/tampil.html">Rp. <%=data.get(x).getharga()%></a>
                          <input type="hidden" name="id" value="<%=data.get(x).getid()%>">
                          <input type="hidden" name="nama" value="<%=data.get(x).getnama()%>">
                          <input type="hidden" name="foto" value="<%=data.get(x).getfoto1()%>">
                          <input type="hidden" name="price" value="<%=data.get(x).getharga()%>">
                          <input type="hidden" name="brand" value="<%=data.get(x).getbrand()%>">
                          <input type="hidden" name="kategori" value="<%=data.get(x).getkategori()%>"><br><br>
                          <input type="submit" name="Submit" value="Add">
                        </div>
                    </form>
              </div>
            </div>
                <% }%>
        </div>               
      </div>
    </section>

    <!-- Contact Us -->
    <section id="contact" class="contact grey lighten-3 scrollspy">
      <div class="container">
        <h3 class="light grey-text text-darken-3 center">Contact Us</h3>
        <div class="row">
          <div class="col m6 s14">
            <div class="card-panel red darken-2 center white-text">
              <i class="material-icons">email</i>
              <h5>Alamat</h5>
              <p>BSD City
                  Ruko Bidex Blok A no. 23
                  (sebelah Mall Teraskota Serpong)
                  Lengkong Gudang - Serpong
                  Tangerang Selatan
                  15310</p>
            </div>
            
          </div>
          <div class="col m6 s12">
              <center>
            <ul class="collection with-header">
                <li class="collection-item"> <img src="img/instagram.png" width="30" height="30"><br>@GFE_Gaming</li>
              <li class="collection-item"><img src="img/wa.jpg" width="30" height="30"><br>081211455647</li>
              <li class="collection-item"><img src="img/facebook.png" width="30" height="30"><br>GFE_Gaming</li>
            </ul>
                  </center>
          </div>
        </div>
      </div>
    </section>

    <!-- Footer -->
        <footer class="red darken-2 center white-text">
          <p class="flow-text"> Gaming For Everyone. Copyright 2018. </p>
        </footer>
        

      <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript" src="js/dropdown.js"></script>

      <script>
        const sideNav = document.querySelectorAll('.sidenav');
        M.Sidenav.init(sideNav);



        const slider = document.querySelectorAll('.slider');
        M.Slider.init(slider, {
          indicators: false,
          transition: 600,
          interval: 4000,
          height: 600
        });

        const parallax = document.querySelectorAll('.parallax');
        M.Parallax.init(parallax);


        const materialbox = document.querySelectorAll('.materialboxed');
        M.Materialbox.init(materialbox);


        const scroll = document.querySelectorAll('.scrollspy');
        M.ScrollSpy.init(scroll, {
          scrollOffset: 50
        });
        

      </script>
    </body>
  </html>
        