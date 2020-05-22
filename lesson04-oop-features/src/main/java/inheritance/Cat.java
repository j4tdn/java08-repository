package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		
	}
	public Cat(String color , boolean gender) {
		
		super(color,gender);
		//super.setColor(color);
		//super.setGender(gender);
	}
	
	
//	private void a() {
//		this.move();
//		super.move();
//	}
	private void catchMouse() {
		System.out.println(this.getClass().getName()+ " catching Mouse .....");
	}
}
