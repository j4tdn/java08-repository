package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		
	}
	public Cat(String color, boolean gender) {
		super(color, gender);  //goi contructor been lop cha
	}
	
	public void catMouse() {
		System.out.println(getClass().getName()+ " catching mouse...");
	}
	
	

}
