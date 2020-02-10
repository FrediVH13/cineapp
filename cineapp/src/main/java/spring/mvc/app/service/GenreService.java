package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Genre;

public interface GenreService {

	public List<Genre> getGenreList();

	public Genre getGenre(int id);

	public boolean saveGenre(Genre genre);
}
