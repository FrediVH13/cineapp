package spring.mvc.app.model;

import java.util.Date;

public class DetailMovie {
	private int id;
	private String directors;
	private String actors;
	private String trailer;
	private String synopsis;
	private Date lastChangeDate;

	public DetailMovie(int id, String directors, String actors, String trailer, String synopsis,
			Date lastChangeDate) {
		super();
		this.id = id;
		this.directors = directors;
		this.actors = actors;
		this.trailer = trailer;
		this.synopsis = synopsis;
		this.lastChangeDate = lastChangeDate;
	}

	public DetailMovie() {
		super();
		this.lastChangeDate = new Date();
	}

	@Override
	public String toString() {
		return "DetailMovie [id=" + id + ", directors=" + directors + ", actors=" + actors + ", trailer=" + trailer
				+ ", synopsis=" + synopsis + ", lastChangeDate=" + lastChangeDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Date getLastChangeDate() {
		return lastChangeDate;
	}

	public void setLastChangeDate(Date lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}

}
