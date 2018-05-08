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
 <legend><p align="center"><h3><font color="red">Add course</font></h3></p> </legend>

  <form action="<%=basePath%>show" method="post">
         <table border="1" align="center">
         <tr>
				<td>courseNum：&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="courseNum"></td>
				</tr>
				<tr>
				<td>courseName:<input type="text" name="courseName"></td>
				</tr>
				<tr>
				<td>courseId：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="courseId"></td>
			    </tr>
			    <tr>
				<td>semester:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="semester"></td>
				</tr>
				 <tr>
				<td>schoolYear &nbsp;:<input type="text" name="schoolYear"></td>
				</tr>
				 <tr>
				<td>maxNumber:<input type="text" name="maxNumber"></td>
				</tr>
				<tr>
				<td><input type="submit" value="提交"></td>
			 </tr>
		</form>
		</table>
		</form>
		</fieldset>
</body>
</html>