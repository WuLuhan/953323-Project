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
 <legend><p align="center"><h3><font color="red">Admin to register</font></h3></p> </legend>

  <form action="<%=basePath%>Eadd" method="post">
         <table border="1" align="center">
         <tr>
				<td>id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="eNo"></td>
				</tr>
				<tr>
				<td>password:<input type="password" name="password"></td>
				</tr>
				<tr>
				<td>name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="eName"></td>
			    </tr>
			    <tr>
				<td>remarks:&nbsp;&nbsp;&nbsp;<input type="text" name="einfo"></td>
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