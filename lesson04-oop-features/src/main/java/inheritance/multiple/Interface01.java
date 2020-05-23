package inheritance.multiple;

public interface Interface01 {
	void method01();
	 default void log(String s) {
		System.out.println("Interface0 1:"+s);
	}
	 static void display() {
		 System.out.println("Interface 01: display()");
	 }

}
