package inheritance;

public class Animal {
// class dung de chi ra cac pt tt thi k dung ham main
	private String color;
	private boolean gender;
	
	public Animal() {
	}
	
	public Animal(String color, boolean gender) {
		//super();// ngoai la 1 doi tuong con la 1 ham
		this.color = color;
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void move() {
		System.out.println(getClass().getName()+"  Animal => Moving.......");
	}
	
    public void eat() {
    	System.out.println(getClass().getName()+"  Animal => Eating.......");
	}
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return color+","+(gender? "Male":"Female");
    	}
    
}
