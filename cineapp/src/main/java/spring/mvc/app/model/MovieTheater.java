package spring.mvc.app.model;

public class MovieTheater {
	private int id;
	private String description;
	private String seatingCapacity;
	private boolean status;

	public MovieTheater(int id, String description, String seatingCapacity, boolean status) {
		super();
		this.id = id;
		this.description = description;
		this.seatingCapacity = seatingCapacity;
		this.status = status;
	}

	public MovieTheater() {
		super();
	}

	@Override
	public String toString() {
		return "MovieTheater [id=" + id + ", description=" + description + ", seatingCapacity=" + seatingCapacity
				+ ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
