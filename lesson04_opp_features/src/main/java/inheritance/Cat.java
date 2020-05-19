package inheritance;

public class Cat extends Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
		System.out.println("Cat constructor");
	}

	public Cat(String color, boolean gender) {
		// TODO Auto-generated constructor stub
		super(color, gender);
	}

	public void catchMouse() {
		System.out.println(getClass().getName() + "\t catch mouse");
	}
}
