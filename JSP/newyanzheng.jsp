<%@ page language="java" import="java.sql.*" contentType="textml;charset=utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
    <title>My JSP 'check.jsp' starting page</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    
 </head>  
  <body>  
<%  
   request.setCharacterEncoding("utf-8");  
   String users=request.getParameter("eNo");  
   String pass=request.getParameter("password");  
   boolean flag=false;  
   PreparedStatement sql=null;    
   ResultSet rs=null;  
   Connection conn=null;  
%>  
  
<%   
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";    
    String url = "jdbc:sqlserver://localhost:1433;DatabaseName=enterprise";    
    String use = "sa";     
    String password = "20152162";    
    Class.forName(driver);   
    conn= DriverManager.getConnection(url,use,password);  
    sql =conn.prepareStatement("select * from enterprise where eNo=? and password=?");  
    sql.setString(1,users);  
    sql.setString(2,pass);  
    rs=sql.executeQuery();  
    if (rs.next()) {    
    flag=true;  
     }  
   rs.close();  
   sql.close();  
   conn.close();  
  %>  
<!-- 判断是否是正确的登录用户 -->  
<% if (flag==true){ %>  
<jsp:forward page="esession.jsp"/>  
<%}   
else  
if (flag==false){  
%>  
<jsp:forward page="efail.jsp"/>  
<%} %>  
</body>  
</html>  
