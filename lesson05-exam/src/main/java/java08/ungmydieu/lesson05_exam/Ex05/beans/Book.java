package java08.ungmydieu.lesson05_exam.Ex05.beans;

public class Book {
	String id;
	double price;
	String company;
	
	public Book() {}

	public Book(String id, double price, String company) {
		super();
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
		System.out.println("super price");
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
