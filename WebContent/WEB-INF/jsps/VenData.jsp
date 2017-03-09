<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Master.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Location</th>
			<th>Type</th>
			
		</tr>
		<c:forEach items="${listvenObj}" var="ven">
			<tr>
				<td><c:out value="${ven.venId}" /></td>
				<td><c:out value="${ven.venName}" /></td>
				<td><c:out value="${ven.venEmail}" /></td>
				<td><c:out value="${ven.loc.locName}" /></td>
				<td><c:out value="${ven.loc.locType}" /></td>
				
				<td><a href='deleteven?venId=<c:out value="${ven.venId}"/>'>Delete</a></td>
				<td><a href='editven?venId=<c:out value="${ven.venId}"/>'>Edit</a></td>
		</c:forEach>
	</table>
</body>
</html>