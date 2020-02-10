package spring.mvc.app.model;

import java.util.Date;

public class Movie {
	private int id;
	private String billboardImage;
	private String title;
	private String originalTitle;
	private String duration;
	private String year;
	private Date releaseDate;
	private Date lastChangeDate;
	private boolean status;

	private Classification idClassification;
	private Genre idGenre;
	private Country idCountry;
	private DetailMovie idDetailMovie;

	public Movie(int id, String billboardImage, String title, String originalTitle, String duration, String year,
			Date releaseDate, Date lastChangeDate, boolean status, Classification idClassification, Genre idGenre,
			Country idCountry, DetailMovie idDetailMovie) {
		super();
		this.id = id;
		this.billboardImage = billboardImage;
		this.title = title;
		this.originalTitle = originalTitle;
		this.duration = duration;
		this.year = year;
		this.releaseDate = releaseDate;
		this.lastChangeDate = lastChangeDate;
		this.status = status;
		this.idClassification = idClassification;
		this.idGenre = idGenre;
		this.idCountry = idCountry;
		this.idDetailMovie = idDetailMovie;
	}

	public Movie() {
		super();
		this.lastChangeDate = new Date();
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", billboardImage=" + billboardImage + ", title=" + title + ", originalTitle="
				+ originalTitle + ", duration=" + duration + ", year=" + year + ", releaseDate=" + releaseDate
				+ ", lastChangeDate=" + lastChangeDate + ", status=" + status + ", idClassification=" + idClassification
				+ ", idGenre=" + idGenre + ", idCountry=" + idCountry + ", idDetailMovie=" + idDetailMovie + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillboardImage() {
		return billboardImage;
	}

	public void setBillboardImage(String billboardImage) {
		this.billboardImage = billboardImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getLastChangeDate() {
		return lastChangeDate;
	}

	public void setLastChangeDate(Date lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Classification getIdClassification() {
		return idClassification;
	}

	public void setIdClassification(Classification idClassification) {
		this.idClassification = idClassification;
	}

	public Genre getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Genre idGenre) {
		this.idGenre = idGenre;
	}

	public Country getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Country idCountry) {
		this.idCountry = idCountry;
	}

	public DetailMovie getIdDetailMovie() {
		return idDetailMovie;
	}

	public void setIdDetailMovie(DetailMovie idDetailMovie) {
		this.idDetailMovie = idDetailMovie;
	}

}
