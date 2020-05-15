package thuy.datatype;

public class Ex02PrimitiveEx { //kieu du lieu nguyen thuy
	public static void main(String[] args) {
		int a = 10;
		modified(a);
		System.out.println("a:" + a);
		
		System.out.println("---------");
		int b = 20;
		int c = b;
		b = 15;
		System.out.println("b:" + b);
		System.out.println("c: " + c);
	}
	
	private static void modified(int a) {
		a = 20;
	}
}
