package spring.mvc.app.serviceImpl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.Genre;
import spring.mvc.app.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	private List<Genre> genreList = null;

	public GenreServiceImpl() {
		genreList = new LinkedList<Genre>();
		genreList.add(new Genre(1, "Acción", "Acción", true));
		genreList.add(new Genre(2, "Animación", "Animación", true));
		genreList.add(new Genre(3, "Comedia", "Comedia", true));
		genreList.add(new Genre(4, "Drama", "Drama", true));
		genreList.add(new Genre(5, "Familiar", "Familiar", true));
		genreList.add(new Genre(6, "Fantasía", "Fantasía", true));
		genreList.add(new Genre(7, "Musical", "Musical", true));
		genreList.add(new Genre(8, "Suspenso", "Suspenso", true));
		genreList.add(new Genre(9, "Terror", "Terror", true));
		genreList.add(new Genre(10, "Thriller", "Thriller", true));
		genreList.add(new Genre(11, "TBC: Por confirmar", "TBC: Por confirmar", true));
	}

	@Override
	public List<Genre> getGenreList() {
		return genreList;
	}

	@Override
	public Genre getGenre(int id) {
		for (Genre g : genreList) {
			if (g.getId() == id) {
				return g;
			}
		}
		return null;
	}

	@Override
	public boolean saveGenre(Genre genre) {
		// TODO Auto-generated method stub
		return false;
	}

}
