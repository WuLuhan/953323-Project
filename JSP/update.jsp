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


<table>
			<tr>
			    <td>courseNum</td>
				<td>courseName</td>
				<td>courseId</td>
				<td>semester</td>
				<td>schoolYear</td>
				<td>maxNumber</td>
			</tr>
		
	<c:forEach items="${message}" var="stu">
			<tr>
			   <td>${stu.courseNum}</td>
				<td>${stu.courseName}</td>
				<td>${stu.courseId}</td>
				<td>${stu.semester}</td>
				<td>${stu.schoolYear}</td>
				<td>${stu.maxNumber}</td>
				<td><a href="<%=basePath%>updateInfo?id=${stu.courseNum}"> <button>Update</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>