package bean;

public class ReferenceBooks extends Book {
	private double tax;

	public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBooks(String idBook, double price, String publisher, double tax) {
		super(idBook, price, publisher);
		this.tax = tax;
	}

}
