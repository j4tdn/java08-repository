// Ctrl + Shift + T: tim Class
package inheritance;

public class Animal {
	private String color;
	private boolean gender;
	
	public Animal() {
		
	}
	
	public Animal(String color, boolean gender) {
		this.color = color;
		this.gender = gender;
	}
//	
//	public Animal(String color, boolean gender) {
//		//super(); //
//		this.color = color;
//		this.gender = gender;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void move() {
		//System.out.println(getClass().getName() +  " => moving ...");
		System.out.println("Dog(Subclass) is moving ...");
	}
	
	public void eat() {
		System.out.println(getClass().getName() + " => eating ...");
	}
	
	@Override
	public String toString() {
		return color + ", " + (gender ? "Male" : "Female");
	}
}
