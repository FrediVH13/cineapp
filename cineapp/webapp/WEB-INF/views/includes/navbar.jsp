<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot" />
<spring:url value="/movie/showList" var="movies"></spring:url>
<spring:url value="/carousel/showList" var="carousel"></spring:url>
<nav class="navbar fixed-top navbar-expand-md navbar-dark"
	style="background-color: #002069;">
	<div class="container">
		<a class="navbar-brand" href="${urlRoot}"> <img
			src="${urlPublic}/images/logo-cinepolis.png" height="40"
			class="d-inline-block align-top" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<form class="form-inline my-2 my-lg-0">
				<select id="selectCity"
					class="form-control form-control-sm my-2 mr-sm-2">
					<option selected>Selecciona una ciudad</option>
					<option>CDMX</option>
					<option>Túxtla Gutierrez</option>
					<option>Tapachula</option>
					<option>San Cristóbal de las Casas</option>
				</select> <select id="selectCity"
					class="form-control form-control-sm my-2 mr-sm-2">
					<option selected>Selecciona un cine</option>
					<option>Cine 1</option>
					<option>Cine 2</option>
					<option>Cine 3</option>
					<option>Cine 4</option>
				</select>
				<button class="btn btn-sm btn-warning my-2 my-sm-0" type="submit">
					<i class="fas fa-sign-in-alt"></i> Iniciar Sesión
				</button>
			</form>
		</div>
	</div>
</nav>
<div class="nav-scroller bg-dark shadow-sm">
	<div class="container">
		<nav class="nav nav-underline">
			<a class="nav-link link active" href="${movies}">Películas</a>
			<a class="nav-link link active" href="${carousel}">Carrusel</a>
			
			<a class="nav-link fb active" href="https://www.facebook.com/cinepolisonline"><i class="fab fa-facebook" style="font-size: 22px"></i></a>
			<a class="nav-link tw active" href="https://twitter.com/cinepolis"><i class="fab fa-twitter" style="font-size: 22px"></i></a>
			<a class="nav-link link active" href="https://instagram.com/cinepolismx"><i class="fab fa-instagram" style="font-size: 22px"></i></a>
			<a class="nav-link yt active" href="https://www.youtube.com/user/CinepolisOnline"><i class="fab fa-youtube" style="font-size: 22px"></i></a>
		</nav>
	</div>
</div>