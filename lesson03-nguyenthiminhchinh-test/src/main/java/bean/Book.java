package bean;

public class Book {
	private String id;
	private String name;
	private String nxb;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, String name, String nxb) {
		super();
		this.id = id;
		this.name = name;
		this.nxb = nxb;
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

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	
	@Override
	public String toString() {
		return id + ", " + name +" , " + nxb;
	}

}
