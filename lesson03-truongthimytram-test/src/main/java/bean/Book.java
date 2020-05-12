package bean;

public class Book {
	private String id;
	private String name;
	private String original;
	
	public Book(String id, String name, String original) {
		super();
		this.id = id;
		this.name = name;
		this.original = original;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
