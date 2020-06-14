package bean;

public class TextBook extends Book {
	
	private String status;
	public TextBook() {
		
	}
	
	public TextBook(String id, double price, String publisher, String status) {
		super(id, price, publisher);
		this.status = status;
	}
	
	@Override
	public double getPrice() {
		if(this.status.equals("old")) {
			return super.getPrice()*0.3;
		}
		return super.getPrice();
	}

	
	
	
	

}
