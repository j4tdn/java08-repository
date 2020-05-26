package bean;

public class TextBook extends Book {
	private boolean status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	
	public TextBook(String idBook, double price, String publisher, boolean status) {
		super(idBook, price, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
