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
				<td>eId</td>
				<td>eNo</td>
				<td>password</td>
				<td>eName</td>
				<td>einfo</td>
			</tr>
		
		<c:forEach items="${message}" var="qy">
			<tr>
				<td>${qy.eId}</td>
				<td>${qy.eNo}</td>
				<td>${qy.password}</td>
				<td>${qy.eName}</td>
				<td>${qy.einfo}</td>
				<td><a href="<%=basePath%>eupdateInfo?eId=${qy.eId}"> <button>UPDATE</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>