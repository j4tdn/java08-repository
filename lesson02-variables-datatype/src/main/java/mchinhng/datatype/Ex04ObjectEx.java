package mchinhng.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		/*
		 * char c = 'x'; System.out.println("isDigit: " + isDigit(c));
		 * System.out.println("Character: " + Character.isDigit(c));
		 */
		
		//Ex
		Integer a = new Integer(10);
		System.out.println("a: " + a);
		System.out.println("a1 system hashcode: " + System.identityHashCode(a));
		modified(a);
		System.out.println("a: " + a);
		System.out.println("a2 system hashcode: " + System.identityHashCode(a));
		
		System.out.println("----------------");
		
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x,y);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}
	
	private static void modified(Integer x) { //x=a, a khong thay doi
		System.out.println("x1 system hashcode: " + System.identityHashCode(x));
		x=20;
		System.out.println("x2 system hashcode: " + System.identityHashCode(x));

	}
	
	private static void swap (Integer a, Integer b) { //nguyen thuy la tham tri vi truyen gia tri vao
														// doi tuong la tham chieu
		Integer tmp =a;
		a=b;
		b=tmp;
		
	}

}
