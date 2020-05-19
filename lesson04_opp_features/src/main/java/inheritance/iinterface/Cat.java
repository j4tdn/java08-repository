package inheritance.iinterface;

public class Cat implements Animal{

	@Override
	public void move() {
		System.out.println("cat is moving");
	}

	@Override
	public void eat() {
		System.out.println("cat is eating");
	}

}
