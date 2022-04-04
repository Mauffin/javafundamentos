<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<table class="table table-success">
  <thead>
    <tr>
      <th scope="col">Fruta</th>
      <th scope="col">Precio</th>
    </tr>
  </thead>
  <tbody>
  	
  	<c:forEach var="fruta" items="${Item}">   
    <tr>
    	<td> <c:out value="${fruta.getName()}"></c:out></td>
		<td> <c:out value="${fruta.getPrice()}"></c:out></td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>
</div>
</body>
</html>