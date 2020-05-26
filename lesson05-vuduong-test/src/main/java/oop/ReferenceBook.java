package oop;

public class ReferenceBook extends Book {
	private String id;
	private double price;
	private String publisher;
	private double tax;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
		this.tax = tax;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
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
		return "ReferenceBook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax + "]";
	}
	
	
}
