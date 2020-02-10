package spring.mvc.app.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mvc.app.model.Carousel;
import spring.mvc.app.model.Movie;
import spring.mvc.app.model.Showtime;
import spring.mvc.app.service.MovieService;
import spring.mvc.app.service.ShowtimeService;
import spring.mvc.app.util.Utilities;

@Controller
@RequestMapping(value = "/showtime")
public class ShowtimeController {

	@Autowired
	private ShowtimeService showtimeService;

	@Autowired
	private MovieService movieService;

//	@Autowired
//	private MovieTheaterService movieTheaterService;

	@GetMapping(value = "/create")
	public String create(@ModelAttribute Showtime showtime, Model model) {
		model.addAttribute("movies", movieService.getMovies());
//		model.addAttribute("movieTheaters", movieTheaterService.getMovies());
		return "showtime/create";
	}

	@GetMapping(value = "/showList")
	public String showList(Model model) {
		model.addAttribute("showtimes", showtimeService.getShowtimes());
		return "carousel/showList";
	}

//	@PostMapping(value = "/save")
//	public String saveShowtime(@RequestParam("carouselImage") MultipartFile carouselImage, Carousel carousel,
//			HttpServletRequest request, BindingResult result, RedirectAttributes redirectAttributes)
//			throws ParseException, ConversionFailedException {
//		if (!result.hasErrors()) {
//			if (!carouselImage.isEmpty()) {
//				carousel.setCarouselImage(Utilities.savebillboardImage(carouselImage, request));
//				if (carouselService.saveCarousel(carousel)) {
//					redirectAttributes.addFlashAttribute("saveMessage",
//							"La imagen [" + carousel.getDescription() + "] ha sido guardada exitosamente.");
//				} else {
//					redirectAttributes.addFlashAttribute("saveMessage",
//							"La imagen [" + carousel.getDescription() + "] no ha sido guardada.");
//				}
//			} else {
//				redirectAttributes.addFlashAttribute("saveMessage",
//						"La imagen de cartelera [" + carousel.getDescription() + "] no ha sido guardada.");
//			}
//			return "redirect:" + "/carousel/showList";
//		} else {
//			for (ObjectError error : result.getAllErrors()) {
//				System.err.println(error.getDefaultMessage());
//			}
//			return "carousel/create";
//		}
//	}

}
