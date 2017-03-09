<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="Master.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome to Registration Page</h1>
<body>
	<form action="insertloc" method="post">
		<pre>
Id:<input type="text" name="LocId" />
Name:<input type="text" name="LocName" />
Type:<input type="radio" name="locType" value="Urban">Urban<input
				type="radio" name="locType" value="Rural">Rural
<input type="submit" value="Save">  <input type="reset"
				value="Clear">
</pre>
	</form>
	
	${msg}
<a href="viewAllloc">View All Loc</a>
</body>
</html>