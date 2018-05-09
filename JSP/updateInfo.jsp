<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<form action="<%=basePath%>updateById" method="post">
	courseNum:	<input type="text" name="courseNum"  value="${message.courseNum}" readonly="readonly"><br>
		courseName:	<input type="text" name="courseName"  value="${message.courseName}" >
			<br>
		courseId：<input type="text"  name="courseId" value="${message.courseId}"> 
			 <br>
		semester：<input type="text"  name="semester" value="${message.semester}"> 
			 <br>
		schoolYear：<input type="text"  name="schoolYear" value="${message.schoolYear}">
			 <br> 
		maxNumber：<input type="text"  name="maxNumber" value="${message.maxNumber}"> 
			 <br>
			<input type="submit" value="Update"/>
</form>

</body>
</html>