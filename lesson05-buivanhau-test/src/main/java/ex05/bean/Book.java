package ex05.bean;

public class Book {
	private String id;
	private double price;
	private String company;

	public Book() {
	}

	public Book(String id, double price, String company) {
		this.id = id;
		this.price = price;
		this.company = company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
