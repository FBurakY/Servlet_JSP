<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="UTF-8"%>

<%@page import="_01.model.Employee" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>JSP UseBean</title>
</head>
<body>

<jsp:useBean id="employeeAttribute" class="_01.model.Employee" scope="request"></jsp:useBean>
	<p><jsp:getProperty property="id" name="employeeAttribute"/> </p>
	<p><jsp:getProperty property="name" name="employeeAttribute"/></p>
	<p><jsp:getProperty property="salary" name="employeeAttribute"/></p>
	
	
	<!-- İç içe derinlik konusunda jspUseBean yetersiz kalmaktadır. -->
	<p><jsp:getProperty property="department" name="employeeAttribute"/></p>
	
	<!-- jspUseBean'de tek bir derinliğe inebiliyoruz iç içe propert alanına erişim sağlayamayız -->	
	<!-- _01.model.Department@271d0573 şeklinde çıkıyor , bu noktada jspUseBean yetersiz kalmaktadır -->
	<!-- İç içe derinliğe gidince nasıl kullanacağız bundu ? -->
	
	<!-- Böyle durumda Expression Langue kullanmaktayız -->
	
</body>
</html>