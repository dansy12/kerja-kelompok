package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Form SignUp</title>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("     <div class=\"navbar-fixed\">\n");
      out.write("        <nav class=\"red darken-2\">\n");
      out.write("          <div class=\"nav-wrapper\">\n");
      out.write("            <a href=\"index.html\" class=\"brand-logo\">GFE</a>\n");
      out.write("            <a href=\"index.html\" data-target=\"mobile-nav\" class=\"sidenav-trigger\">\n");
      out.write("              <i class=\"material-icons\">menu</i></a>\n");
      out.write("            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("              <li><a class=\"waves-effect waves-light btn red white-text\" href=\"login.html\">Login</a></li>\n");
      out.write("              <li><a class=\"waves-effect waves-light btn white red-text\">Sign Up</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- side-nav -->\n");
      out.write("      <ul class=\"sidenav center\" id=\"mobile-nav\">\n");
      out.write("            <li><a class=\"waves-effect waves-light red white-text\" href=\"login.html\">Login</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-light white red-text\">Sign Up</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Form Login -->\n");
      out.write("      <section id=\"login\" class=\"login grey lighten-4\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col s12 m4 offset-m4\">\n");
      out.write("            <div class=\"card-panel center satu\">\n");
      out.write("              <i class=\"material-icons medium red-text\">account_circle</i>\n");
      out.write("              <form  method=\"post\" action=\"simpan.jsp\">\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"text\" name=\"txtid\" id=\"txtid\" required class=\"validate\">\n");
      out.write("                <label for=\"name\">ID</label>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <select  name=\"txtbrand\" id=\"txtbrand\">\n");
      out.write("                        <option value=\"Steelseries\">Steelseries</option>\n");
      out.write("                        <option value=\"Razer\">Razer</option>\n");
      out.write("                        <option value=\"Corsair\">Corsair</option>\n");
      out.write("                        <option value=\"Logitech\">Logitech</option>\n");
      out.write("                    </select>\n");
      out.write("                <label for=\"name\">Brand</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input id=\"email\" type=\"email\" class=\"validate\">\n");
      out.write("              <label for=\"email\">Email</label>\n");
      out.write("              <span class=\"helper-text\" data-error=\"wrong\" data-success=\"right\">Helper text</span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" required class=\"validate\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" required class=\"validate\">\n");
      out.write("                <label for=\"password\">Confirm Password</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-field\">\n");
      out.write("                <input type=\"text\" name=\"text\" id=\"text\" required class=\"validate\">\n");
      out.write("                <label for=\"text\">No.Telpon</label>\n");
      out.write("              </div>\n");
      out.write("             <a class=\"waves-effect waves-light btn white red-text submit\" href=\"\">Daftar</a>\n");
      out.write("             <a class=\"waves-effect waves-light btn red white-text cancel\" href=\"\">Cancel</a>\n");
      out.write("             </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
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
