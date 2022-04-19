<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
</br>
<%
String name = (String) request.getAttribute("name");

if(name != null)
	%><%
{
%>

<!-- <a href="Home.jsp">Home</a> -->
Hiii, 
<%=name%>
<a href="GetMarksheetView.jsp">Get My Marksheet</a>
<a href="AboutUs.jsp">About Us</a>
<a href="ContactUs.jsp">Contact Us</a>
<a href="list">Marksheet</a>
<a href="">Logout</a>
<%}
else{
%>
Hi, Guest
<%
}%>
<hr>
</body>
</html>