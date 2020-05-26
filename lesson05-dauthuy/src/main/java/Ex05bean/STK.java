package Ex05bean;

public class STK extends Book {
	private double tax;
	
	public STK() {
		
	}

	public STK(String id, double price, String nXB, double tax) {
		super(id, price, nXB);
		this.tax = tax;
	}


	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

	
}
