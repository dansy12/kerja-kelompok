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
      <link type="text/css" rel="stylesheet" href="../css/materialize.min.css"  media="screen,projection"/>

      <!-- My CSS -->
      <link rel="stylesheet" type="text/css" href="../css/style.css">

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      <title>Gaming For Everyone</title>
    </head>  
      <body>
        <!-- navbar -->
      <div id="home" class="navbar-fixed scrollspy">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="../index.html" class="brand-logo center">GFE</a>
            <a href="#home" data-target="mobile-nav" class="sidenav-trigger">
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
               <li><a class="waves-effect waves-light btn red white-text" href="login.html">Login</a></li>
              <li><a class="waves-effect waves-light btn white darken-1 red-text" href="signup.html">Sign Up</a></li>
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
            <li><a class="waves-effect waves-light btn red white-text" href="../login.html">Login</a></li>
            <li><a class="waves-effect waves-light btn white darken-1 red-text" href="../signup.html">Sign Up</a></li>
      </ul>

      <!-- slider -->
       <div class="slider">
        <ul class="slides">
            <li>
            <img src="../img/ss.png"> <!-- random image -->
            <div class="caption left-align">
              <h3 class="white-text text-darken-3">STEELSERIES</h3>
              <h5 class="light black-text text-darken-3">Aritcs Pro Wireless</h5>
            </div>
          </li>
        </ul>
      </div>


    <!-- Section brand -->
    <section id="product" class="product scrollspy">
      <div class="container">
        <h3 class="light grey-text text-darken-3">Keyboard</h3>
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
                    <form action="index.jsp" method="post">
                        <a href="tampilan/tampil.html"><img src="img/<%=data.get(x).getfoto1()%>" width="300px" height="150px"></a>
                        </div>
                        <div class="card-content">
                          <p><%=data.get(x).getnama()%></p>
                          <a href="tampilan/tampil.html"><%=data.get(x).getharga()%></a>
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
        <a class="waves-effect waves-light btn red darken-2" href="key.jsp">View All</a>
      </div>
    </section>

    <!-- Contact Us -->
    <section id="contact" class="contact grey lighten-3 scrollspy">
      <div class="container">
        <h3 class="light grey-text text-darken-3 center">Contact Us</h3>
        <div class="row">
          <div class="col m5 s12">
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
            <ul class="collection with-header">
              <li class="collection-header"><h4 class="center">Contact</h4></li>
              <li class="collection-item"> <i class="material-icons">I</i> instagram:  @GFE_Gaming</li>
              <li class="collection-item"><i class="material-icons">T</i>  081211455647</li>
              <li class="collection-item"><i class="material-icons">F</i> Facebook : GFE_Gaming</li>
            </ul>
          </div>
          <div class="col m7 s12">
            <form>
              <div class="card-panel">
                <h5>Please Fill Out This form</h5>
                <div class="input-field">
                <input type="text" name="name" id="name" required class="validate">
                <label for="name">Name</label>
              </div>
              <div class="input-field">
                <input type="email" name="email" id="email" class="validate">
                <label for="email">Email</label>
              </div>
              <div class="input-field">
                <input type="text" name="phone" id="phone" required class="validate">
                <label for="phone">Phone Number</label>
              </div>
              <div class="input-field">
                <textarea name="message" id="message" class="materialize-textarea"></textarea>
                <label for="message">Message</label>
              </div>
              <button type="submit" class="btn red darken-2">Send</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>

    <!-- Footer -->
        <footer class="red darken-2 center white-text">
          <p class="flow-text"> Gaming For Everyone. Copyright 2018. </p>
        </footer>
        

      <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="../js/materialize.min.js"></script>
      <script type="text/javascript" src="../js/dropdown.js"></script>

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
        