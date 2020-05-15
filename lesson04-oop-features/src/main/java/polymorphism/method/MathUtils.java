package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	/**
	 * Overloading 
	 * + Belongs to one class
	 * + Same name 
	 *	different 
	 *		- Number of parameters 
	 *		- Data type of parameters
	 *		- Return type 
	 */		
	
	
	
	
	
	// ket qua cua ham ma khi goi doi tuong nao cung tra ve mot gia tri giong nhau thi dung static ( co nghia la khong phu thuoc vao doi tuong goi no )
	
	public static int max(int a, int b) {
		
		return a>b ? a : b;
		
	}
	public static double max(double a, double b) {
		return a>b ? a : b;
	}
	public static int max(int a,int b,int c) {
		return (a>b ? a : b) >c ? (a>b ? a : b) : c;
	}
	public static int max(int... numbers) {
		
		//int max = Integer.MIN_VALUE;
		
		if(numbers.length ==0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		
		int max = numbers[0];
		for(int num:numbers) {
			//if(max < num) {
				//max = num;
			//}
			max = max(num,max);
		}
		return max ;
		
	}
}
