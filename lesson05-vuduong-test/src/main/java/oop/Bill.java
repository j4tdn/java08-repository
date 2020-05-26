package oop;

public class Bill {
	private String id;
	private Customer customer;
	private Book[] books;

	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bill(String id, Customer customer, Book[] books) {
		super();
		this.id = id;
		this.customer = customer;
		this.books = books;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

}
