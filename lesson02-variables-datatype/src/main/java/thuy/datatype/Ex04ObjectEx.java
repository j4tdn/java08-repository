package thuy.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		System.out.println("a: " + a); 
		System.out.println("a1 system hashcode:" + System.identityHashCode(a));
		
		modified(a);
		System.out.println("a: " + a); 
		System.out.println("a2 system hashcode:" + System.identityHashCode(a));
		
		System.out.println("=================");
		Integer x = new Integer(17);
		Integer y = new Integer(22); 
		swap(x, y);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		/*
		 * char c = '5'; System.out.println("isDigit:" + isDigit(c));
		 * System.out.println("isDigit:" + Character.isDigit(c));
		 */
	}
	
	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return ( c >= '0' && c <= '9'); //bthuc dung return true, sai return false
	}
	
	private static void modified(Integer x) {
		x = 20;
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}

}


//Ctrl + Shift + / : cmt
// Mo cmt: Ctrl + Shift + \
// nguyen thuy: tham chieu
// doi tuong: tham tri
//Ctr + Alt + xuong: copy 1 dong
// Tao doi tuong trong java co bao nhieu cach