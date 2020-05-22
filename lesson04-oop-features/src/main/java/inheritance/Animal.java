package inheritance;

public class Animal {
	private String color ;
	private boolean gender ;
	
	
	public Animal() {
		
	}
	
	public Animal(String color, boolean gender) {
		
		this.color = color;
		this.gender = gender;
	}
	public void move() {
		System.out.println(this.getClass().getName()+" => moving ......");
	}
	protected void eat() {
		System.out.println( getClass().getName()+" => eating .....");
	}
	@Override
	public String toString() {
		
		return this.color + " " + (this.gender ? "Male" : "Female");
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color ;
	}
	public boolean getGender() {
		return this.gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	//default method 
	
	void sayHello() {
		
	}
}
