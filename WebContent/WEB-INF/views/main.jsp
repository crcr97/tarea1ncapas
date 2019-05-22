<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscador en Libreria</title>
<link rel="stylesheet" href="resources/css/formas.css">
<script type="text/javascript" src="resources/jquery-1.12.3.js"></script>
<script type="text/javascript" src="resources/sweetalert/sweetalert.min.js"></script>
</head>
<body class="grad1">
<script type="text/javascript">
	function buscar(){
		if($("#codigo").val() == ""){
			swal({
				  title: "Error!",
				  text: "Debe ingresar un codigo de busqueda!",
				  icon: "error",
				});
		}
		else $('#form1').submit();
	}
</script>

	<h1>Buscador de Libros</h1>
		<form:form id="form1" method="post" action="${pageContext.request.contextPath}/buscarcliente">
		<h2>M&oacute;dulo de b&uacute;squeda de Libros</h2>
		<table cellpadding="5">
			<tr>
				<td><input class="inputs" type="text" id="codigo" name="codigo" placeholder="Ingrese Autor/ISBN/Genero" /></td> 
			</tr>
			<tr>
				<td><input type="button" class="myButton" value="Buscar" onclick="buscar()" />
				<input type="button" class="myButton" value="Ver Todos" 
				onclick="location.href='${pageContext.request.contextPath}/vertodos'" /></td>
				<td><select id="listaFiltro" name="listaFiltro" class="myButton"/>
					<option value="isbn">ISBN</option>
					<option value="genero">GENERO</option>
					<option value="autor">AUTOR</option>
				</select></td>
			</tr>
		</table>
		</form:form>
</body>
</html>