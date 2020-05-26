package Bai5;

public class TextBook extends Book {
	
	private boolean status ;
	
	//default constructor
	
	public TextBook() {
		
	}
	
	//constructor 
	
	public TextBook(String idBook, double price, String pubHouse, boolean status) {
			super(idBook, price, pubHouse);
			
			this.status = status ;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getPubHouse() {
		return this.pubHouse;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return super.toString()+ this.status;
	}
	
	
}
