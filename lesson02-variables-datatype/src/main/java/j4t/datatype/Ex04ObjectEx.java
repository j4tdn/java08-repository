package j4t.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println("isDigit "+isDigit(c));
		 * System.out.println("isDigit "+ Character.isDigit(c));
		 */
		
		//Ex
		Integer a = new Integer(10);
		System.out.println("Identify hashcode a\t"+ System.identityHashCode(a));
		System.out.println("a: " + a);
		
		modified(a);
		System.out.println("a: " + a);
		System.out.println("\n======================================");
		Integer x = new Integer(17);
		Integer y= new Integer(22);
		
		swap(x, y);
		System.out.println("a: " + x);
		System.out.println("b: " + y);
	}
	
	private static void modified(Integer a) {
		System.out.println("Identify hashcode a1\t"+ System.identityHashCode(a));
		a = 20;
		System.out.println("Identify hashcode a2\t"+ System.identityHashCode(a));
	}
	
	private static void swap(Integer a, Integer b) {
		Integer temp=a;
		a=b;
		b=temp;
		System.out.println();
	}
	
	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}
	// tham tri: truyen gia tri
	// tham chieu: truyen dia chi o nho
	
}


