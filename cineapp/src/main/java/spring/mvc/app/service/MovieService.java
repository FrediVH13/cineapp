package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Movie;

public interface MovieService {
	
	public List<Movie> getMovies();
	
	public Movie getMovie(int id);
	
	public boolean saveMovie(Movie movie);
	
}
