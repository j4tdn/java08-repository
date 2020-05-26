package Ex03;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(4, 2));
		System.out.println(isPowerOf(64, 4));
		

	}
	public static boolean isPowerOf(int a, int b) {
	 if(a==0) return false;
	 int pow = 1;
	 while(pow < a) {
		 pow = pow * b;
		 if(a == pow) return true;
	}
	 return false;	 
	}

}
