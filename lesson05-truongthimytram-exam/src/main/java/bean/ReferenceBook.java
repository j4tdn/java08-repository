package bean;

public class ReferenceBook extends Book {
	private double tax;
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}
	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}
	


}
