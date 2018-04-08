<%@ page language="java" import="java.sql.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    
<%
  String username=request.getParameter("username");
  String pass=request.getParameter("pass");
  String url = "jdbc:hsqldb:hsql://localhost";
  String driver="org.hsqldb.jdbcDriver";
  String user="sa";
  String pass_db="";
  String sql="select * from stu where username=? and pass=?";
  Class.forName(driver);
  Connection con=DriverManager.getConnection(url,user,pass_db);
  PreparedStatement pstmt=con.prepareStatement(sql);
  pstmt.setString(1,username);
  pstmt.setString(2,pass);
  ResultSet rs=pstmt.executeQuery();
  boolean isSuc=rs.next();
  rs.close();pstmt.close();con.close();
  if(isSuc){
     response.sendRedirect("login_suc.jsp");
  }else{
     response.sendRedirect("login_fail.jsp");
  }
 %> username:<%=username%>,pass:<%=pass%>
  </body>
</html>
