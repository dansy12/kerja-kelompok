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
    <title>Form Login</title>
    <body>

     <div class="navbar-fixed">
        <nav class="red darken-2">
          <div class="nav-wrapper">
            <a href="index.jsp" class="brand-logo">GFE</a>
            <a href="index.jsp" data-target="mobile-nav" class="sidenav-trigger">
              <i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
              <li><a class="waves-effect waves-light btn white red-text" href="login.jsp">Sign In</a></li>
              <li><a class="waves-effect waves-light btn red white-text" href="signup.jsp">Sign Up</a></li>
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
      <section id="login" class="login grey lighten-4">
            <form method="post" action="loginproses.jsp">
              <div class="row">
                <div class="col s12 m4 offset-m4">
                  <div class="card-panel center satu">
                    <i class="material-icons medium red-text">exit_to_app</i>
                    <div class="input-field">
                        <%
                        if ((session.getAttribute("password") == null) || (session.getAttribute("password") == "")) {
                        %>
                        
                        <%} else {
                        %>
                        password salah atau registrasi terlebih dahulu.
                        <%
                            }
                        %>
                    </div>
                    <div class="input-field">
                      <input type="text" name="username" id="name" required class="validate">
                      <label for="name">Username/E-mail</label>
                    </div>
                    <div class="input-field">
                      <input type="password" name="password" id="password" required class="validate">
                      <label for="password">Password</label>
                    </div>
                   <input type="submit" class="waves-effect waves-light btn red white-text submit"  value="Sign In" />
                    <p>Not a member yet? <a href="signup.jsp">Get a GFE account</a></p>
                  </div>
                </div>
              </div>
             </form>
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