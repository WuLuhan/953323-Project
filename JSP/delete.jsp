<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body>
Condition Select：
<form action="<%=basePath%>findByName" method="post">
	Please enter the name of the course what you want：<input type="text" name="word"  >
	<input type="submit" value="select">
</form>

<table>
			<tr>
				<td>courseName</td>
				<td>courseId</td>
				<td>schoolYear</td>
				<td>semester</td>
				<td>maxNumber</td>
			</tr>
		
	<c:forEach items="${message}" var="stu">
			<tr>
				<td>${stu.courseName}</td>
				<td>${stu.courseId}</td>
				<td>${stu.schoolYear}</td>
				<td>${stu.semester}</td>
				<td>${stu.maxNumber}</td>
				 <td><button onclick="del(${stu.courseNum})">delete</button></td>
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
			function del(id){
				var b= confirm("Are you sure?"+id);
				if(b){
					window.location.href = "<%=basePath%>del?id="+id;
				}
			}
	</script>

</body>
</html>