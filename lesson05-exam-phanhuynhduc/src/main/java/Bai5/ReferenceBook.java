package Bai5;

public class ReferenceBook extends Book{
	private double tax ;
	
	// default constructor 
	
	public ReferenceBook() {
		
	}
	public ReferenceBook(String idBook, double price, String pubHouse,double tax) {
		super(idBook, price, pubHouse);
		this.tax = tax ;
	}
	public String getPubHouse() {
		return this.pubHouse;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString()+ this.tax;
	}
}
