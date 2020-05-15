package nvndatatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * char c = 'x';
		 * System.out.println("Digit:" + isDigit(c));
		 * System.out.println("UP:" + Character.isUpperCase(c));
		 */

		
		//Ex2
		Integer a = new Integer(10);
		System.out.println(a);
		System.out.println("a1 syshashcode: "+ System.identityHashCode(a));
		modified(a);
		System.out.println(a);
		System.out.println("a2 syshashcode: "+ System.identityHashCode(a));
		
		System.out.println("========================");
		//Ex3
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x,y);
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
	}
	public static void modified(Integer a) {
		System.out.println("a3 syshashcode: "+ System.identityHashCode(a));
		a = 20;
		System.out.println("a4 syshashcode: "+ System.identityHashCode(a));
	}
	private static boolean	isDigit(char c) {
		return (c>='0' && c<= '9') ;
		
	}
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		
	}

	

}
