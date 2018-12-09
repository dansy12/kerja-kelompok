package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbc.koneksi;
import java.sql.*;

public final class coba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

                             try
                                {
                                    koneksi konek=new koneksi();
                                    Connection conn=konek.bukaKoneksi();
                                    Statement st=conn.createStatement();
                                    String sql="select*from barang";
                                    ResultSet res=st.executeQuery(sql);
                                    while(res.next())
                                    {

                        
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form  method=\"post\" action=\"tampil.jsp\">\n");
      out.write("                    <input type=\"text\" name=\"id\" value=\"");
 out.print(res.getString("id")); 
      out.write("\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"img/");
 out.print(res.getString("foto1")); 
      out.write("\" alt=\"...\">\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
 out.print(res.getString("foto1")); 
      out.write("\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                      <h3>");
 out.print(res.getString("nama")); 
      out.write("</h3>\n");
      out.write("                      <input type=\"hidden\" name=\"id\" value=\"");
 out.print(res.getString("nama")); 
      out.write("\">\n");
      out.write("                      <p>");
 out.print(res.getString("des")); 
      out.write("</p>\n");
      out.write("                      <input type=\"hidden\" name=\"id\" value=\"");
 out.print(res.getString("des")); 
      out.write("\">\n");
      out.write("                      <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Button</a> <a href=\"#\" class=\"btn btn-default\" role=\"button\">Button</a></p>\n");
      out.write("                    </div>\n");
      out.write("                      <input type=\"submit\"  class=\"btn btn-info\" value=\"cari\" name=\"cmdsimpan\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                                ");

                                    }
                        }
                           catch (Exception e)
                        {
                           out.print(e);
                        }

                         
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
