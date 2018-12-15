<%@ page import ="java.sql.*" %>
 
<%
    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_uas",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from admin where username='" + userid + "' and password='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
        //out.write("<script>alert('Welcome "+userid+"');</script>");
        out.println("<script>alert('Welcome "+userid+"');location='index.jsp';</script>");
        //out.println("<a href='logout.jsp'>Log out</a>");
        //response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>