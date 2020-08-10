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

	<!-- Şimdi burada datayı çekeceğiz -->
	<!-- Nasıl ekledik datayı ? Request Attribute olarak ekledik öyleyse , Request Attribure Objesinden alacağız -->
	<!-- Genel kullanımı aşağıda ki gibi yapmamız daha pratik olmaktadır -->
	
	<jsp:useBean id="myPerson" class="_01.jspaction.model.Person" scope="request"></jsp:useBean>
	<p>	<jsp:getProperty property="name" name="myPerson"/> </p>
	<p>	<jsp:getProperty property="surname" name="myPerson"/> </p>
	<p>	<jsp:getProperty property="age" name="myPerson"/> </p>
	
</body>
</html>