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
<%
	String pnoo = request.getParameter("pno");
	session.setAttribute("pno", pnoo);
	
	 %>
	<button onclick="pshow(<%=session.getAttribute("pno") %>)">View selected course information</button>
		<p>The courses you can choose from are as follows：</p>
	
		<table border="1"cellpadding="10"cellspacing="5">
			<tr>
			    <td>courseNum</td>
				<td>courseName</td>
				<td>courseId</td>
				<td>semester</td>
				<td>schoolYear</td>
				<td>maxNumber</td>
				<td><%=pnoo %></td>
			</tr>
		
	<c:forEach items="${message}" var="stu">
	
	<tr>
		<td>${stu.courseNum}</td>
	    <td>${stu.courseName}</td>
		<td>${stu.courseId}</td>
		<td>${stu.semester}</td>
		<td>${stu.schoolYear}</td>
		<td>${stu.maxNumber}</td>
		<td><button onclick="select(${stu.courseNum},<%=session.getAttribute("pno")%>)">SELECT</button></td>

	</tr>
		</c:forEach>
	</table>
	<script type="text/javascript">
			function select(id,pno){
				var b= confirm("Are you sure？");
				if(b){
					window.location.href = "<%=basePath%>servlet/select?id="+id+"&pno="+pno;
				}
			}
			function pshow(pno){
			
		    window.location.href = "<%=basePath%>servlet/padd?pno="+pno;
				
			}
	</script>
	
</body>
</html>