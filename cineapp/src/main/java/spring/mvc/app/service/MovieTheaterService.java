package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.MovieTheater;

public interface MovieTheaterService {

	public List<MovieTheater> getMovieTheaterList();

	public MovieTheater getMovieTheater(int id);

	public boolean saveMovieTheater(MovieTheater movieTheater);

}
