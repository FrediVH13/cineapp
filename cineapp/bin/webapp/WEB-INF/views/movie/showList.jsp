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
<title>Películas</title>
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
						class="fas fa-arrow-circle-left"></i> Cartelera
					</a> <a class="btn btn-primary btn-sm" href="${urlRoot}movie/create">
						<i class="fas fa-plus"></i> Nueva película
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
					<i class="fas fa-video"></i> Películas
				</h6>
				<div class="table-responsive">
					<table id="movies" class="table table-striped table-sm w-100">
						<thead>
							<tr>
								<th scope="col">Película</th>
								<th scope="col" width="80px">Estatus</th>
								<th scope="col" width="80px">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${movies}" var="m">
								<tr>
									<td>
										<div class="media">
											<img src="${urlPublic}/images/movies/${m.billboard_image}"
												alt="..." class="align-self-center mr-3 rounded" width="60">
											<div class="media-body">
												<h6 class="mt-0 mb-1">${m.title}</h6>
												Estreno:
												<fmt:formatDate value="${m.release_date}"
													pattern="dd 'de' MMMM 'de' yyyy" />
												<br /> <span class="badge badge-secondary">${m.id_classification}</span>
												<span class="badge badge-dark">${m.duration}</span> <span
													class="badge badge-info">${m.id_genre}</span>
											</div>
										</div>
									</td>
									<td class="align-middle" width="80px">
										<c:choose>
											<c:when test="${m.status==true}">
												<span class="badge badge-primary">Activa</span>
											</c:when>
											<c:otherwise>
												<span class="badge badge-warning">Inactiva</span>
											</c:otherwise>
										</c:choose>
									</td>
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