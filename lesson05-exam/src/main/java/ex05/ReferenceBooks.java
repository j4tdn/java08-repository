package ex05;

public class ReferenceBooks extends Textbook {
	private int tax;

	public ReferenceBooks(String idTextBook, int priceTextBook, String publisher, boolean status, int tax) {
		super(idTextBook, priceTextBook, publisher, status);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [tax=" + tax + ", getIdTextBook()=" + getIdTextBook() + ", getPriceTextBook()="
				+ getPriceTextBook() + ", getPublisher()=" + getPublisher() + ", isStatus()=" + isStatus()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}	
}
