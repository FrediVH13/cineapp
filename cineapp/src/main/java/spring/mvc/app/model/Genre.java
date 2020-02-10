package spring.mvc.app.model;

public class Genre {
	private int id;
	private String genre;
	private String description;
	private boolean status;

	public Genre(int id, String genre, String description, boolean status) {
		super();
		this.id = id;
		this.genre = genre;
		this.description = description;
		this.status = status;
	}

	public Genre() {
		super();
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", genre=" + genre + ", description=" + description + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
