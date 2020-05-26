package bean;

public class Book {
	private String IdBook;
	private double Price;
	private String publisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String idBook, double price, String publisher) {
		super();
		IdBook = idBook;
		Price = price;
		this.publisher = publisher;
	}

	public String getIdBook() {
		return IdBook;
	}

	public void setIdBook(String idBook) {
		IdBook = idBook;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
