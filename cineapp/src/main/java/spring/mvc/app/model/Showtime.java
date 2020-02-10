package spring.mvc.app.model;

import java.util.Date;

public class Showtime {
	private int id;
	private Date date;
	private double price;
	private boolean status;

	private MovieTheater movieTheater;
	private Movie movie;

	public Showtime(int id, Date date, double price, boolean status, MovieTheater movieTheater, Movie movie) {
		super();
		this.id = id;
		this.date = date;
		this.price = price;
		this.status = status;
		this.movieTheater = movieTheater;
		this.movie = movie;
	}

	public Showtime() {
		super();
	}

	@Override
	public String toString() {
		return "Showtime [id=" + id + ", date=" + date + ", price=" + price + ", status=" + status + ", movieTheater="
				+ movieTheater + ", movie=" + movie + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public MovieTheater getMovieTheater() {
		return movieTheater;
	}

	public void setMovieTheater(MovieTheater movieTheater) {
		this.movieTheater = movieTheater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
