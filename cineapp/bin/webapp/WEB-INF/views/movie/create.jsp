<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es-MX">
<head>
<title>Nueva película</title>
<jsp:include page="../includes/head.jsp"></jsp:include>
<script type="text/javascript">
	$(function() {
		$('#release_date').datetimepicker({
			locale : 'es',
			format : 'LL',
			icons : {
				time : "far fa-clock",
				date : "fas fa-calendar-alt",
				up : "fas fa-arrow-up",
				down : "fas fa-arrow-down",
				previous : 'fas fa-chevron-left',
				next : 'fas fa-chevron-right',
				today : 'fas fa-calendar-check',
				clear : 'fas fa-trash',
				close : 'fas fa-times'
			}
		});
		$("#release_date").on("change.datetimepicker", function(e) {
			$('#release_date').datetimepicker('minDate', new Date());
		});
		$('#year').datetimepicker({
			viewMode : 'years',
			format : 'YYYY',
			locale : 'es',
			icons : {
				time : "far fa-clock",
				date : "fas fa-calendar-alt",
				up : "fas fa-arrow-up",
				down : "fas fa-arrow-down",
				previous : 'fas fa-chevron-left',
				next : 'fas fa-chevron-right',
				today : 'fas fa-calendar-check',
				clear : 'fas fa-trash',
				close : 'fas fa-times'
			}
		});
		$('#duration').datetimepicker({
			format : 'H [h] mm [m]',
			locale : 'es',
			icons : {
				time : "far fa-clock",
				date : "fas fa-calendar-alt",
				up : "fas fa-arrow-up",
				down : "fas fa-arrow-down",
				previous : 'fas fa-chevron-left',
				next : 'fas fa-chevron-right',
				today : 'fas fa-calendar-check',
				clear : 'fas fa-trash',
				close : 'fas fa-times'
			}
		});

	});
</script>
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
						class="fas fa-arrow-circle-left"></i> Cartelera
					</a> <a class="btn btn-primary btn-sm" href="${urlRoot}movie/showList">
						<i class="fas fa-plus"></i> Listado de películas
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
					<i class="fas fa-video"></i> Nueva película
				</h6>
				<spring:url value="/movie/save" var="save"></spring:url>
				<form:form action="${save}" method="post" modelAttribute="movie"
					enctype="multipart/form-data">
					<div class="form-row">
						<div class="col-md-3 col-lg-2">
							<img id="output" class="mx-auto d-block rounded border"
								style="max-height: 200px;"
								src="${urlPublic}/images/movies/default.jpg" />
						</div>
						<div class="col-md-9 col-lg-10">
							<div class="form-row">
								<div class="form-group col-md-10">
									<form:label path="billboard_image" for="imgMovie">Imagen de cartelera</form:label>
									<span class="text-success">414x603 | Máx. 100 KB</span> <input
										type="file" class="form-control-file"
										onchange="loadFile(event)" accept="image/png, .jpeg, .jpg"
										id="imgMovie" name="billboard" required />
								</div>
								<div class="col-md-2">
									<form:label path="status">Estado <span
											class="text-danger">*</span>
									</form:label>
									<br />
									<div class="custom-control custom-checkbox mb-3 col-sm-3">
										<input type="checkbox" class="custom-control-input"
											name="status" id="status" checked="checked"> <label
											class="custom-control-label" for="status">Activa</label>
									</div>
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<form:label path="title">Título (Hispanoamérica) <span
											class="text-danger">*</span>
									</form:label>
									<form:input path="title"
										cssClass="form-control form-control-sm" required="required" />
								</div>
								<div class="form-group col-md-6">
									<form:label path="original_title">Título original <span
											class="text-danger">*</span>
									</form:label>
									<form:input path="original_title"
										cssClass="form-control form-control-sm" required="required" />
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="id_genre">Género</form:label>
									<form:select path="id_genre"
										cssClass="form-control form-control-sm">
										<form:option value="--" label="Selecciona un género"
											disabled="true" />
										<form:option value="TBC" label="TBC (Por confirmar)" />
										<form:option value="Acción" label="Acción" />
										<form:option value="Animación" label="Animación" />
									</form:select>
								</div>
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="id_classification">Clasificación</form:label>
									<form:select path="id_classification"
										cssClass="form-control form-control-sm">
										<form:option value="--" label="Selecciona una clasificación"
											disabled="true" />
										<form:option value="TBC" label="TBC (Por confirmar)" />
										<form:option value="A" label="A" />
									</form:select>
								</div>
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="release_date">Fecha de estreno</form:label>
									<form:input id="release_date" path="release_date"
										cssClass="form-control form-control-sm datetimepicker-input"
										data-toggle="datetimepicker" data-target="#release_date" />
								</div>
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="duration">Duración <span
											class="text-danger">*</span>
									</form:label>
									<form:input id="duration" path="duration" required="required"
										cssClass="form-control form-control-sm datetimepicker-input"
										data-toggle="datetimepicker" data-target="#duration" />
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<form:label path="directors">Directores <span
											class="text-danger">*</span>
									</form:label>
									<form:input path="directors"
										cssClass="form-control form-control-sm" required="required" />
								</div>
								<div class="form-group col-md-6">
									<form:label path="actors">Actores <span
											class="text-danger">*</span>
									</form:label>
									<form:input path="actors"
										cssClass="form-control form-control-sm" required="required" />
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-12 col-lg-6">
									<form:label path="synopsis">Trailer (url) <span
											class="text-danger">*</span>
									</form:label>
									<form:input path="trailer" required="required"
										cssClass="form-control form-control-sm"
										placeholder="ejemplo: https://youtube.com/embed/" />
								</div>
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="id_country">País de producción</form:label>
									<form:select path="id_country" onchange='this.size=0;'
										onblur="this.size=0;"
										onmousedown="if(this.options.length>8){this.size=8;}"
										cssClass="form-control form-control-sm">
										<form:option value="--" label="Selecciona un país"
											disabled="true" />
										<form:option value="EUA" label="EUA" />
										<form:option value="México" label="México" />
										<form:option value="Rusia" label="Rusia" />
									</form:select>
								</div>
								<div class="form-group col-md-6 col-lg-3">
									<form:label path="year">Año de producción <span
											class="text-danger">*</span>
									</form:label>
									<form:input type="number" maxlength="4" path="year"
										required="required"
										cssClass="form-control form-control-sm datetimepicker-input"
										data-toggle="datetimepicker" data-target="#year" />
								</div>
							</div>
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-12">
							<form:label path="synopsis">Sinopsis <span
									class="text-danger">*</span>
							</form:label>
							<form:textarea rows="3" path="synopsis" required="required"
								cssClass="form-control form-control-sm" />
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<form:button type="submit"
								class="btn btn-primary btn-sm btn-block">
								<i class="fas fa-save"></i> Guardar
							</form:button>
						</div>
						<div class="col-md-6">
							<form:button type="reset" class="btn btn-danger btn-sm btn-block">
								<i class="fas fa-times"></i> Cancelar
							</form:button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</main>
	<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>