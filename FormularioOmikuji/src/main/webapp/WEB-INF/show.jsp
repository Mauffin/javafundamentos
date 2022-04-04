<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body>
	
	<div class="container" ><h1 class="text-center">Aqui esta tu Omikuji!</h1></div>
	
<div class="container-sm bg-primary bg-gradient text-center border "style=width:300px>
	<p class="fs-3 text-dark">En <span class="text-white"><c:out value="${number}"/></span> anos tu viviras en<br>
	<span class="text-white"><c:out value="${city}"/></span> con <span class="text-white"><c:out value="${name}"/></span><br>
	tu companero de cuarto, trabajaras <span class="text-white"><c:out value="${hobbie}"/></span><br>
	la proxima vez que vea un <span class="text-white"><c:out value="${ser}"/></span> tendra buena suerte, <span class="text-white"><c:out value="${say}"/></span>
	</p>
	
	<a href="/omikuji" class="text-white">Atras</a>
	
	
</div>
	
</body>
</html>