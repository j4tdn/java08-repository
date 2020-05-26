package inheritance.multiple;

public interface Interface01 {
	void method01();
	default void log(String string) {
		System.out.println("Interface01 :" + string);
	}

	static void display() {
		System.out.println("Interface01 : display");
	}
}
