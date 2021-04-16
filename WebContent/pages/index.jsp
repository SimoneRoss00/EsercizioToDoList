<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoList</title>
</head>
<body>
	<h1>Benvenuto</h1>
	<form action="/EsercizioTodoList/TodoListServlet" method="GET">
		<input type="text" name="taskvalue" /> <input type="submit"
			value="aggiungi" />
	</form>

	<form action="/EsercizioTodoList/ToDoFind" method="GET">
		<input type="text" name="findValue" /> <input type="submit"
			value="cerca" />
	</form>
	<c:out value="${element}"/>

			<c:forEach items="${sessionList}" var="item">
				<br>
					${item.values}-----<a
					href="/EsercizioTodoList/ToDoDelete?value=${item.id}">elimina</a>-----<a
					href="/EsercizioTodoList/ToDoDone?value=${item.id}">done</a>
				<c:choose>
					<c:when test="${item.done==true}">
						<c:out value="-----svolta con successo" />
					</c:when>
					<c:when test="${item.done==false}">
						<c:out value="-----in corso di svolgimento" />
					</c:when>
				</c:choose>

			</c:forEach>

	
			
	


</body>
</html>
