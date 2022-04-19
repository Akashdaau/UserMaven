<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
	<form action="reg" method="post">
		<h1 align="center" style="color: black">Registration form</h1>
		<hr>
		<div align="center">
		<%
		String e7 = (String) request.getAttribute("e7");
		if(e7!=null)
		{
			%><font color="red"><%=e7%></font> <%
		}
		%>
		
			<table>
				<tr>
					<th>Name :</th>
					<td><input type="text" name="name"></td>
					<td>
						<%
							String e1 = (String) request.getAttribute("e1");
							if (e1 != null) {
						%><font color="red"><%=e1%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th>Login :</th>
					<td><input type="email" name="login"></td>
					<td>
						<%
							String e2 = (String) request.getAttribute("e2");
							if (e2 != null) {
						%><font color="red"><%=e2%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="password" name="pwd"></td>
					<td>
						<%
							String e3 = (String) request.getAttribute("e3");
							if (e3 != null) {
						%><font color="red"><%=e3%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th>Confirm Password :</th>
					<td><input type="text" name="cpwd"></td>
					<td>
						<%
							String e4 = (String) request.getAttribute("e4");
							if (e4 != null) {
						%><font color="red"><%=e4%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th>D O B :</th>
					<td><input type="date" name="dob"></td>
					<td>
						<%
							String e5 = (String) request.getAttribute("e5");
							if (e5 != null) {
						%><font color="red"><%=e5%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th>Mobile No :</th>
					<td><input type="number" name="mob"></td>
					<td>
						<%
							String e6 = (String) request.getAttribute("e6");
							if (e6 != null) {
						%><font color="red"><%=e6%></font> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th></th>
					<td><a href="LoginView.jsp"><input type="submit" value="SignUp"></a></td>
				</tr>
				
			</table>
		</div>
	</form>
</body>
</html>