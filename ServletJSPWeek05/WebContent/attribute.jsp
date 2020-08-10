<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<!-- Bu örneğimiz de çeşitli scopelara attribute ekleyelim bunlara erişim sağlayalım -->

<p> <%=request.getAttribute("reqAttribute1")%> </p>
<p> <%=session.getAttribute("sessionAttribute")%> </p>
<p> <%=application.getAttribute("applicationAttribute")%> </p>
<p> <%=pageContext.getAttribute("pageContextAttribute")%> </p>

</body>
</html>