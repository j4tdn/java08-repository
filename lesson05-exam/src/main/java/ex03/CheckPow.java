package ex03;

public class CheckPow {
	public boolean isPowerOf(int a, int b) {
		
		for (int i = 1; i < a/2; i++) {
			if(Math.pow(b,i) == a) {
				return true;
			}
		}
		return false;
	}
}
