package ex05.bean;

public class TextBook extends Book {
	private boolean status;

	public TextBook() {
	}

	public TextBook(String id, double price, String company) {
		super(id, price, company);
		this.status = true;
	}

	public TextBook(String id, double price, String company, boolean status) {
		super("SGK" + id, price, company);
		this.status = status;
	}

	@Override
	public void setId(String id) {
		super.setId("SGK" + id);
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
