<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>THIS IS JSP PAGE : HELLO</h2>

	<%
	String s = (String) request.getAttribute("answer");
	if (s != null) {
		out.println(s);
	}
	%>
</body>
</html>