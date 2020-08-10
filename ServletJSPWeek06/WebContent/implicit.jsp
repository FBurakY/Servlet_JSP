<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Aşağıda Implicit Objeler mevcuttur -->
	<p>${cookie.usurname.value}</p>
	<p><%=request.getMethod() %></p>
	<p>${pageContext.request.method}</p>
	
	<p><%=request.getHeader("host") %></p>
	<p>${header.host}</p>
	
	<p>${myAttribute}</p>
	
	<p>${requestScope.myAttribute}</p>
	<p>${sessionScope.myAttribute}</p>
	
</body>
</html>