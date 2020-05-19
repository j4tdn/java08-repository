package inheritance.iiterface;

public class Cat implements Animal{

	@Override
	public void move() {
		System.out.println("Cat is moving .... ");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating .... ");
	}

}
