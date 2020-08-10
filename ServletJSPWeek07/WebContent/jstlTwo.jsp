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

	<c:set var="exampleResult" value="80"></c:set>
	<c:if test="${exampleResult > 65}">
		<p>Sınavı Geçtin</p>
	</c:if>
	
	<c:set var="name" value="admin"></c:set>
	<c:if test="${name eq 'admin'}">
		<p>Hoşgeldiniz</p>
	</c:if>
	
	<!-- c:choose ise bildiğimiz switch mekanizması gibi çalışmaktadır -->
	
	<c:set var="name" scope="request" value="Mehtap" />
	<c:choose>
	<c:when test="${name eq'Burak'}">
		<p>Seni Seviyorum Buğkiş</p>
	</c:when>
	<c:when test="${name eq'Mehtap' }">
		<p>Matilda masadan in</p>
	</c:when>		
	<c:otherwise>
		<p>Deneme</p>
	</c:otherwise>
	</c:choose>
	
	<c:set var="salary" scope="request"  value="500"/>
	<c:choose>
	
		<c:when test="${salary eq 500}">
			<p> Esit maas</p>
		</c:when>
		
		<c:when test="${salary < 1500}">
			<p> dusuk maas</p>
		</c:when>
		
		<c:when test="${salary < 4000}">
			<p>iyi maas </p>  
		</c:when>
		
		<c:otherwise>
			<p>... maasi :) </p>		
		</c:otherwise>
	</c:choose>
	

</body>
</html>