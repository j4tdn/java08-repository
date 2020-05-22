package inheritance.muliple;

public interface Interface02 {
	void method02();

	default void log(String str) {
        System.out.println("Interface02:" + str);
	}

	static void display() {
		 System.out.println("Interface02:display()" );
	}
}
