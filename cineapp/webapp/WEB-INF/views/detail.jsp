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
<title>${movie.title}</title>
<jsp:include page="includes/head.jsp"></jsp:include>
</head>
<body class="bg-light">
	<jsp:include page="includes/navbar.jsp"></jsp:include>
	<main role="main">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 mt-3">
					<a class="btn btn-primary btn-sm" href="${urlRoot}"> <i
						class="fas fa-arrow-circle-left"></i> Cartelera
					</a>
				</div>
			</div>
			<div class="my-3 p-3 bg-white rounded shadow-sm">
				<h6 class="border-bottom border-gray pb-2 mb-3">
					<i class="fas fa-info-circle"></i> Detalles de la película
				</h6>
				<div class="form-row">
					<div class="col-sm-7 mb-3">
						<div class="media">
							<img src="${urlPublic}/images/movies/${movie.billboardImage}"
								width="155" class="align-self-center mr-3 img-fluid rounded"
								alt="...">
							<div class="media-body">
								<h4 class="text-primary mt-0">${movie.title}</h4>
								<p class="text-muted">${movie.originalTitle}&nbsp;(${movie.idCountry.country},
									${movie.year})</p>
								<p class="mb-0 font-weight-bold">
									Clasificación: <span class="font-weight-normal">${movie.idClassification.classification}</span>
								</p>
								<p class="mb-0 font-weight-bold">
									Duración: <span class="font-weight-normal">${movie.duration}</span>
								</p>
								<p class="mb-0 font-weight-bold">
									Género: <span class="font-weight-normal">${movie.idGenre.genre}</span>
								</p>
							</div>
						</div>
					</div>
					<div class="col-7 col-sm-3 mb-3">
						<h6 class="text-primary font-weight-bold">
							<i class="fas fa-clock"></i> Horarios
						</h6>
						<h6 class="text-secondary font-weight-bold">ESP</h6>
						<h5>
							<a class="badge badge-info" href="#">12:00</a> <a
								class="badge badge-info" href="#">14:30</a> <a
								class="badge badge-info" href="#">14:35</a> <a
								class="badge badge-info" href="#">17:10</a> <a
								class="badge badge-info" href="#">19:10</a> <a
								class="badge badge-info" href="#">19:50</a> <a
								class="badge badge-info" href="#">21:40</a>
						</h5>
						<h6 class="text-secondary font-weight-bold">SUB</h6>
						<h5>
							<a class="badge badge-info" href="#">13:45</a> <a
								class="badge badge-info" href="#">15:45</a> <a
								class="badge badge-info" href="#">16:30</a> <a
								class="badge badge-info" href="#">18:40</a> <a
								class="badge badge-info" href="#">19:15</a> <a
								class="badge badge-info" href="#">21:35</a>
						</h5>
					</div>
				</div>

				<h6 class="text-primary font-weight-bold">
					<i class="fas fa-play-circle"></i> Trailer
				</h6>
				<div class="row mb-4">
					<div class="col-sm-7">
						<div class="embed-responsive embed-responsive-16by9">
							<iframe class="embed-responsive-item" src="${movie.idDetailMovie.trailer}"></iframe>
						</div>
					</div>
				</div>
				<h6 class="text-primary font-weight-bold">
					<i class="fas fa-comment-alt"></i> Sinopsis
				</h6>
				<div class="row">
					<div class="col-sm-7">
						<p class="text-justify">${movie.idDetailMovie.synopsis}</p>
					</div>
				</div>
				<c:choose>
					<c:when test="${movie.idDetailMovie.directors == null && movie.idDetailMovie.actors == null}"></c:when>
					<c:otherwise>
						<h6 class="text-primary font-weight-bold">
							<i class="fas fa-user-tag"></i> Créditos y reparto
						</h6>
					</c:otherwise>
				</c:choose>
				<c:if test="${movie.idDetailMovie.actors != null}">
					<div class="row">
						<div class="col-3 col-sm-1 font-weight-bold">Actores:</div>
						<div class="col-9">
							<p class="text-justify">${movie.idDetailMovie.actors}</p>
						</div>
					</div>
				</c:if>
				<c:if test="${movie.idDetailMovie.directors != null}">
					<div class="row">
						<div class="col-3 col-sm-1 font-weight-bold">Directores:</div>
						<div class="col-9">
							<p class="text-justify">${movie.idDetailMovie.directors}</p>
						</div>
					</div>
				</c:if>
			</div>
			<jsp:include page="includes/next_releases.jsp"></jsp:include>
		</div>
	</main>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>