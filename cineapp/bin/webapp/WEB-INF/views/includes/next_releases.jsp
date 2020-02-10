<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<div class="my-3 p-3 bg-white rounded shadow-sm">
	<h6 class="border-bottom border-gray pb-2 mb-3">
		<i class="fas fa-arrow-circle-right"></i> Próximamente
	</h6>
	<div class="form-row">
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/queen_of_spades.jpg">
		</div>
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/midway.jpg">
		</div>
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/the_dead_dont_die.jpg">
		</div>
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/placa_de_acero.jpg">
		</div>
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/shakira_en_concierto_el_dorado_world_tour.jpg">
		</div>
		<div class="col-6 col-sm-4 col-lg-2 mb-4">
			<img alt="" class="rounded w-100 border mx-auto d-block"
				src="${urlPublic}/images/movies/claudia.jpg">
		</div>
	</div>
</div>
