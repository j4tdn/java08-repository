package nvndatatype;

public class Ex02PrimitiveEx {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		modified(a);
		System.out.println(a);
		System.out.println("---------------------------------------");
		
		int b=20;
		int c=b;
		b=15;
		
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
	}
	
	public static void modified(int a) {
		a=20;
	}

}
