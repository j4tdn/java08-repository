package Bai5;

public class Book {
	protected String idBook ;
	protected double price ;
	protected String pubHouse ;
	
	//default constructor
	public Book() {
		
	}

	//constructor
	public Book(String idBook, double price, String pubHouse) {
		super();
		this.idBook = idBook;
		this.price = price;
		this.pubHouse = pubHouse;
	}
	public String getPubHouse() {
		return this.pubHouse;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		
		return this.idBook + "\t" + this.price + "\t" + this.pubHouse;
	}
	
	
	
	
	
}
