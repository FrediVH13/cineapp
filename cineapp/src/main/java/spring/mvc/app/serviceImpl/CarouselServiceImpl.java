package spring.mvc.app.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.Carousel;
import spring.mvc.app.service.CarouselService;

@Service
public class CarouselServiceImpl implements CarouselService {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private List<Carousel> carouselList = null;
	
	public CarouselServiceImpl () {
		try {
			carouselList = new LinkedList<Carousel>();
			Carousel c = new Carousel();
			c.setId(1);
			c.setCarouselImage("1.jpg");
			c.setDescription("Doctor sueño, gran estreno.");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
			c = new Carousel();
			c.setId(2);
			c.setCarouselImage("2.jpg");
			c.setDescription("Jugando con fuego | Señor Link");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
			c = new Carousel();
			c.setId(3);
			c.setCarouselImage("3.jpg");
			c.setDescription("Gana un AUDI A3 SEDÁN 2020");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
			c = new Carousel();
			c.setId(4);
			c.setCarouselImage("4.jpg");
			c.setDescription("Polvo | Al ritmo del Corazón | Rey de Ladrones");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
			c = new Carousel();
			c.setId(5);
			c.setCarouselImage("5.jpg");
			c.setDescription("FORD vs FERRARI, Contra lo imposible.");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
			c = new Carousel();
			c.setId(6);
			c.setCarouselImage("6.jpg");
			c.setDescription("90's Pop Tour, 16 de Noviembre - 21:00 Horas");
			c.setLastChangeDate(sdf.parse("28-10-2014"));
			c.setStatus(true);
			carouselList.add(c);
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public List<Carousel> getCarouselList() {
		return carouselList;
	}

	@Override
	public Carousel getCarousel(int id) {
		for (Carousel carousel : carouselList) {
			if (carousel.getId() == id) {
				return carousel;
			}
		}
		return null;
	}

	@Override
	public boolean saveCarousel(Carousel carousel) {
		carouselList.add(carousel);
		return true;
	}

}
