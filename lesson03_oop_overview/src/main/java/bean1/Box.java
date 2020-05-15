package bean1;

public class Box {
	private int width;
	private int height;
	
	public Box() {
		
	}
	
	public Box(int width, int height) {
		this.width = width;
		this.height= height;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int GetWidght() {
		return this.width;
	}
	public int GetHeight() {
		return this.height;
	}
	
	
	private int calS() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "width = "+ this.width +" height = "+this.height;
	}

}
