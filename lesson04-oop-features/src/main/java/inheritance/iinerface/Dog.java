package inheritance.iinerface;

public class Dog implements Animal {
	// anonymous class
	@Override
	public void move() {
		System.out.println("Dog is moving");

	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");

	}
}
