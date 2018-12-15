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
              <ul class="left hide-on-med-and-down">
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
              <li><%= cart.getNumOfItems() %></li>
              <li><a href="cart.jsp"></a></li>
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
            <form action="success.jsp" method="post">
            
                    <table class="responsive-table highlight">
                    <thead>
                    </thead>

                    <tbody>   
                      <tr>
                          <th></th>
                          <th>Name Item</th>
                          <th>Brand</th>
                          <th></th>
                          <th>Price</th>
                          <th>Qty</th>
                      </tr>
                      <%
                        Enumeration e = cart.getEnumeration();
                        String[] tmpItem;
                        while(e.hasMoreElements())
                        {
                          tmpItem=(String[])e.nextElement();
                        %>
                      <tr>
                        <td><img src="img/<%=tmpItem[6]%>" width="100px" height="100px"></td>
                        <td><%=tmpItem[1]%></td>
                        <td><%=tmpItem[4]%></td>
                        <td></td>
                        <th>Rp. <%=tmpItem[2]%></th>
                        <td>x <%=tmpItem[3]%></td>
                      </tr>
                        <%
                            }
                        %>
                      <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th>SubTotal  :</th>
                        <th>Rp. <%= cart.getCost() %></th>
                      </tr>
                       <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th>Ekspedisi  :</th>
                        <th> 
                            
                            <p>
                              <label>
                                <input type="radio" class="with-gap" name="ekspedisi" />
                                <span>Jne</span>
                              </label>
                            </p>
                            <p>
                              <label>
                                <input type="radio" class="with-gap" name="ekspedisi" />
                                <span>Tiki</span>
                              </label>
                            </p>
                            <p>
                              <label>
                                <input type="radio" class="with-gap" name="ekspedisi" />
                                <span>Sicepat</span>
                              </label>
                            </p>
                          

                        </th>
                      </tr>

                      <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th>Alamat :</th>
                        <th>

                          <input type="text" name="alamat">

                        </th>
                      </tr>

                    </tbody>
                  </table>
                  <a href="index.jsp" class="waves-effect waves-light btn red darken-2 center">Continue Shopping</a>
                    <%
                        if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
                    %>
                    <a class="waves-effect waves-light btn red darken-2 right" href="login.jsp">Checkout</a>
                    <%} else {
                    %>
                    <button class="waves-effect waves-light btn red darken-2 right" >Checkout</button>
                    <%
                        }
                    %>
            </form>
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