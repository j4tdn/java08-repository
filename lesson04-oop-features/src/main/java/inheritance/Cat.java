package inheritance;

public class Cat extends Animal{
	/*private void a() {
		this.move();
		// = 
		super.move();
	}*/
	public Cat() {
		
	}
	public Cat(String color, boolean gender) {
		super(color, gender);
	}
	public void catchMouse() {
		System.out.println(getClass().getName() + "catching mouse");
	}

}
