package polymorphism.object;

public class Man extends Person{

	@Override
	public String toString() {
		return "hello " ;
		
		//return super.toString();
	}
	
	
	@Override
	public String getGender() {
		return "Male";
	}
	
	
}
