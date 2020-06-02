package lesson05.exam;

public class Book {
	private String id;
	private int price;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param price
	 * @param author
	 */
	public Book(String id, int price, String author) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", author=" + author + "]";
	}
	
	

}
