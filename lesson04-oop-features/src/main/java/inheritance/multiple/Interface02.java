package inheritance.multiple;

public interface Interface02 {
	void method02();

	default void log(String s) {
		System.out.println("Interface 02:"+s);
	}
	 static void display() {
		 System.out.println("Interface 02: display()");
	 }
}
