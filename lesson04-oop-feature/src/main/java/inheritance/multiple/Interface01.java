package inheritance.multiple;

public interface Interface01 {
	void method01();
	
	default void log(String log) {
		System.out.println("Interface 01: " + log);
	}
	
	static void display() {
		System.out.println("Interface 01: display");
	}
}
