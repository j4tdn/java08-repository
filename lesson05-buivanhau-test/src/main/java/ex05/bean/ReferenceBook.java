package ex05.bean;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String company, double tax) {
		super("STK" + id, price, company);
		this.tax = tax;
	}

	@Override
	public void setId(String id) {
		super.setId("STK" + id);
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
