package spring.mvc.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mvc.app.model.Movie;
import spring.mvc.app.service.ClassificationService;
import spring.mvc.app.service.CountryService;
import spring.mvc.app.service.GenreService;
import spring.mvc.app.service.MovieService;
import spring.mvc.app.util.Utilities;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

	@Autowired
	private MovieService movieService;

	@Autowired
	private GenreService genreService;

	@Autowired
	private ClassificationService classificationService;

	@Autowired
	private CountryService countryService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}

	@GetMapping(value = "/create")
	public String create(@ModelAttribute Movie movie, Model model) {
		model.addAttribute("genreList", genreService.getGenreList());
		model.addAttribute("classificationList", classificationService.getClassificationList());
		model.addAttribute("countryList", countryService.getCountryList());
		return "movie/create";
	}

	@GetMapping(value = "/showList")
	public String showList(Model model) {
		model.addAttribute("movies", movieService.getMovies());
		return "movie/showList";
	}

	@PostMapping(value = "/save")
	public String saveMovie(@RequestParam("billboard") MultipartFile billboardImage, @ModelAttribute Movie movie,
			HttpServletRequest request, BindingResult result, RedirectAttributes redirectAttributes,
			@RequestParam("idClassification.classification") int idClassification,
			@RequestParam("idGenre.genre") int idGenre, @RequestParam("idCountry.country") int idCountry)
			throws ParseException, ConversionFailedException {
		if (!result.hasErrors()) {
			if (!billboardImage.isEmpty()) {
				movie.setBillboardImage(Utilities.savebillboardImage(billboardImage, request));
				movie.setIdClassification(classificationService.getClassification(idClassification));
				movie.setIdGenre(genreService.getGenre(idGenre));
				movie.setIdCountry(countryService.getCountry(idCountry));
				if (movieService.saveMovie(movie)) {
					redirectAttributes.addFlashAttribute("saveMessage",
							"La película [" + movie.getTitle() + "] ha sido guardada exitosamente.");
				} else {
					redirectAttributes.addFlashAttribute("saveMessage",
							"La película [" + movie.getTitle() + "] no ha sido guardada.");
				}
			} else {
				redirectAttributes.addFlashAttribute("saveMessage",
						"La imagen de cartelera para la película [" + movie.getTitle() + "] no ha sido guardada.");
			}
			return "redirect:" + "/movie/showList";
		} else {
			for (ObjectError error : result.getAllErrors()) {
				System.err.println(error.getDefaultMessage());
			}
			return "movie/create";
		}
	}

}
