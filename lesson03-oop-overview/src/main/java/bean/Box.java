package bean;

public class Box {
	private int width;
	private int height;

	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	private int calS() {
		return width * height;
	}
}
