package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import net.tutorialpedia.model.ProdukModel;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      beans.ShoppingCart cart = null;
      synchronized (session) {
        cart = (beans.ShoppingCart) _jspx_page_context.getAttribute("cart", PageContext.SESSION_SCOPE);
        if (cart == null){
          cart = new beans.ShoppingCart();
          _jspx_page_context.setAttribute("cart", cart, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!-- My CSS -->\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("      <title>Gaming For Everyone</title>\n");
      out.write("    </head>  \n");
      out.write("      <body \n");
      out.write("        <!-- navbar -->\n");
      out.write("      <div id=\"home\" class=\"navbar-fixed scrollspy\">\n");
      out.write("        <nav class=\"red darken-2\">\n");
      out.write("          <div class=\"nav-wrapper\">\n");
      out.write("            <a href=\"index.jsp\" class=\"brand-logo center\">GFE</a>\n");
      out.write("            <a href=\"index.jsp\" data-target=\"mobile-nav\" class=\"sidenav-trigger\">\n");
      out.write("              <i class=\"material-icons\">menu</i></a>\n");
      out.write("            <ul class=\"left hide-on-med-and-down\">\n");
      out.write("              <li><a href=\"#about\">About Us</a></li>\n");
      out.write("              <li><a href=\"#clients\">Brand</a></li>\n");
      out.write("              <li><a href=\"#services\">Service</a></li>\n");
      out.write("              <li><a href=\"#product\">Product</a></li>\n");
      out.write("              <li><a href=\"#contact\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                ");

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
                
      out.write("       \n");
      out.write("               <li><a class=\"waves-effect waves-light btn red white-text\" href=\"login.html\">Login</a></li>\n");
      out.write("              <li><a class=\"waves-effect waves-light btn white darken-1 red-text\" href=\"signup.html\">Sign Up</a></li>\n");
      out.write("              <li><a href=\"cart.jsp\"><i class=\"material-icons\">shopping_cart</i></a></li>\n");
      out.write("              <li>");
      out.print(            
                    cart.getNumOfItems()
                );
      out.write("</li>\n");
      out.write("              <li><a href=\"cart.jsp\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- side-nav -->\n");
      out.write("      <ul class=\"sidenav center\" id=\"mobile-nav\">\n");
      out.write("            <li><a href=\"#about\">About Us</a></li>\n");
      out.write("            <li><a href=\"#clients\">Brand</a></li>\n");
      out.write("            <li><a href=\"#services\">Service</a></li>\n");
      out.write("            <li><a href=\"#product\">Product</a></li>\n");
      out.write("            <li><a href=\"#contact\">Contact Us</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-light btn red white-text\" href=\"login.html\">Login</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-light btn white darken-1 red-text\" href=\"signup.html\">Sign Up</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <!-- slider -->\n");
      out.write("       <div class=\"slider\">\n");
      out.write("        <ul class=\"slides\">\n");
      out.write("          <li>\n");
      out.write("            <img src=\"img/lg.png\"> <!-- random image -->\n");
      out.write("            <div class=\"caption center-align\">\n");
      out.write("              <h3 class=\"blue-text\">LOGITECH</h3>\n");
      out.write("              <h5 class=\"light blue-text text-darken-3\">Gaming</h5>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <img src=\"img/rz.png\"> <!-- random image -->\n");
      out.write("            <div class=\"caption right-align\">\n");
      out.write("              <h3 class=\"green-text text-darken-3\">RAZER</h3>\n");
      out.write("              <h5 class=\"light grey-text text-lighten-3\">Hunstman</h5>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <img src=\"img/cr.jpg\"> <!-- random image -->\n");
      out.write("            <div class=\"caption left-align\">\n");
      out.write("              <h3 class=\"yellow-text text text-darken-3\">CORSAIR</h3>\n");
      out.write("              <h5 class=\"light grey-text text-lighten-3\">K70 RGB</h5>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <img src=\"img/ss.png\"> <!-- random image -->\n");
      out.write("            <div class=\"caption left-align\">\n");
      out.write("              <h3 class=\"white-text text-darken-3\">STEELSERIES</h3>\n");
      out.write("              <h5 class=\"light black-text text-darken-3\">Aritcs Pro Wireless</h5>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- Search -->\n");
      out.write("      <section id=\"search\" class=\"section section-search red darken-2\n");
      out.write("      white-text center scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col s12\">\n");
      out.write("            <h3>Search Here</h3>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <input type=\"text\" id=\"autocomplete-input\" \n");
      out.write("              class=\"white black-text autocomplete\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- About Us -->\n");
      out.write("    <section id=\"about\" class=\"about scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <h3 class=\"center light grey-text text-darken-3\">About Us</h3>\n");
      out.write("        <div class=\"col m12 light\">\n");
      out.write("          <h5 class=\"center\">We Are Profesional</h5>\n");
      out.write("          <p class=\"center\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("          tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("          quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("          consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("          cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("          proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- CLient Parallax -->\n");
      out.write("\n");
      out.write("    <div id=\"clients\" class=\"parallax-container scrollspy\">\n");
      out.write("      <div class=\"parallax\"><img src=\"img/Login.jpg\"></div>\n");
      out.write("\n");
      out.write("      <div class=\"container clients\">\n");
      out.write("        <h3 class=\"center light white-text\">Brand</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col m3 s12 center\">\n");
      out.write("              <a href=\"Brand/logitech.jsp\"><img src=\"img/Clients/logitech.png\" href=\"\"></a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m3 s12 center\">\n");
      out.write("              <a href=\"Brand/steelseries.jsp\"><img src=\"img/Clients/steelseries.png\"> </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m3 s12 center\">\n");
      out.write("              <a href=\"Brand/corsair.jsp\"><img src=\"img/Clients/corsair.png\"> </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m3 s12 center\">\n");
      out.write("              <a href=\"Brand/razer.jsp\"><img src=\"img/Clients/razer.png\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Services -->\n");
      out.write("    <section id=\"services\" class=\"services grey lighten-3 scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <h3 class=\"light center grey-text text-darken-3\">Our Service</h3>\n");
      out.write("          <div class=\"col m4 s12\">\n");
      out.write("            <div class=\"card-panel center\">\n");
      out.write("              <i class=\"material-icons medium\">desktop_windows</i>\n");
      out.write("              <h5>Web Development</h5>\n");
      out.write("              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("              tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m4 s12\">\n");
      out.write("            <div class=\"card-panel center\">\n");
      out.write("              <i class=\"material-icons medium\">games</i>\n");
      out.write("              <h5>Game Education</h5>\n");
      out.write("              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("              tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col m4 s12\">\n");
      out.write("            <div class=\"card-panel center\">\n");
      out.write("              <i class=\"material-icons medium\">weekend</i>\n");
      out.write("              <h5>Smart Home</h5>\n");
      out.write("              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("              tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Section Keyboard -->\n");
      out.write("    <section id=\"product\" class=\"product scrollspy\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Keyboard</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                    ");

                        ProdukModel pm = new ProdukModel();
                        List<ProdukModel> data = new ArrayList<ProdukModel>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                            data = pm.tampilkeyboard();
                        }
                        for (int x = 0; x < data.size(); x++) {
                    
      out.write("\n");
      out.write("            <div class=\"col m3 s12\">\n");
      out.write("              <div class=\"card small\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                        <a href=\"tampilan/tampil.html\"><img src=\"img/");
      out.print(data.get(x).getfoto1());
      out.write("\" width=\"300px\" height=\"150px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                          <p>");
      out.print(data.get(x).getnama());
      out.write("</p>\n");
      out.write("                          <a href=\"tampilan/tampil.html\">");
      out.print(data.get(x).getharga());
      out.write("</a>\n");
      out.write("                          <input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(x).getid());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"nama\" value=\"");
      out.print(data.get(x).getnama());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"foto\" value=\"");
      out.print(data.get(x).getfoto1());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"price\" value=\"");
      out.print(data.get(x).getharga());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"brand\" value=\"");
      out.print(data.get(x).getbrand());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"kategori\" value=\"");
      out.print(data.get(x).getkategori());
      out.write("\"><br><br>\n");
      out.write("                          <input type=\"submit\" name=\"Submit\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("        </div>               \n");
      out.write("        <a class=\"waves-effect waves-light btn red darken-2\" href=\"key.jsp\">View All</a>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("   \n");
      out.write("    <!-- Section Mouse -->\n");
      out.write("    <section id=\"mouse\" class=\"mouse grey lighten-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Mouse</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                    ");

                        if (ket == null) {
                            data = pm.tampilmouse();
                        }
                        for (int x = 0; x < data.size(); x++) {
                    
      out.write("\n");
      out.write("            <div class=\"col m3 s12\">\n");
      out.write("              <div class=\"card small\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                        <a href=\"tampilan/tampil.html\"><img src=\"img/");
      out.print(data.get(x).getfoto1());
      out.write("\" width=\"300px\" height=\"150px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                          <p>");
      out.print(data.get(x).getnama());
      out.write("</p> \n");
      out.write("                          <a href=\"tampilan/tampil.html\">");
      out.print(data.get(x).getharga());
      out.write("</a>\n");
      out.write("                          <input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(x).getid());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"nama\" value=\"");
      out.print(data.get(x).getnama());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"foto\" value=\"");
      out.print(data.get(x).getfoto1());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"price\" value=\"");
      out.print(data.get(x).getharga());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"brand\" value=\"");
      out.print(data.get(x).getbrand());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"kategori\" value=\"");
      out.print(data.get(x).getkategori());
      out.write("\"><br><br>\n");
      out.write("                          <input type=\"submit\" name=\"Submit\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("        </div>               \n");
      out.write("        <a class=\"waves-effect waves-light btn red darken-2\" href=\"mouse.jsp\">View All</a>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Section Headset -->\n");
      out.write("    <section id=\"headset\" class=\"headset white lighten-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h3 class=\"light grey-text text-darken-3\">Headset</h3>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                    ");

                        if (ket == null) {
                            data = pm.tampilheadset();
                        }
                        for (int x = 0; x < data.size(); x++) {
                    
      out.write("\n");
      out.write("            <div class=\"col m3 s12\">\n");
      out.write("              <div class=\"card small\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                        <a href=\"tampilan/tampil.html\"><img src=\"img/");
      out.print(data.get(x).getfoto1());
      out.write("\" width=\"300px\" height=\"150px\"></a>\n");
      out.write("                        <input type=\"hidden\" name=\"foto\" value=\"");
      out.print(data.get(x).getfoto1());
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                          <p>");
      out.print(data.get(x).getnama());
      out.write("</p>\n");
      out.write("                          <a href=\"tampilan/tampil.html\">");
      out.print(data.get(x).getharga());
      out.write("</a>\n");
      out.write("                          <input type=\"hidden\" name=\"id\" value=\"");
      out.print(data.get(x).getid());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"nama\" value=\"");
      out.print(data.get(x).getnama());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"foto\" value=\"");
      out.print(data.get(x).getfoto1());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"price\" value=\"");
      out.print(data.get(x).getharga());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"brand\" value=\"");
      out.print(data.get(x).getbrand());
      out.write("\">\n");
      out.write("                          <input type=\"hidden\" name=\"kategori\" value=\"");
      out.print(data.get(x).getkategori());
      out.write("\"><br><br>\n");
      out.write("                          <input type=\"submit\" name=\"Submit\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("        </div>               \n");
      out.write("        <a class=\"waves-effect waves-light btn red darken-2\" href=\"headset.jsp\">View All</a>\n");
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
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/dropdown.js\"></script>\n");
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
