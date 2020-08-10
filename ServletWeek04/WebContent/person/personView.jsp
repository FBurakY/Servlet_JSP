<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
    
<%@ page import="java.util.List" %>   
<%@page import="model.Person"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<%
	// Bu kısım java kodunun yazıldığı yerdir .
	List<Person> personList = (List<Person>) request.getAttribute("persons");
	System.out.println("Fadil Burak Yurtsever");
%>
	<table>	
		<%
			for(Person p : personList){		
		%>
		<tr>
			<td><%=p.getName()%></td>
			<td><%=p.getSurname()%></td>
		</tr>
		<%	} %>
		
	</table>


</body>
</html>