package inheritance.iiterface;

public class Dog implements Animal{
	@Override
	public void move() {
		System.out.println("a5 is moving");
	}
	
	@Override
	public void eat() {
		System.out.println("a5 is eating");
	}
}
