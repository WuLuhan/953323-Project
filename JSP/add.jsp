<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  bgcolor="#ccffff" align="center">
<fieldset> 
 <legend><p align="center"><h3><font color="red">welcome to register</font></h3></p> </legend>

  <form action="<%=basePath%>add" method="post">
         <table border="1" align="center">
         <tr>
				<td>studentNo:<input type="text" name="studentNo"></td>
				</tr>
				<tr>
				<td>password:&nbsp;<input type="password" name="passWord"></td>
				</tr>
				<tr>
				<td>name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="studentName"></td>
			    </tr>
			    <tr>
				<td>sex:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sex"></td>
				</tr>
				<tr>
				<td><input type="submit" value="submit"></td>
			 </tr>
		</form>
		</table>
		</form>
		</fieldset>
</body>
</html>