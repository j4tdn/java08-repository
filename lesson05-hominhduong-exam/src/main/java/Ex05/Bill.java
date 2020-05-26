package Ex05;

public class Bill {
	private Customer customer;
	private Book[] books;
	private double totalmoney;
	
	public Bill(Customer customer, Book[] books) {
		super();
		this.customer = customer;
		this.books = books;
	}

	public double getTotalmoney() {
		double money=0;
		for (Book book : books) {
			// spit id , --> sum money
			String id =book.getIdBook();
			if(id.matches("[SGK]")) {
				
			}
		}
		
		return totalmoney;
	}
	
	
	
	
}
