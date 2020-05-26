package java08.ungmydieu.lesson05_exam.Ex04;

public class Exercise04 {
	public static void main(String[] args) {
		int[] a = {2, 8, 4, 6};
		System.out.println(getLeastCommonMultiple(a));
	}
	
	public static int getLeastCommonMultiple(int[] a) {		
		int bc = a[0];
		for (int i = 1; i < a.length; i++) {
			bc = lcm(bc, a[i]);
		}
		
		return bc;
	}
	
	public static int gcd(int a, int b) {
		int r = b;
		
		while (b > 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}
}
