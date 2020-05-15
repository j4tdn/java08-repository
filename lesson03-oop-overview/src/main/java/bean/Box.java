package bean;

public class Box {
	//Attribute of Object
	private int width;
	private int height;
	
	//Default Constructor: ho tro gan gia tri khoi tao ban dau, co the gan nhieu gia tri
	public Box() {
		//System.out.println("Ham khoi tao!!!");
	}
	
	public Box(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	//setter: set lai 1 gia tri cho tung thuoc tinh cua no
	//"this" is current pointer
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	//getter: khi muon lay gia tri tung thuoc tinh
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		//return super.toString();
		return "width: " + this.width 
			+ "\nheight: " + this.height;
	}
	
}
