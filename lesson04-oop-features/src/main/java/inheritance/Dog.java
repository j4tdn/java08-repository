package inheritance;

public class Dog extends Animal{
	
	private String type ;
	private boolean isLoyal;
	
	public Dog(String color, boolean gender, String type) {
		this(color, gender,type,true);
	}
	
	public Dog(String color, boolean gender,String type , boolean isLoyal) {
		super(color, gender);
		this.type = type ;
		this.isLoyal  = isLoyal;
		
	}
	public void security() {
		if(this.isLoyal) {
			System.out.println(this.getClass().getName() + "security >>>>");
			return ;
		}
		System.out.println("No Value");
		
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getIsLoyal() {
		return this.isLoyal;
	}
	public void setIsLoyal(boolean isLoyal) {
		this.isLoyal = isLoyal;
	}
	@Override
	public String toString() {
		return super.toString() + "type :" +this.type + "isLoyal" + this.isLoyal; 
	}
	
	@Override
	public void move() {
		System.out.println("Dog(Sub class ) is moving ....");
	}
	
	
}
