package baoyen.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		Integer a=new Integer(10);
		System.out.println("a :"+a);
		System.out.println("a1 system hashcode "+System.identityHashCode(a));
		
		modified(a);
		System.out.println("a :"+a);
		System.out.println("a2 system hashcode "+System.identityHashCode(a));
		
		System.out.println("==================");
		Integer x=new Integer(17);
		Integer y=new Integer(22);
		swap(x,y);

		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}
	private static boolean isDigit(char c) {
		return (c>='0'&&c<'9');
		
	}
	private static void modified(Integer x) {
		System.out.println("x system hashcode "+System.identityHashCode(x));
		x=20;
		System.out.println("x1 system hashcode "+System.identityHashCode(x));
	}
	private static void swap(Integer a,Integer b) {
		Integer tem=a;
		a=b;
		b=tem;
	}

}
