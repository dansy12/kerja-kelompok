package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      beans.ShoppingCart cart = null;
      synchronized (session) {
        cart = (beans.ShoppingCart) _jspx_page_context.getAttribute("cart", PageContext.SESSION_SCOPE);
        if (cart == null){
          cart = new beans.ShoppingCart();
          _jspx_page_context.setAttribute("cart", cart, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("       <!-- My CSS -->\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("    <title>Form Login</title>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("     <div class=\"navbar-fixed\">\n");
      out.write("        <nav class=\"red darken-2\">\n");
      out.write("          <div class=\"nav-wrapper\">\n");
      out.write("            <a href=\"index.jsp\" class=\"brand-logo\">GFE</a>\n");
      out.write("            <a href=\"index.html\" data-target=\"mobile-nav\" class=\"sidenav-trigger\">\n");
      out.write("              <i class=\"material-icons\">menu</i></a>\n");
      out.write("            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("              <li><a class=\"waves-effect waves-light btn white red-text\">Login</a></li>\n");
      out.write("              <li><a class=\"waves-effect waves-light btn red white-text\" href=\"signup.html\">Sign Up</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- side-nav -->\n");
      out.write("      <ul class=\"sidenav center\" id=\"mobile-nav\">\n");
      out.write("            <li><a class=\"waves-effect waves-light white darken-1 red-text\">Login</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-light red white-text\" href=\"signup.html\">Sign Up</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Shopping Cart -->\n");
      out.write("       <section id=\"about\" class=\"about scrollspy\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("            <table width=\"300\" border=\"1\" cellspacing=\"0\" cellpadding=\"2\" border=0>\n");
      out.write("                <caption><b>Shopping Cart Contents</b></caption>\n");
      out.write("                    <tr>\n");
      out.write("                        <th align=\"center\">Foto</th>\n");
      out.write("                        <th align=\"center\">Brand</th>\n");
      out.write("                        <th align=\"center\">Kategori</th>\n");
      out.write("                        <th align=\"center\">Nama</th>\n");
      out.write("                        <th align=\"center\">Harga</th>\n");
      out.write("                        <th align=\"center\">Jumlah</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Enumeration e = cart.getEnumeration();
                        String[] tmpItem;
                        while(e.hasMoreElements())
                        {
                          tmpItem=(String[])e.nextElement();
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"center\"><img src=\"img/");
      out.print(tmpItem[6]);
      out.write("\" width=\"100px\" height=\"100px\"></td>\n");
      out.write("                        <td align=\"center\">");
      out.print(tmpItem[4]);
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print(tmpItem[5]);
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print(tmpItem[1]);
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print(tmpItem[2]);
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print(tmpItem[3]);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("            <a href=\"index.jsp\" class=\"waves-effect waves-light btn red darken-2 center\">Continue Shopping</a>\n");
      out.write("        </div>   \n");
      out.write("        </section>\n");
      out.write("     \n");
      out.write("      <footer class=\"red darken-2 center white-text\">\n");
      out.write("          <p class=\"flow-text\"> Gaming For Everyone. Copyright 2018. </p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("      <!--JavaScript at end of body for optimized loading-->\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("\n");
      out.write("      <script>\n");
      out.write("        const sideNav = document.querySelectorAll('.sidenav');\n");
      out.write("        M.Sidenav.init(sideNav);\n");
      out.write("\n");
      out.write("\n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("  </html>");
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
