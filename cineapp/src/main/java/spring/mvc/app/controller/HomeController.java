package spring.mvc.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.app.model.Carousel;
import spring.mvc.app.model.Movie;
import spring.mvc.app.service.CarouselService;
import spring.mvc.app.service.MovieService;
import spring.mvc.app.util.Utilities;

@Controller
public class HomeController {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	@Autowired
	private MovieService ms;
	
	@Autowired
	private CarouselService cs;

	@GetMapping(value = "/home")
	public String goHome() {
		return "home";
	}

	@GetMapping(value = "/")
	public String showPrincipal(Model model) {
		List<Movie> movieList = ms.getMovieList();
		List<Carousel> carouselList = cs.getCarouselList();
		List<String> dateList = Utilities.getNextDays(sdf, 3);

		model.addAttribute("dateList", dateList);
		model.addAttribute("movies", movieList);
		model.addAttribute("carouselList", carouselList);
		model.addAttribute("dateSelected", sdf.format(new Date()));
		return "home";
	}

	@GetMapping(value = "/detail")
	public String showDetail(Model model, @RequestParam("idMovie") int idMovie, @RequestParam("date") String date) {
		model.addAttribute("movie", ms.getMovie(idMovie));
		return "detail";
	}

	@PostMapping(value = "/searchMovie")
	private String searchMovies(Model model, @RequestParam("date") String date) {
		List<Movie> movieList = ms.getMovieList();
		List<Carousel> carouselList = cs.getCarouselList();
		List<String> dateList = Utilities.getNextDays(sdf, 3);

		System.out.println("date:" + date);

		model.addAttribute("dateList", dateList);
		model.addAttribute("movies", movieList);
		model.addAttribute("carouselList", carouselList);
		model.addAttribute("dateSelected", date);
		return "home";
	}
}
