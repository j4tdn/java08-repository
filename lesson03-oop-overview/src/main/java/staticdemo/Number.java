package staticdemo;

public class Number {
	private int a;
	private static int b; //mang 1 o nho duy nhat, co dinh
	
	public static void main(String[] args) {
		Number n1 = new Number(); //da co a va b
		n1.a = 10;
		b = 99; //n1.b = 99;
		
		System.out.println(n1.a);
		System.out.println(n1.b);
		
		Number n2 = new Number(); //da co a va b
		n2.a = 20;
		
		System.out.println(n2.a);
		System.out.println(n2.b);
		
		
	}
	
	public int sum() {
		return 5 + 7; //nonstatic: thuoc pham vi object
	}
	
	public static int sub() { //static: thuoc pham vi class scope
		return 5 - 7;
	}
}
