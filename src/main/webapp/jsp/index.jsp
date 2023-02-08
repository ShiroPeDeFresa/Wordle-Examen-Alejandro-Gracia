<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<body>
<p>YO!</p>
<h1>Adivina la palabra! puedes cambiar la dificultad con los perfiles "Easy", "Medium" y "Hard"</h1>
<form:form action="guessPalabra" method="post" modelAttribute="guess">
	<form:input path="palabra" type="text" name="palabra"/>	
	<input type="submit"/>
</form:form>

<c:out value="${resultado}"></c:out>
</body>
</html>