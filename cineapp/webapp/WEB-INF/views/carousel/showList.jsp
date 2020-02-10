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
<title>Imágenes del carrusel</title>
<jsp:include page="../includes/head.jsp"></jsp:include>
<script src="${urlPublic}/js/cineapp.js"></script>
</head>
<body class="bg-light">
	<jsp:include page="../includes/navbar.jsp"></jsp:include>
	<main role="main">
		<div class="container">
			<div class="row mt-3">
				<div class="col-sm-12">
					<a class="btn btn-warning btn-sm" href="${urlRoot}"> <i
						class="fas fa-arrow-circle-left"></i> Inicio
					</a> <a class="btn btn-primary btn-sm" href="${urlRoot}carousel/create">
						<i class="fas fa-plus"></i> Nueva imagen para el carrusel
					</a>
				</div>
			</div>
			<c:if test="${saveMessage != null}">
				<div class="alert alert-primary alert-dismissible fade show mt-3"
					role="alert">
					<strong>¡Éxito!</strong> ${saveMessage}
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</c:if>
			<div class="my-3 p-3 bg-white rounded shadow-sm">
				<h6 class="border-bottom border-gray pb-2 mb-3">
					<i class="fas fa-video"></i> Carrusel
				</h6>
				<div class="table-responsive">
					<table id="movies" class="table table-striped table-sm w-100">
						<thead>
							<tr>
								<th scope="col">Imagen</th>
								<th scope="col">Descripción</th>
								<th scope="col" width="80px">Estatus</th>
								<th scope="col" width="80px">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${carousel}" var="c">
								<tr>
									<td width="550px"><img alt="${c.description}"
										src="${urlPublic}/images/carousel/${c.carousel_image}"
										class="w-100"></td>
									<td>${c.description}</td>
									<td class="align-middle" width="80px"><c:choose>
											<c:when test="${c.status==true}">
												<span class="badge badge-primary">Activa</span>
											</c:when>
											<c:otherwise>
												<span class="badge badge-warning">Inactiva</span>
											</c:otherwise>
										</c:choose></td>
									<td class="align-middle" width="80px"><a href="#"
										class="btn btn-sm btn-success" data-toggle="tooltip"
										data-placement="top" title="Editar"><i class="fas fa-pen"></i></a>
										<a href="#" class="btn btn-sm btn-danger"
										data-toggle="tooltip" data-placement="top" title="Eliminar"><i
											class="fas fa-trash-alt"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>