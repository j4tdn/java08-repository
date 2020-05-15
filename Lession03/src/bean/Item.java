package bean;

public class Item {
	private String id;
	private String os;
	private double price;
	private String color;

	public Item() {
	}

	public Item(String id, String os, double price, String color) {
		this.id = id;
		this.os = os;
		this.price = price;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", os=" + os + ", price=" + price + ", color=" + color + "]";
	}

}
