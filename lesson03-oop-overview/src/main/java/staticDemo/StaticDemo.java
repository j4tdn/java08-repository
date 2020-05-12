package staticDemo;

public class StaticDemo {
	public static void main(String[] args) {
		test("c");
	}
	
	public static void test(String ss) {
		System.out.println(ss);
	}
	
	private void printf(String s) {
		System.out.println("Value " +s);
		cout("s");
	}
	
	private void cout(String s) {
		System.out.println("Value " +s);
		test("hello");
	}
	
	
}
// static goị non static khoogn được 

// non static gọi static và non static được 


// hàm static được khởi tạo đầu tiên ở HEAP 

// Suy ra static được khởi tạo trước non static 
