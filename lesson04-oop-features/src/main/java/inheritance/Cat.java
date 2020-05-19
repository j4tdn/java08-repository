package inheritance;

public class Cat extends Animal {
	public Cat() {
		
	}
	public Cat(String color,boolean gender) {
		super(color, gender);
	}
	
	public void catchMouse() {
		System.out.println(getClass().getName()+"catch mouse");
	}

}
