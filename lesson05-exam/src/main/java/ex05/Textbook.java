package ex05;

public class Textbook {
	private String idTextBook;
	private int priceTextBook;
	private String publisher;
	private boolean status;

	public Textbook(String idTextBook, int priceTextBook, String publisher, boolean status) {
		super();
		this.idTextBook = idTextBook;
		this.priceTextBook = priceTextBook;
		this.publisher = publisher;
		this.status = status;
	}

	public String getIdTextBook() {
		return idTextBook;
	}

	public void setIdTextBook(String idTextBook) {
		this.idTextBook = idTextBook;
	}

	public int getPriceTextBook() {
		return priceTextBook;
	}

	public void setPriceTextBook(int priceTextBook) {
		this.priceTextBook = priceTextBook;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Textbook [idTextBook=" + idTextBook + ", priceTextBook=" + priceTextBook + ", publisher=" + publisher
				+ ", status=" + status + "]";
	}

}
