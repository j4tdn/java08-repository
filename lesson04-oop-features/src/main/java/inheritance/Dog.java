package inheritance;

public class Dog extends Animal {
	
	private String type;
	private boolean isLoyal;


	public Dog(String color, boolean gender, String type, boolean isLoyal) {
		super(color, gender);
		this.type = type;
		this.isLoyal = isLoyal;
	}
	
	public Dog(String color, boolean gender, String type) {
		this(color, gender, type, true);
	}


	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		System.out.println("Dog (subClass) is moving ....");
	}

	public void security() {
		if(isLoyal) {
			System.out.println(getClass().getName()+" security");
		}else {
			System.out.println("No value!!!");
		}
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
	
	@Override
	public String toString() {
		return super.toString()+", "+ type+" , isLoyal: "+ isLoyal;
	}
}
