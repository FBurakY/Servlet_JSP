<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>${myMap.key1}</p>
	<p>${myMap.key2}</p>
	<p>${myMap.key3}</p>
	<p>${myMap.key4}</p>
	<p>${myMap.key5}</p>
	<p>${myMap.key6}</p>
	

	<h2>Bracket</h2>
	<p>${myMap['key1']}</p>
	<p>${myMap['key2']}</p>
	<p>${myMap['key3']}</p>
	<p>${myMap['key4']}</p>
	<p>${myMap['key5']}</p>
	<p>${myMap['key6']}</p>
	
	<h3>Bracket List</h3>	
	<p>${myList[0]}</p>
	<p>${myList['1']}</p>
	<p>${myList["2"]}</p>
	

</body>
</html>