package inheritance.multiple;

public interface Interface02 {
	void method02();
	default void log(String string) {
		System.out.println("Interface02 :" + string);
	}

	static void display() {
		System.out.println("Interface02 : display");
	}
}
