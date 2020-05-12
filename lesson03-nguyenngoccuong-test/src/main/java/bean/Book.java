package bean;

public class Book {
	private int id;
	private String name;
	private String publisher;
	
	public Book() {
	}
	
	public Book(int id, String name, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}	
	
	@Override
	public String toString() {
		return "+ " + id + ", " + name + ", " + publisher;
	}
	
}
