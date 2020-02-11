package spring.mvc.app.serviceImpl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.MovieTheater;
import spring.mvc.app.service.MovieTheaterService;

@Service
public class MovieTheaterServiceImpl implements MovieTheaterService {

	private List<MovieTheater> movieTheaterList = null;

	public MovieTheaterServiceImpl() {
		movieTheaterList = new LinkedList<MovieTheater>();

		MovieTheater mt = new MovieTheater(1, "Sala 1", "20", true);
		movieTheaterList.add(mt);
		mt = new MovieTheater(2, "Sala 2", "30", true);
		movieTheaterList.add(mt);
		mt = new MovieTheater(3, "Sala 3", "25", true);
		movieTheaterList.add(mt);
		mt = new MovieTheater(4, "Sala 4", "25", true);
		movieTheaterList.add(mt);
		mt = new MovieTheater(5, "Sala 5", "30", true);
		movieTheaterList.add(mt);
	}

	@Override
	public List<MovieTheater> getMovieTheaterList() {
		return movieTheaterList;
	}

	@Override
	public MovieTheater getMovieTheater(int id) {
		for (MovieTheater movieTheater : movieTheaterList) {
			if (movieTheater.getId() == id) {
				return movieTheater;
			}
		}
		return null;
	}

	@Override
	public boolean saveMovieTheater(MovieTheater movieTheater) {
		movieTheaterList.add(movieTheater);
		return true;
	}

}
