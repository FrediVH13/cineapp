package spring.mvc.app.model;

public class Classification {
	private int id;
	private String classification;
	private String description;
	private boolean status;

	public Classification(int id, String classification, String description, boolean status) {
		super();
		this.id = id;
		this.classification = classification;
		this.description = description;
		this.status = status;
	}

	public Classification() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Classification [id=" + id + ", classification=" + classification + ", description=" + description
				+ ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
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
