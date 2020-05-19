package inheritance;

public class Animal {
	private String color;
	private boolean gender;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String color, boolean gender) {
		super();
		this.color = color;
		this.gender = gender;
	}

	public void move() {
		System.out.println(getClass().getName() + " => moving ...");
	}

	public void eat() {
		System.out.println(getClass().getName() + " => eating ...");
	}

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

	@Override
	public String toString() {
		return color + ", " + (gender ? "Male" : "Female");
	}
}
