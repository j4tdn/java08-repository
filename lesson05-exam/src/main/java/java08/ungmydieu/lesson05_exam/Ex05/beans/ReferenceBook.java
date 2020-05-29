package java08.ungmydieu.lesson05_exam.Ex05.beans;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {}

	public ReferenceBook(String id, double price, String company, double tax) {
		super(id, price, company);
		this.tax = tax;
	}
	
	@Override
	public double getPrice() {		
		System.out.println("reference Book price : " + price * (1 + tax));		
		return price * (1 + tax);
	} 

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {		
		return "id: " + id + ", price: " + price + ", company:  " + company + ", tax:  " + tax;
	}
}
