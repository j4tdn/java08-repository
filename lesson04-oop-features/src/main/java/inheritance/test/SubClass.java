package inheritance.test;

public class SubClass extends SuperClass {
	public int num = 99;
	public String test = "parent";
	
	@Override
	public void log() {
		System.out.println("Sub ==> Log ....");
	}
}
