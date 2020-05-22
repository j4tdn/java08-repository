package inheritance.multiple;

public interface Interface01 {
	void method01();
	default void log(String str) {
		System.out.println("Interface01:\t"+str);
	}
	
	static void display() {
		System.out.println("Interface01: dispaly()");
	}
}
