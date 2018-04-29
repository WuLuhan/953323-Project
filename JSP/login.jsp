<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
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
      <font size="4" color=blue">Today is：</font>
         <div id="time">
		    <script>
		        document.getElementById('time').innerHTML = new Date().toLocaleString()
		                + ' weekend:' + '7123456'.charAt(new Date().getDay());
		        setInterval(
		                "document.getElementById('time').innerHTML=new Date().toLocaleString()+' weekend:'+'7123456'.charAt(new Date().getDay());",
		                1000);
		    </script>
</div>
<fieldset> 
 <legend><p align="center"><h3><font color="red">welcome</font></h3></p> </legend>     
     <form action="<%=basePath%>Login" method="post" onSubmit="return isValid(this);">
        <div>
             <table border="0" align="center"width="45%" height="80%">
                   <tr>
				       <td><font color="#3333ff" size="3">adminnumber:&nbsp;&nbsp;&nbsp;&nbsp;</font><input type="text" name="pno"></td>
				   </tr>
				         <br/><br/><br/><br/>
				   <tr>
				       <td><font color="#3333ff" size="3">&nbsp;&nbsp;password:</font><input type="password" name="pass"></td>
				   </tr>
				   <tr>
				    <td align="center">
				    <input type="radio" name="stu" value="admin">admin
				    </td>
				   </tr>
				   <tr>
				       <td align="center"><input type="submit" value="submit">
                       <input type="reset" value="reset" >
			           </td>
			       </tr>
			       <tr><td align=center><a href="eadd.jsp">Admin register</a></td></tr>
          </table>
       </div>
    </form>
           </fieldset>
           
</body>
</html>