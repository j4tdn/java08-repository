package inheritance.test;

public class SubClass extends SuperClass{
	public int num = 99;
	public String test = "sub";
	
	public void log() {
		System.out.println("sub => Log ...");
	}
}
