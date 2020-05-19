package inheritance.test;

import inheritance.iinterface.Animal;

public class Dog implements Animal {
	
	@Override
	public void move() {
		System.out.println("Dog is moving");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}
