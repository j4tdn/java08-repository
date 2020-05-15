package staticdemo;

public class Number {
	private int kk;
	private static int tt;
	
	public static void main(String[] args) {
		Number n1 = new Number();
		n1.kk = 10;
		tt = 99;
		
		System.out.println(n1.kk);
		System.out.println(n1.tt);
		
		Number n2 = new Number();
		n2.kk = 20;
		
		System.out.println(n2.kk);
		System.out.println(n2.tt);
	}
	
	public int sum() {
		return 5 + 7;
	}
	
	public static int sub() {
		return 5 - 7;
	}
}
