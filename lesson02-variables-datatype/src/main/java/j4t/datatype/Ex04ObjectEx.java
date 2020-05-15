package j4t.datatype;

public class Ex04ObjectEx {
	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println(isDigit(c));
		 * System.out.println(Character.isDigit(c));
		 */
		
		//const pool vungf nhow khi khai bao Interger i = 18
		//Cos bao nhieu cach tao doi tuong
		
		Integer a = 10;
		System.out.println("a :" + a);
//		System.out.println("a hashcode :" + a.hashCode() );
		System.out.println("a system hashcode :" + System.identityHashCode(a));
		modified(a);
		System.out.println("a :" + a);
		System.out.println("a system hashcode :" + System.identityHashCode(a));
		System.out.println("====================================");
		
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(17, 22);
		System.out.println("x :" +x);
		System.out.println("y :" +y);
		
		
		
	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}
	

	public static void modified(Integer x) {
		System.out.println("a system hashcode :" + System.identityHashCode(x));
		x = 20;
		System.out.println("a system hashcode :" + System.identityHashCode(x));
	}
	
	public static void swap(Integer a, Integer b) {
		Integer temp = a;
		a= b;
		b =temp;		
	}
}
