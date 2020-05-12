package java08.lesson02_ex;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 4;
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + ", " + b + "," + c);
	}
}
