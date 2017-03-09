<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Master.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome to Registration Data</h1>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Type</th>
		</tr>
		<c:forEach items="${listObj}" var="loc">
			<tr>
				<td><c:out value="${loc.locId}" /></td>
				<td><c:out value="${loc.locName}" /></td>
				<td><c:out value="${loc.locType}" /></td>
				<td><a href='delete?locId=<c:out value="${loc.locId}" />'>Delete</a></td>
				<td><a href='edit?locId=<c:out value="${loc.locId}" />'>Edit</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
<a href="ExcelView">ExcelView</a>
<a href="PdfView">PdfView</a>
</html>