package bean;

public class Box {
	private int width;
	private int height;
	
	
	//Default contructor	
	public Box() {
		
	}
	
	//contructor
	public Box(int width, int height) {
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
		return width * height ;
	}
	@Override
	public String toString() {
		return "width: "+ this.width +"\nheight: "+ this.height;
	}
}
