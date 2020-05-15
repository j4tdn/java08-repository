package bean; //chua pojo object: pojo: plan, class binh thuong
//entity
//dto

public class Box {
	// Attribute of Object
	private int width;
	private int height;

	// Default Constructor
	public Box() {
		//System.out.println("Ham khoi tao");
	}

	public Box(int widht, int height) {
		this.width = widht;
		this.height = height;
	}

	// setter
	public void setWidth(int width) {
		// "this" is current pointer, cua doi tuong hien tai
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeigh() {
		return this.height;
	}

	@Override
	public String toString() {
		return "width: " + this.width + "\nheight: " + this.height;
	}
}
