package bean;

public class Box {
	private int width;
	private int height;

	public Box(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public Box() {
		this.width=0;
		this.height=0;
	}
	// setter
	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	private int cals() {
		return width * height;
	}

	@Override
	public String toString() {
		return "width: "+this.width+ "  height: "+this.height;
	}
}
