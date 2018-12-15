<%@ page import ="java.sql.*" %>
<%
    String email = request.getParameter("email");
    String user = request.getParameter("username");    
    String pwd = request.getParameter("password");
    String notlp = request.getParameter("notlp");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_uas",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into admin( email, username, password, notlp, regdate) values ('" + email + "','" + user + "','" + pwd + "','" + notlp + "', CURDATE())");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("signupsukses.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("signupsukses.jsp");
    }
%>