package spring.mvc.app.serviceImpl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import spring.mvc.app.model.Movie;
import spring.mvc.app.model.MovieTheater;
import spring.mvc.app.model.Showtime;
import spring.mvc.app.service.ShowtimeService;

public class ShowtimeServiceImpl implements ShowtimeService {
	private List<Showtime> showtimeList = null;

	public ShowtimeServiceImpl() {
		showtimeList = new LinkedList<Showtime>();

		Showtime st = new Showtime();
		st.setId(1);
		st.setDate(new Date());
		st.setPrice(120.30);
		st.setStatus(true);
		st.setMovieTheater(new MovieTheater(1, "Sala 1", "20", true));
		st.setMovie(new Movie());
		showtimeList.add(st);
	}

	@Override
	public List<Showtime> getShowtimes() {
		return showtimeList;
	}

	@Override
	public Showtime getShowtime(int id) {
		for (Showtime showtime : showtimeList) {
			if (showtime.getId() == id) {
				return showtime;
			}
		}
		return null;
	}

	@Override
	public boolean saveShowtime(Showtime showtime) {
		System.out.println(showtime);
		showtimeList.add(showtime);
		return true;
	}

}
