<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es-MX" dir="ltr">
<head>
<title>Cinépolis</title>
<jsp:include page="includes/head.jsp"></jsp:include>
<script type="text/javascript">
	$(document).ready(function() {
		$("#date").change(function() {
			$("#formSearch").submit();
		});
	});
</script>
</head>
<body class="bg-light">
	<jsp:include page="includes/navbar.jsp"></jsp:include>
	<main role="main">
		<jsp:include page="includes/carousel.jsp"></jsp:include>
		<div class="container">
			<div class="my-3 p-3 bg-white rounded shadow-sm">
				<div class="row">
					<div class="col-sm-9">
						<h6 id="cartelera" class="border-bottom border-gray pb-2 mb-3"><i class="fas fa-film"></i> Cartelera</h6>
					</div>
					<div class="col-sm-3">
						<form id="formSearch" action="${urlRoot}searchMovie" method="POST">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">
										<i class="fas fa-calendar-alt"></i>
									</div>
								</div>
								<select id="date" name="date" class="custom-select">
									<c:forEach items="${dateList}" var="day">
										<c:choose>
											<c:when test="${dateSelected eq day}">
												<option value="${day}" selected="selected">${day}</option>
											</c:when>
											<c:otherwise>
												<option value="${day}">${day}</option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>
							</div>
						</form>
					</div>
				</div>
				<div class="row mt-2">
					<div class="col-sm-12">
						<div class="row">
							<c:forEach items="${movies}" var="movie">
								<div class="col-6 col-sm-3 col-lg-2 text-center mb-4">
									<div class="row">
										<div class="col-sm-12">
											<a href="detail?idMovie=${movie.id}&date=${dateSelected}"
												class="mx-auto d-block"><img
												src="${urlPublic}/images/movies/${movie.billboardImage}"
												class="rounded w-100 border" alt="${movie.title}" title="${movie.title}"></a>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-12">
											<span class="badge badge-secondary">${movie.idClassification.classification}</span>
											<span class="badge badge-dark">${movie.duration}</span>
											<span class="badge badge-info">${movie.idGenre.genre}</span>
										</div>
									</div>
									<button type="button"
										class="btn btn-primary btn-sm btn-block mt-2"
										data-toggle="modal" data-target="#trailer-${movie.id }">
										<i class="fas fa-angle-right"></i> Ver trailer
									</button>
								</div>
								<div class="modal fade" id="trailer-${movie.id }" tabindex="-1"
									role="dialog" aria-labelledby="trailerLabel" aria-hidden="true">
									<div class="modal-dialog modal-dialog-centered modal-lg"
										role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="trailerLabel">${movie.title}</h5>
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
											</div>
											<div class="modal-body" style="padding: 0px !important">
												<div class="embed-responsive embed-responsive-16by9">
													<iframe class="embed-responsive-item"
														src="${movie.idDetailMovie.trailer}"></iframe>
												</div>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="includes/next_releases.jsp"></jsp:include>
		</div>
	</main>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>