package inheritance.test;

public class SuperClass {
	public int num = 10;
	public String text = "Parent";
	
	public void log() {
		System.out.println("Parent => Log .... ");
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
