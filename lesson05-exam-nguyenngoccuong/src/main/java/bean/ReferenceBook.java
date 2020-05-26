package bean;

public class ReferenceBook extends Book {
	private int tax;
	
	public ReferenceBook() {
		super();
	}
	
	public ReferenceBook(String id, double price, String publisher, int tax) {
		super(id, price, publisher);
		this.tax = tax;	
	}
	
	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public double getPrice() {
		return price * (1 + tax/100);
	}
	
	@Override
	public String toString() {
		return "ReferenceBook: [id=" + id + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax + "]";
	}
}
