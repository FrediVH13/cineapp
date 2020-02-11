package spring.mvc.app.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.Classification;
import spring.mvc.app.model.Country;
import spring.mvc.app.model.DetailMovie;
import spring.mvc.app.model.Genre;
import spring.mvc.app.model.Movie;
import spring.mvc.app.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private List<Movie> movieList = null;

	public MovieServiceImpl() {
		movieList = new LinkedList<Movie>();
		try {
			DetailMovie d = new DetailMovie();
			d.setTrailer("https://www.youtube.com/embed/Mrmf6DsNzqA");
			d.setActors("Alan Estrada,Memo Aponte,Fernanda Castillo");
			d.setDirectors("Carlos Eduardo Gutiérrez Medrano");
			d.setSynopsis(
					"Un grupo de stripers de un club neoyorquino forman un equipo para convertir sus mesas de trabajo en sus clientes de Wall Street.");
			Movie m = new Movie();
			m.setId(1);
			m.setBillboardImage("dia_de_muertos.jpg");
			m.setTitle("Día de Muertos");
			m.setOriginalTitle("Día de Muertos");
			m.setDuration("1h 34m");
			m.setYear("2019");
			m.setReleaseDate(sdf.parse("25-10-2019"));
			m.setIdClassification(new Classification(1, "A", "A", true));
			m.setIdGenre(new Genre(1, "Familiar", "Familiar", true));
			m.setIdCountry(new Country(1, "EUA", "EUA", true));
			m.setIdDetailMovie(d);
			movieList.add(m);

			d = new DetailMovie();
			d.setTrailer("https://www.youtube.com/embed/1SDBzrydAAc");
			d.setActors("Rebecca Ferguson,Ewan McGregor,Jacob Tremblay");
			d.setDirectors("Mike Flanagan");
			d.setSynopsis(
					"Doctor Sueño retoma la historia de Danny Torrance 40 años después de su escalofriante estancia en el hotel Overlook en El Resplandor. Ewan McGregor, Rebecca Ferguson y la actriz revelación Kyliegh Curran protagonizan este thriller sobrenatural dirigido por Mike Flanagan, quien creó el guion basado en la novela de Stephen King. Irreversiblemente marcado por el trauma al que se enfrentó en su niñez en el Overlook, Dan Torrance ha luchado por encontrar un poco de paz. Sin embargo, esa paz se esfuma cuando conoce a Abra, una aguerrida adolescente que tiene un poderoso don extrasensorial, conocido como \"el resplandor\". Ella reconoce instintivamente que Dan tiene el mismo poder y lo busca desesperadamente para pedirle ayuda y juntos enfrentar a la despiadada Rose the Hat y a sus seguidores, The True Knot, quienes se alimentan del resplandor de gente inocente en su búsqueda por alcanzar la inmortalidad. Dan y Abra forman un equipo muy peculiar, y se enfrentan a Rose en una sangrienta batalla de vida o muerte. La inocencia de Abra y la forma en la que acepta su resplandor sin temor alguno obligan a Dan a recurrir a sus poderes como nunca antes lo había hecho, lo que lo lleva a enfrentar sus miedos y a despertar a los fantasmas del pasado.");
			m = new Movie();
			m.setId(2);
			m.setBillboardImage("doctor_sleep.jpg");
			m.setTitle("Doctor Sueño");
			m.setOriginalTitle("Doctor Sleep");
			m.setDuration("2h 32m");
			m.setYear("2019");
			m.setReleaseDate(sdf.parse("08-11-2019"));
			m.setIdClassification(new Classification(1, "B15", "B15", true));
			m.setIdGenre(new Genre(1, "Terror", "Terror", true));
			m.setIdCountry(new Country(1, "EUA", "EUA", true));
			m.setIdDetailMovie(d);
			movieList.add(m);

			d = new DetailMovie();
			d.setTrailer("https://www.youtube.com/embed/A6_5eeEPC4Q");
			d.setDirectors("Lorene Scafaria");
			d.setSynopsis(
					"Un grupo de stripers de un club neoyorquino forman un equipo para convertir sus mesas de trabajo en sus clientes de Wall Street.");
			m = new Movie();
			m.setId(3);
			m.setBillboardImage("hustlers.jpg");
			m.setTitle("Estafadoras de Wall Street");
			m.setOriginalTitle("Hustlers");
			m.setDuration("1h 44m");
			m.setYear("2019");
			m.setReleaseDate(sdf.parse("08-11-2019"));
			m.setIdClassification(new Classification(1, "B15", "B15", true));
			m.setIdGenre(new Genre(1, "Comedia", "Comedia", true));
			m.setIdCountry(new Country(1, "EUA", "EUA", true));
			m.setIdDetailMovie(d);
			movieList.add(m);

			d = new DetailMovie();
			d.setTrailer("https://www.youtube.com/embed/TobNCFMK_bs");
			d.setDirectors("Todd Phillips");
			d.setActors("Joaquin Phoenix,Robert De Niro,Zazie Beetz");
			d.setSynopsis(
					"La pasión de Arthur Fleck, un hombre ignorado por la sociedad, es hacer reír a la gente. Sin embargo, una serie de trágicos sucesos harán que su visión del mundo se distorsione considerablemente convirtiéndolo en un brillante criminal.");
			m = new Movie();
			m.setId(4);
			m.setBillboardImage("joker.jpg");
			m.setTitle("Guasón");
			m.setOriginalTitle("Joker");
			m.setDuration("2h 2m");
			m.setYear("2019");
			m.setReleaseDate(sdf.parse("08-11-2019"));
			m.setIdClassification(new Classification(1, "B15", "B15", true));
			m.setIdGenre(new Genre(1, "Thriller", "Thriller", true));
			m.setIdCountry(new Country(1, "EUA", "EUA", true));
			m.setIdDetailMovie(d);
			m.setStatus(true);
			movieList.add(m);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}

	@Override
	public List<Movie> getMovieList() {
		return movieList;
	}

	@Override
	public Movie getMovie(int id) {
		for (Movie movie : movieList) {
			if (movie.getId() == id) {
				return movie;
			}
		}
		return null;
	}

	@Override
	public boolean saveMovie(Movie movie) {
		System.out.println(movie);
		movieList.add(movie);
		return true;
	}

}
