<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Master.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome to register Vendor</h1>
<body>
	<form action="insertVen" method="post">
		<pre>
Id:<input type="text" name="venId" />
Name:<input type="text" name="venName" />
Email:<input type="text" name="venEmail" />
Loc:<select name="loc.locId">
<option value="-1">--select--</option>
 <c:forEach items="${loclistObj}" var="ob">
 <option value="${ob.locId}"><c:out value="${ob.locName}"/></option>
 </c:forEach>
</select>
<input type="submit" value="Insert" />
<input type="reset" value="Clear" />

</pre>

	</form>
	${msg }
	<a href="viewAllVen">View All Data</a>
</body>
</html>