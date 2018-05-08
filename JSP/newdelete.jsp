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
<form action="<%=basePath%>/servlet/EFindName" method="post">
	Please enter the student`s name：<input type="text" name="word"  >
	<input type="submit" value="select">
</form>

<table>
			<tr>
				<td>ID</td>
				<td>stu id</td>
				<td>password</td>
				<td>name</td>
				<td>sex</td>
				<td>operate</td>
			</tr>
		
		<c:forEach items="${message}" var="qy">
			<tr>
				<td>${qy.id}</td>
				<td>${qy.eNo}</td>
				<td>${qy.password}</td>
				<td>${qy.eName}</td>
				<td>${qy.einfo}</td>
				 <td><button onclick="del(${qy.id})">delete</button></td> 
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
			function del(id){
				var b= confirm("Are you sure?"+id);
				if(b){
					window.location.href = "<%=basePath%>/del?eId="+eId;
				}
			}
	</script>

</body>
</html>