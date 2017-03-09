<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Master.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome to Edit</h1>
<body>
	<form action="updateven" method="post">
		<pre>
Id:<input type="text" name="venId" value="${venObj.venId}" />
Name:<input type="text" name="venName" value="${venObj.venName}" />
Email:<input type="text" name="venEmail" value="${venObj.venEmail}" />
Loc:
<input type="submit" value="Update" />
<input type="reset" value="Clear" />

</pre>

	</form>
</body>
</html>