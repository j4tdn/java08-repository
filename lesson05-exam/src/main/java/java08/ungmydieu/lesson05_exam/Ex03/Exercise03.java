package java08.ungmydieu.lesson05_exam.Ex03;

public class Exercise03 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(16, 4));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
		
	}
	
	public static boolean isPowerOf(int a, int b) {
		if (a == 0 || b == 0) return false;
		
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}		
		
		int check = b;
		while (check < a) {
			check *= b;
		}		
		
		return check == a;
	}
}
