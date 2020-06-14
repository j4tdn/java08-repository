package bean;

public class Bill {
	
	private Client client;
	private Book[] books;
	
	public Bill() {
		
	}
	
	public Bill(Client client, Book[] books) {
		super();
		this.client = client;
		this.books = books;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for(int i = 0; i < this.books.length; i++) {
			totalPrice += books[i].getPrice();		
		}
		return totalPrice;
		
	}
	
	@Override
	public String toString() {
		return this.client.getName() + " " + this.getTotalPrice();
	}
	
	
	
	

	
	

}
