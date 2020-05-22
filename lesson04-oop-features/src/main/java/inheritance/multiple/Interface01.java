package inheritance.multiple;

public interface Interface01 {
	void  method01();  // hàm trừu tượng... bắt buộc over
	
	default void log(String str) {
		System.out.println("Interface01: "+ str);
	}
	static void display() {
		System.out.println("Interface01: display() ");

	}
}
