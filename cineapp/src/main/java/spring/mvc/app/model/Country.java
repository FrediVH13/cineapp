package spring.mvc.app.model;

public class Country {
	private int id;
	private String country;
	private String description;
	private boolean status;

	public Country(int id, String country, String description, boolean status) {
		super();
		this.id = id;
		this.country = country;
		this.description = description;
		this.status = status;
	}

	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", description=" + description + ", status=" + status
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
