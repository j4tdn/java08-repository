package inheritance.test;

public class SubClass extends SuperClass{
	//k override dc thuoc tinh trong subclass
	public int num = 99;
	public String text = "sub";
	
	@Override
	public void log() {
		System.out.println("Sub => log ...");
	}


}