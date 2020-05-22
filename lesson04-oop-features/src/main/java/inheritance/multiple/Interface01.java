package inheritance.multiple;

public interface Interface01 {

	void method01();
	default void log (String str) {
		System.out.println("Interface 01: ==>  "+str);
	}
	static void display() {
		System.out.println("Interface 01: ==> display");
	}
	
	
}
