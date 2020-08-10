<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="_01.model.Employee" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getId() %> </p>
	<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getName() %> </p>
	<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getSalary() %> </p>
	<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getId() %> </p>
	<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getName() %> </p>


</body>
</html>