package spring.mvc.app.model;

import java.util.Date;

public class Carousel {
	private int id;
	private String carouselImage;
	private String description;
	private Date lastChangeDate;
	private boolean status;

	public Carousel(int id, String carouselImage, String description, Date lastChangeDate, boolean status) {
		super();
		this.id = id;
		this.carouselImage = carouselImage;
		this.description = description;
		this.lastChangeDate = lastChangeDate;
		this.status = status;
	}

	public Carousel() {
		super();
		this.lastChangeDate = new Date();
	}

	@Override
	public String toString() {
		return "Carousel [id=" + id + ", carouselImage=" + carouselImage + ", description=" + description
				+ ", lastChangeDate=" + lastChangeDate + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarouselImage() {
		return carouselImage;
	}

	public void setCarouselImage(String carouselImage) {
		this.carouselImage = carouselImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}
