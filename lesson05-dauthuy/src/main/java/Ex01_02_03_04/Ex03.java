package Ex01_02_03_04;

public class Ex03 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		System.out.println(isPowerOf(a, b));
	}
	
	public static boolean isPowerOf(int a, int b) {
		if(a * a == b) {
			return true;
		}
		return false;
	}
}
