package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Showtime;

public interface ShowtimeService {
	
	public List<Showtime> getShowtimeList();
	
	public Showtime getShowtime(int id);
	
	public boolean saveShowtime(Showtime showtime);

}
