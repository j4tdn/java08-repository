package bean;

public class Book {
	private String id;
	private String name;
	private String NXB;

	public Book() {
		
	}
	public Book(String id, String name, String nXB) {
		super();
		this.id = id;
		this.name = name;
		NXB = nXB;
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
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public String toString() {
		return id+","+name+","+NXB;
	}
	

}
