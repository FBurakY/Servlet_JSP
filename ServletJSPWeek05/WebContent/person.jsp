<%@page import="_01.jspaction.model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>
	<!-- �imdi burada datay� �ekece�iz -->
	<!-- Nas�l ekledik datay� ? Request Attribute olarak ekledik �yleyse , Request Attribure Objesinden alaca��z -->
	
	<%	
	Person personObjet = (Person) request.getAttribute("myPerson");	
	%>
	
	<p> <%=personObjet.getName()%></p>
	<p> <%=personObjet.getSurname()%></p>  
	<p> <%=personObjet.getAge()%></p>
	
</body>
</html>