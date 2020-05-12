package phd.datatype;

public class Ex04ObjectEX {

	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println("isDigit"+isDigit(c));
		 * System.out.println(Character.isDigit(c));
		 */
		
		Integer a = new Integer(10);
		System.out.println();
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		modified(a);
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		System.out.println("=================================");
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x,y);
		System.out.println(x);
		System.out.println(y);
		
		
	}
	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return(c>='0'&& c<='9');
	}
	private  static void modified(Integer a) {
		a = 20;
		System.out.println(System.identityHashCode(a));
}

	private static void swap(Integer a , Integer b)
	{
		Integer  tmp = a ;
		a=b ;
		b =tmp ;
	}
	
}

