package inheritance;

public class Cat extends Animal {
	public Cat() {

	}

	public Cat(String color, boolean gender) {
		// super.setColor(color); // goi set vi dat private nen khong the truy cap thuoc tinh
		// super.setGender(gender);
		super(color, gender);
	}

	public void catchMouse() {
		System.out.println(getClass().getName() + "catching Mouse...");
	}

}
