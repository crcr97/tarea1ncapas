<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manejo de formularios con Spring</title>
<link rel="stylesheet" href="resources/css/formas.css">
<script type="text/javascript" src="resources/jquery-1.12.3.js"></script>
<script type="text/javascript" src="resources/sweetalert/sweetalert.min.js"></script>
</head>
<style>
th, td {
  padding: 5px;
  text-align: center;
}
</style>
<body class="grad1">

	<h1>${Tittle}</h1>
		<table class="datagrid">
			<thead>
				<tr style="background-color: #cecece">
					<th>Titulo</th>
					<th>Autor</th>
					<th>ISBN</th>
					<th>Cantidad de existencia</th>
					<th>Genero</th>
				<tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
					<tr>
						<td>${book.booktitle}</td>
						<td>${book.bookauthor}</td>
						<td>${book.bookisbn}</td>
						<th>${book.bookquantity}</th>
						<td>${book.bookgender}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>