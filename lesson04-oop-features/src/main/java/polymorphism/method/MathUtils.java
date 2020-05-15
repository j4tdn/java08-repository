package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}

	/**
	 * overloading: thuoc cung class 
	 * giong ten
	 * khac kieu du lieu tra ve, so luong tham so , kieu du lieu tham so truyen vao,
	 */
	public static  int max(int a,int b) {
		return a>a?a:b;
	}
	
	public static  double max(double a,double b) {
		return a>a?a:b;
	}
	public static  int max(int a,int b,int c) {
		return max(max(a,b),c);
	}
	public static  int max(int ...numbers) {
		
		if(numbers.length==0) {
			System.out.println("IndextOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max=numbers[0] ;
		for (int num:numbers) {
			max=max(num,max);
		}
		return max;	
	}
}
