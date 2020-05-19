package inheritance.iinterface;

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("a5 is eating...");
	}

	@Override
	public void Move() {
		System.out.println("a5 is moving...");
	}
}
