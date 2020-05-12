package java08.lesson03_ungmydieu_test;

public class Book {
	private int id;
	private String name;
	private String original;
	
	public Book() {}

	public Book(int id, String name, String original) {
		super();
		this.id = id;
		this.name = name;
		this.original = original;
	}
	
	@Override
	public String toString() {		
		return "\n\tBook : " + this.id + ", " + this.name + ", " + this.original;
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

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}	
}
