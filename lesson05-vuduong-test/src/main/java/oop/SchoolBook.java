package oop;

public class SchoolBook extends Book {
	private String id;
	private double price;
	private BookStatus status;
	private String publisher;

	public SchoolBook() {
		// TODO Auto-generated constructor stub
	}

	public SchoolBook(String id, double price, BookStatus status, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.status = status;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String getPublisherOfBook() {
		return publisher;
	}

	@Override
	public double getPriceOfBook() {
		return price;
	}

	@Override
	public String toString() {
		return "SchoolBook [id=" + id + ", price=" + price + ", status=" + status + ", publisher=" + publisher + "]";
	}

}
