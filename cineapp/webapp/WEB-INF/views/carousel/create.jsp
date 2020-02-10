<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es-MX">
<head>
<title>Nueva imagen para el carrusel</title>
<jsp:include page="../includes/head.jsp"></jsp:include>
<script type="text/javascript">
	var loadFile = function(event) {
		var output = document.getElementById('output');
		output.src = URL.createObjectURL(event.target.files[0]);
	};
</script>
</head>
<body class="bg-light">
	<jsp:include page="../includes/navbar.jsp"></jsp:include>
	<main role="main">
		<div class="container">
			<div class="row mt-3">
				<div class="col-sm-12">
					<a class="btn btn-warning btn-sm" href="${urlRoot}"> <i
						class="fas fa-arrow-circle-left"></i> Inicio
					</a> <a class="btn btn-primary btn-sm" href="${urlRoot}carousel/showList">
						<i class="fas fa-plus"></i> Listado de imágenes del carrusel
					</a>
				</div>
			</div>
			<spring:hasBindErrors name="movie">
				<div class="alert alert-warning alert-dismissible fade show mt-3"
					role="alert">
					<h5 class="alert-heading">¡Ups! Lo sentimos, ha ocurrido un
						error al guardar la información:</h5>
					<ul>
						<c:forEach var="error" items="${errors.allErrors}">
							<li><spring:message message="${error}" /></li>
						</c:forEach>
					</ul>
					<hr>
					<p class="mb-0">Si no puede resolver el error consulte con el
						administrador. Gracias.</p>
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</spring:hasBindErrors>
			<div class="my-3 p-3 bg-white rounded shadow-sm">
				<h6 class="border-bottom border-gray pb-2 mb-3">
					<i class="fas fa-video"></i> Nueva imagen para el carrusel
				</h6>
				<spring:url value="/carousel/save" var="save"></spring:url>
				<form action="${save}" method="post" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-12">
							<label for="synopsis">Descripción <span
								class="text-danger">*</span></label>
							<textarea rows="3" class="form-control form-control-sm"
								id="description" name="description" required></textarea>
						</div>
						<div class="col-md-2">
							<label>Estado <span class="text-danger">*</span></label><br />
							<div class="custom-control custom-checkbox mb-3 col-sm-3">
								<input type="checkbox" class="custom-control-input"
									name="status" id="status" checked="checked"> <label
									class="custom-control-label" for="status">Activa</label>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<button type="submit" class="btn btn-primary btn-sm btn-block">
								<i class="fas fa-save"></i> Guardar
							</button>
						</div>
						<div class="col-md-6">
							<button type="reset" class="btn btn-danger btn-sm btn-block">
								<i class="fas fa-times"></i> Cancelar
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</main>
	<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>