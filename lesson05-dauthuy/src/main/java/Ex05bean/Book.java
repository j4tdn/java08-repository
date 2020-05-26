package Ex05bean;

public class Book {
	private String id;
	private double price;
	private String NXB;
	
	public Book() {
	}

	public Book(String id, double price, String nXB) {
		super();
		this.id = id;
		this.price = price;
		NXB = nXB;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}
	
	
}
