package j4t_datatype;

public class Ex02Primitive {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a :" + a);
		modified(a);
		System.out.println("a :" + a);

		System.out.println("-------------------");
		int x = 10;
		int y = 20;
		x = 15;
		System.out.println("x " + x);
	}

	private static void modified(int a) {
		a = 20;
	}
}
