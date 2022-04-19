<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="forget" method="post">
	<%
	String err = (String) request.getAttribute("pwd");
	if (err!= null)
			{
		%>
		<font color="red"><%=err%></font>
		<% }
		%>
			
		<div align="center">

			<table>
				<tr>
					<th>Login :</th>
					<td><input type="text" name="login"></td>
					<td>
					
					</td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>