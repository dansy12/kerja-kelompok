package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class steelseries_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!-- My CSS -->\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\">\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("      <title>Gaming For Everyone</title>\n");
      out.write("    </head>  \n");
      out.write("      <body>\n");
      out.write("        <!-- navbar -->\n");
      out.write("      <div id=\"home\" class=\"navbar-fixed scrollspy\">\n");
      out.write("        <nav class=\"red darken-2\">\n");
      out.write("          <div class=\"nav-wrapper\">\n");
      out.write("            <a href=\"../index.html\" class=\"brand-logo center\">GFE</a>\n");
      out.write("            <a href=\"#home\" data-target=\"mobile-nav\" class=\"sidenav-trigger\">\n");
      out.write("              <i class=\"material-icons\">menu</i></a>\n");
      out.write("            <ul class=\"left hide-on-med-and-down\">\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("              <li><a href=\"cart.html\"><i class=\"material-icons\">shopping_cart</i></a></li>\n");
      out.write("              <li><a class=\"waves-effect waves-light btn red white-text\" href=\"../login.html\">Login</a></li>\n");
      out.write("              <li><a class=\"waves-effect waves-light btn white darken-1 red-text\" href=\"../signup.html\">Sign Up</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- side-nav -->\n");
      out.write("      <ul class=\"sidenav center\" id=\"mobile-nav\">\n");
      out.write("            <li><a class=\"waves-effect waves-light btn red white-text\" href=\"../login.html\">Login</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-light btn white darken-1 red-text\" href=\"../signup.html\">Sign Up</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <!-- slider -->\n");
      out.write("       <div class=\"slider\">\n");
      out.write("        <ul class=\"slides\">\n");
      out.write("            <li>\n");
      out.write("            <img src=\"../img/ss.png\"> <!-- random image -->\n");
      out.write("            <div class=\"caption left-align\">\n");
      out.write("              <h3 class=\"white-text text-darken-3\">STEELSERIES</h3>\n");
      out.write("              <h5 class=\"light black-text text-darken-3\">Aritcs Pro Wireless</h5>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Section Keyboard -->\n");
      out.write("    <section id=\"product\" class=\"product scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Keyboard</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../tampilan/Stampil.html\"><img src=\"../img/steelseries/k1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSries Apex M500</p>\n");
      out.write("              <a href=\"../tampilan/Stampil.html\">1.100.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../tampilan/Stampil1.html\"><img src=\"../img/steelseries/k4.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Apex M750 TKL</p>\n");
      out.write("              <a href=\"../tampilan/Stampil1.html\">1.200.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../tampilan/Stampil2.html\"><img src=\"../img/steelseries/k7.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Apex M750 TKL PUBG EDITION</p>\n");
      out.write("              <a href=\"../tampilan/Stampil2.html\">1.600.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../tampilan/Stampil3.html\"><img src=\"../img/steelseries/1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Apex M750</p>\n");
      out.write("              <a href=\"../tampilan/Stampil3.html\">1.500.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Section Mouse -->\n");
      out.write("    <section id=\"mouse\" class=\"mouse grey lighten-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Mouse</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../M_tampilan/sm1.html\"><img src=\"../img/M_steelseries/1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Rival 310 CS:GO EDITION</p>\n");
      out.write("              <a href=\"../M_tampilan/sm1.html\">1.300.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../M_tampilan/sm2.html\"><img src=\"../img/M_steelseries/m1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Rival 600</p>\n");
      out.write("              <a href=\"../M_tampilan/sm2.html\">1.450.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../M_tampilan/sm3.html\"><img src=\"../img/M_steelseries/m4.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Rival 700</p>\n");
      out.write("              <a href=\"../M_tampilan/sm3.html\">2.100.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../M_tampilan/sm4.html\"><img src=\"../img/M_steelseries/m7.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Rival 310 PUBG EDITION</p>\n");
      out.write("              <a href=\"../M_tampilan/sm4.html\">1.300.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Section Headset -->\n");
      out.write("    <section id=\"headset\" class=\"headset white lighten-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Headset</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../H_tampilan/sh1.html\"><img src=\"../img/H_steelseries/1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Artics Pro</p>\n");
      out.write("              <a href=\"../H_tampilan/sh1.html\">3.000.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../H_tampilan/sh2.html\"><img src=\"../img/H_steelseries/h1.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Artics 5 PUBG EDITION</p>\n");
      out.write("              <a href=\"../H_tampilan/sh2.html\">1.650.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../H_tampilan/sh3.html\"><img src=\"../img/H_steelseries/h4.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Artics 5</p>\n");
      out.write("              <a href=\"../H_tampilan/sh3.html\">1.300.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"col m3 s12\">\n");
      out.write("          <div class=\"card small\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <a href=\"../H_tampilan/sh4.html\"><img src=\"../img/H_steelseries/h7.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>SteelSeries Artics 7</p>\n");
      out.write("              <a href=\"../H_tampilan/sh4.html\">2.700.000</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Contact Us -->\n");
      out.write("    <section id=\"contact\" class=\"contact grey lighten-3 scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3 center\">Contact Us</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col m5 s12\">\n");
      out.write("            <div class=\"card-panel red darken-2 center white-text\">\n");
      out.write("              <i class=\"material-icons\">email</i>\n");
      out.write("              <h5>Alamat</h5>\n");
      out.write("              <p>BSD City\n");
      out.write("                  Ruko Bidex Blok A no. 23\n");
      out.write("                  (sebelah Mall Teraskota Serpong)\n");
      out.write("                  Lengkong Gudang - Serpong\n");
      out.write("                  Tangerang Selatan\n");
      out.write("                  15310</p>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"collection with-header\">\n");
      out.write("              <li class=\"collection-header\"><h4 class=\"center\">Contact</h4></li>\n");
      out.write("              <li class=\"collection-item\"> <i class=\"material-icons\">I</i> instagram:  @GFE_Gaming</li>\n");
      out.write("              <li class=\"collection-item\"><i class=\"material-icons\">T</i>  081211455647</li>\n");
      out.write("              <li class=\"collection-item\"><i class=\"material-icons\">F</i> Facebook : GFE_Gaming</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m7 s12\">\n");
      out.write("            <form>\n");
      out.write("              <div class=\"card-panel\">\n");
      out.write("                <h5>Please Fill Out This form</h5>\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"name\" required class=\"validate\">\n");
      out.write("                <label for=\"name\">Name</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\" class=\"validate\">\n");
      out.write("                <label for=\"email\">Email</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"text\" name=\"phone\" id=\"phone\" required class=\"validate\">\n");
      out.write("                <label for=\"phone\">Phone Number</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <textarea name=\"message\" id=\"message\" class=\"materialize-textarea\"></textarea>\n");
      out.write("                <label for=\"message\">Message</label>\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn red darken-2\">Send</button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("        <footer class=\"red darken-2 center white-text\">\n");
      out.write("          <p class=\"flow-text\"> Gaming For Everyone. Copyright 2018. </p>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      <!--JavaScript at end of body for optimized loading-->\n");
      out.write("      <script type=\"text/javascript\" src=\"../js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"../js/dropdown.js\"></script>\n");
      out.write("\n");
      out.write("      <script>\n");
      out.write("        const sideNav = document.querySelectorAll('.sidenav');\n");
      out.write("        M.Sidenav.init(sideNav);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        const slider = document.querySelectorAll('.slider');\n");
      out.write("        M.Slider.init(slider, {\n");
      out.write("          indicators: false,\n");
      out.write("          transition: 600,\n");
      out.write("          interval: 4000,\n");
      out.write("          height: 600\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        const parallax = document.querySelectorAll('.parallax');\n");
      out.write("        M.Parallax.init(parallax);\n");
      out.write("\n");
      out.write("\n");
      out.write("        const materialbox = document.querySelectorAll('.materialboxed');\n");
      out.write("        M.Materialbox.init(materialbox);\n");
      out.write("\n");
      out.write("\n");
      out.write("        const scroll = document.querySelectorAll('.scrollspy');\n");
      out.write("        M.ScrollSpy.init(scroll, {\n");
      out.write("          scrollOffset: 50\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("\n");
      out.write("      </script>\n");
      out.write("    </body>\n");
      out.write("  </html>\n");
      out.write("        ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
