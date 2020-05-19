package java08.inheritance.iinterface;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("Dog is moving ");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
