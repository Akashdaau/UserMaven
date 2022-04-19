<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="in.co.rays.bean.MarksheetBean"%>
<%@page import="java.util.List"%><html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
				<tr>
					<th>RollNo :</th>
					<td><input type="int" name="RollNo"></td>
					<td>

<%
		List<MarksheetBean> list1 = (List<MarksheetBean>) request.getAttribute("List1");
		Iterator<MarksheetBean> it = list1.iterator();
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