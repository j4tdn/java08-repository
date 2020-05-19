package inheritance;

public class Dog extends Animal {
	private String type;
	private boolean isLoyal;

	public void security() {
		if (isLoyal) {
			System.out.println(getClass().getName() + "security ...");
		} else {
			System.out.println(getClass().getName() + "no security ...");
		}
	}

	@Override
	public void move() {
		System.out.println("Dog(subClass) is moving ...");
	}

	public Dog(String color, boolean gender, String type) {
		this(color, gender, type, true);
	}

	public Dog(String color, boolean gender, String type, boolean isLoyal) {
		super(color, gender);
		this.type = type;
		this.isLoyal = isLoyal;
	}

	@Override
	public String toString() {
		return super.toString() + " -- " + type + " -- " + isLoyal;
	}
}
