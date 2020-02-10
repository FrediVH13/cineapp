package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Carousel;

public interface CarouselService {

	public List<Carousel> getCarouselList();

	public Carousel getCarousel(int id);

	public boolean saveCarousel(Carousel carousel);

}
