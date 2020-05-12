package bean;

public class Box {

	private int width ;
	private int height ;
	
	public Box(int width , int height ) {
		this.width  = width ;
		this.height = height ;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void getHeight(int height) {
		this.height = height;
	}
	public String toString() {
		return "hello toi la box co width =" +this.width + "va height =" +this.height; 
		
	}
	
	

}
