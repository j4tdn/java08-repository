package inheritance;

public class Cat extends Animal {
	
	public Cat() {
		System.out.println("cat contructor");
	}
	
	public Cat(String color, boolean gender) {
		super(color, gender);
	}
	
	private void catchMouse () {
		System.out.println(getClass().getName() + "\t catch mouse");
	}
	
}
