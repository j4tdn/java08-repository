package inheritance;

public class Dog extends Animal {
	private String type;
	private boolean isLoyal;

	public Dog() {
		// TODO Auto-generated constructor stub
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
	public void move() {
		System.out.println("Dog (SubClass) is moving ...");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isLoyal() {
		return isLoyal;
	}

	public void setLoyal(boolean isLoyal) {
		this.isLoyal = isLoyal;
	}

	public void security() {
		if (isLoyal) {
			System.out.println(getClass().getName() + "security");
		} else {
			System.err.println(getClass().getName() + "no value !!!");
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", " + type + ", isLoyal: (" + isLoyal + ")";
	}

}
