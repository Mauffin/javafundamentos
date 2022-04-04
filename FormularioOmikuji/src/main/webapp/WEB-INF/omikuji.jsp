<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Formulario Omikuji</title>
</head>
<body>
<div class="container border text-center" style=width:300px>
	<h1 class="text-center">Envia un Omikuji!</h1>
	<form action="formularioOmikuji" method="post">
		<c:out value="${error_numero}"/>
		<br>
		<label for="number">Elije un numero del 5 al 25</label><br>
		<input type="number" name="number" ><br>
		
		<label for="city">ingrese el nombre de cualquier ciudad.</label><br>
		<input type="text" name="city"><br>
		
		<label for="name">ingrese el nombre de cualquier persona real</label><br>
		<input type="text" name="name"><br>
		
		<label for="hobbie">ingrese Profesion o hobbie</label><br>
		<input type="text" name="hobbie"><br>
		
		<label for="ser">ingrese cualquier tipo de ser vivo</label><br>
		<input type="text" name="ser"><br>
		
		<label for="say">dile algo agradable</label><br>
		<textarea name="say"></textarea><br>
		<br>
		<p>enviar y mostrar a un amigo</p><br>
		
		<input type="submit" value="Send">
	
	</form>
</div>
</body>
</html>