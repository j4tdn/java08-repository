package inheritance.multiple;

public interface Interface02 {
	void method02();
	default void log(String str) {
		System.out.println("Interface02:\t"+str);
	}
	
	static void display() {
		System.out.println("Interface02: dispaly()");
	}
}
