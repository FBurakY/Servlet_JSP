<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Aşağıdaki kod sayesinde tag lib. ekliyoruz -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- c:out Tarayıcıya yazı yazmak için kullanılır ve XSS Saldırısına karşı çözüm olarak kullanılmaktadır -->
	<c:out value="Seni Seviyorum Sevgilim"></c:out>
	<!-- c:set Yeni bir Atttribute Eklemek için kullanılan bir tagdır -->
	<c:set var="sessionAttribute" scope="session" value="Mehtap"></c:set>
	
	<c:out value="${sessionAttribute}"></c:out>
	
	<!-- c:remove eklediğimiz attribute'yi kaldırmak için kullandığımız bir tag dır -->
	<c:remove var="sessionAttribute"/>
	
	<p>After Remove : <c:out value="${sessionAttribute}"></c:out> </p>	

</body>
</html>