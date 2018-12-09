package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbc.koneksi;
import java.sql.*;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                  <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                  <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                      <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                      <span class=\"icon-bar\"></span>\n");
      out.write("                      <span class=\"icon-bar\"></span>\n");
      out.write("                      <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Home</a>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                  <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                      <li><a href=\"#\">Data Siswa <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                      <li><a href=\"#\">Data Guru</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"well well-lg\">\n");
      out.write("                        <form  method=\"post\" action=\"simpan.jsp\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">ID</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtid\" placeholder=\"Masukan ID\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleFormControlInput1\">Brand</label>\n");
      out.write("                                <select class=\"form-control\" id=\"exampleFormControlSelect1\" name=\"txtbrand\">\n");
      out.write("                                <option value=\"Steelseries\">Steelseries</option>\n");
      out.write("                                <option value=\"Razer\">Razer</option>\n");
      out.write("                                <option value=\"Corsair\">Corsair</option>\n");
      out.write("                                <option value=\"Logitech\">Logitech</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Kategori</label>\n");
      out.write("                                <select class=\"form-control\" id=\"exampleFormControlSelect1\" name=\"txtkategori\">\n");
      out.write("                                <option value=\"keyboard\">keyboard</option>\n");
      out.write("                                <option value=\"mouse\">mouse</option>\n");
      out.write("                                <option value=\"headset\">headset</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Nama</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtnama\" placeholder=\"Masukan Nama\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Harga</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtharga\" placeholder=\"Masukan Harga\" onkeypress=\"return angka(event)\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Foto1</label>\n");
      out.write("                                <input type=\"file\" name=\"txtfoto1\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Foto2</label>\n");
      out.write("                                <input type=\"file\" name=\"txtfoto2\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Foto3</label>\n");
      out.write("                                <input type=\"file\" name=\"txtfoto3\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Foto4</label>\n");
      out.write("                                <input type=\"file\" name=\"txtfoto4\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Foto5</label>\n");
      out.write("                                <input type=\"file\" name=\"txtfoto5\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Deskripsi</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtdes\" placeholder=\"Masukan Harga\">\n");
      out.write("                            </div>\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"simpan\" name=\"cmdsimpan\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"ubah\" name=\"cmdsimpan\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"hapus\" name=\"cmdsimpan\">\n");
      out.write("                                    <input type=\"reset\"  class=\"btn btn-danger\" value=\"batal\" name=\"cmdsimpan\">\n");
      out.write("                                    <input type=\"submit\"  class=\"btn btn-info\" value=\"cari\" name=\"cmdsimpan\">\n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\"></div>\\\n");
      out.write("                <div class=\"row\"></div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                        <table align=\"center\" class=\"table table-striped\"z>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">ID</th>\n");
      out.write("                            <th scope=\"col\">brand</th>\n");
      out.write("                            <th scope=\"col\">kategori</th>\n");
      out.write("                            <th scope=\"col\">nama</th>\n");
      out.write("                            <th scope=\"col\">harga</th>\n");
      out.write("                            <th scope=\"col\">foto1</th>\n");
      out.write("                            <th scope=\"col\">foto2</th>\n");
      out.write("                            <th scope=\"col\">foto3</th>\n");
      out.write("                            <th scope=\"col\">foto4</th>\n");
      out.write("                            <th scope=\"col\">foto5</th>\n");
      out.write("                            <th scope=\"col\">deskripsi</th>\n");
      out.write("                        </tr>\n");
      out.write("                         ");

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
      out.write("                        <tr>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("id")); 
      out.write("</td>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("brand")); 
      out.write("</td>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("kategori")); 
      out.write("</td>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("nama")); 
      out.write("</td>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("harga")); 
      out.write("</td>\n");
      out.write("                            <td scope=\"col\"><img width=\"200px\" src=\"img/");
 out.print(res.getString("foto1")); 
      out.write("\"></td>\n");
      out.write("                            <td scope=\"col\"><img width=\"200px\" src=\"img/");
 out.print(res.getString("foto2")); 
      out.write("\"></td>\n");
      out.write("                            <td scope=\"col\"><img width=\"200px\" src=\"img/");
 out.print(res.getString("foto3")); 
      out.write("\"></td>\n");
      out.write("                            <td scope=\"col\"><img width=\"200px\" src=\"img/");
 out.print(res.getString("foto4")); 
      out.write("\"></td>\n");
      out.write("                            <td scope=\"col\"><img width=\"200px\" src=\"img/");
 out.print(res.getString("foto5")); 
      out.write("\"></td>\n");
      out.write("                            <td scope=\"col\">");
 out.print(res.getString("des")); 
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                                    }
                        }
                           catch (Exception e)
                        {
                           out.print(e);
                        }

                         
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                function angka(evt){\n");
      out.write("                    var charCode = (evt.which) ? evt.which : event.keyCode\n");
      out.write("                    if (charCode > 31 && (charCode < 48 || charCode > 57))\n");
      out.write("\n");
      out.write("                        return false;\n");
      out.write("                    return true;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
