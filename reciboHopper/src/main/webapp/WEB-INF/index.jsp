<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Recibo hopper</h1>

	<p>Nombre:<c:out value="${nombre}"></c:out></p>
	<p>Item:<c:out value="${item}"></c:out></p>
	<p>Precio:<c:out value="${price}"></c:out></p>
	<p>Descripcion<c:out value="${description}"></c:out></p>
	<p><c:out value="${vendor}"></c:out></p>

</body>
</html>