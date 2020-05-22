package inheritance.multiple;

public interface Interface02 { //~ abstract class java8

	void method02();

	default void log(String str) {
		System.out.println("Interface02: "+ str);
	}
	
	static void display() { //co the goi bang Interface ~ Class
		System.out.println("Interface02: display()");
	}
}
