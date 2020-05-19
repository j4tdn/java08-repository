package inheritance;

public class Dog extends Animal {
	private String type;
	private boolean isloyal;

	public Dog() {
		super();

	}
	public Dog(String color, boolean gender, String type) {
		this(color,gender,type,true);

	}
	public Dog(String color, boolean gender, String type, boolean isloyal) {
		super(color, gender);
		this.type = type;
		this.isloyal = isloyal;

	}

	public void security() {
		if (isloyal) {
			System.out.println(getClass().getName() + " security ....");
		} else
			System.out.println("No Value !!!");

	}

	@Override
	public void move() {
		
		System.out.println("Dog is moving");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIsloyal() {
		return isloyal;
	}

	public void setIsloyal(boolean isloyal) {
		this.isloyal = isloyal;
	}

	@Override
	public String toString() {

		return super.toString() + "," + type + "," + isloyal;
	}

}
