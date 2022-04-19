<%@page import="java.util.Iterator"%>
<%@page import="in.co.rays.bean.MarksheetBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<MarksheetBean> list = (List<MarksheetBean>) request.getAttribute("List");
		Iterator<MarksheetBean> it = list.iterator();
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Roll</th>
			<th>Phy</th>
			<th>Chem</th>
			<th>Maths</th>
		</tr>

		<%
			while (it.hasNext()) {
				MarksheetBean bean = (MarksheetBean) it.next();
		%>

		<tr>
			<td><%=bean.getId()%></td>
			<td><%=bean.getName()%></td>
			<td><%=bean.getRollNo()%></td>
			<td><%=bean.getPhy()%></td>
			<td><%=bean.getChem()%></td>
			<td><%=bean.getMaths()%></td>
		</tr>

		<%
			}
		%>
	</table>


</body>
</html>