package inheritance;

public class Dog extends Animal {

	private String type; // truy cap dung getter, setter
	private boolean isLoyal; // trung thanh
	
	public Dog(String color, boolean gender, String type) {
		this(color, gender, type, true);
	}
	
	public Dog(String color, boolean gender, String type, boolean isLoyal) {
		super(color, gender);
		this.type = type;
		this.isLoyal = isLoyal;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String color, boolean gender) {
		super(color, gender);
	}

	public boolean isLoyal() {
		return isLoyal;
	}

	public void setLoyal(boolean isLoyal) {
		this.isLoyal = isLoyal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void security() {
		if (isLoyal) {
			System.out.println(getClass().getName() + " security ...");
		} else {
			System.out.println("No value");
		}
	}
	
	@Override
	public String toString() {
		//return super.toString(); //goi den toString Animal
		return super.toString()  + ", " + type + ", isLoyal: (" + isLoyal + ")";
	}
	
	@Override
	public void move() {
		super.move();
	}

}

//private String type; //truy cap dung getter, setter
//super, this: thuoc pham vi doi tuong