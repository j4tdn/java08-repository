package inheritance.multiple;

public interface Interface02 {
	void method02();

	default void log(String log) {
		System.out.println("Interface 02: " + log);
	}

	static void display() {
		System.out.println("Interface 02: display");
	}
}
