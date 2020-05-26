package bean;

public class TextBook extends Book {
	
	private String status;
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	public TextBook(String id, double price, String publisher, String status) {
		super(id, price, publisher);
		this.status = status;
	}
	
	

}
