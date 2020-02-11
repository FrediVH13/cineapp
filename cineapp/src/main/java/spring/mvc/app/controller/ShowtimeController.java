package spring.mvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.app.model.Showtime;
import spring.mvc.app.service.MovieService;
import spring.mvc.app.service.MovieTheaterService;
import spring.mvc.app.service.ShowtimeService;

@Controller
@RequestMapping(value = "/showtime")
public class ShowtimeController {

	@Autowired
	private ShowtimeService showtimeService;

	@Autowired
	private MovieService movieService;

	@Autowired
	private MovieTheaterService movieTheaterService;

	@GetMapping(value = "/create")
	public String create(@ModelAttribute Showtime showtime, Model model) {
		model.addAttribute("movieList", movieService.getMovieList());
		model.addAttribute("movieTheaterList", movieTheaterService.getMovieTheaterList());
		return "showtime/create";
	}

	@GetMapping(value = "/showList")
	public String showList(Model model) {
		model.addAttribute("showtimes", showtimeService.getShowtimeList());
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
