package inheritance;

public class Dog extends Animal {
	private String type;
	private boolean isLoyal;
	
	public Dog(String color, boolean gender, String type) {
		this(color, gender, type, true);
	}

	public Dog(String color, boolean gender, String type, boolean isLoyal) {
		super(color, gender);
		this.type = type;
		this.isLoyal = isLoyal;
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
	/*
	 * luc complite code thi move se tro toi Animal, runtime tro toi Dog
	 */
	@Override
	public void move() {
		System.out.println("Dog (Subclass is moving....)");
	}

	public void security() {
		if(isLoyal) {
			System.out.println(getClass().getName()+"\t scurity...");
		}else {
			System.out.println("No values!");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\tType: "+type+"\tisLoyal: "+isLoyal;
	}
}
