<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<div class="container-fluid">
	<div class="row">
		<div id="myCarousel" class="carousel slide carousel-fade"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<c:forEach items="${carouselList}" var="c" varStatus="loop">
					<c:choose>
						<c:when test="${loop.index==0}">
							<li data-target="#myCarousel" data-slide-to="${loop.index}"
								class="active"></li>
						</c:when>
						<c:otherwise>
							<li data-target="#myCarousel" data-slide-to="${loop.index}"></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ol>
			<div class="carousel-inner">
				<c:forEach items="${carouselList}" var="c" varStatus="loop">
					<c:choose>
						<c:when test="${loop.index==0}">
							<div class="carousel-item active">
								<img src="${urlPublic}/images/carousel/${c.carouselImage}"
									class="d-block w-100" alt="${c.description}"
									title="${c.description}">
							</div>
						</c:when>
						<c:otherwise>
							<div class="carousel-item">
								<img src="${urlPublic}/images/carousel/${c.carouselImage}"
									class="d-block w-100" alt="${c.description}"
									title="${c.description}">
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
			<a class="carousel-control-prev" href="#myCarousel" role="button"
				data-slide="prev"> <span class="carousel-control-prev-icon"
				aria-hidden="true"></span> <span class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#myCarousel" role="button"
				data-slide="next"> <span class="carousel-control-next-icon"
				aria-hidden="true"></span> <span class="sr-only">Next</span>
			</a>
		</div>
	</div>
</div>