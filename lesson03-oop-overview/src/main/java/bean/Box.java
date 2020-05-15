package bean;

public class Box {
	private int width;
	private int height;

	
	  public Box() {  }
	 
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public int getwidth(int width) {
		return this.width;
	}

	public int getHeight(int height) {
		return this.height;
	}

	@Override
	public String toString() {
		return "width: " + this.width + "\nheight: " + this.height;
	}

	private int cals() {
		return width * height;
	}

}
