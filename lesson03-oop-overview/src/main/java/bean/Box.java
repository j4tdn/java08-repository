package bean;

public class Box extends Object {
	// Attribute of Object
	private int width;
	private int height;

	// Default constructor
	public Box() {
	}

	// Constructor
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// setter
	// "this" is current pointer
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// getter
	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	@Override
	public String toString() {
		return "width: " + this.width + "\nheight: " + this.height;
	}
}
