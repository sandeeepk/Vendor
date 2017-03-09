<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Master.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome to Edit Page</h1>
<body>
	<form action="update" method="post">
		<pre>
Id:<input type="text" name="LocId" value="${locObj.locId}" />
Name:<input type="text" name="LocName" value="${locObj.locName}" />
Type:<c:choose><c:when test="${locObj.locType eq 'Urban'}"><input type="radio" name="locType" value="Urban" checked="checked">Urban<input type="radio" name="locType" value="Rural">Rural</c:when><c:otherwise>

<input type="radio" name="locType" value="Urban">Urban<input
					type="radio" name="locType" value="Rural" checked="checked">Rural
</c:otherwise>
</c:choose>
<input type="submit" value="Update">  <input type="reset"
					value="Clear">


</pre>

	</form>
</body>
</html>