package polymorphism.method;

public class MathUtils {

	private MathUtils() {

	}

	/*
	* Overloading: 
	* - Belongs to ONE CLASS
	* - Same Name
	* - Deferrent :
	* 	+ Number of parameters
	* 	+ Data type of parameter
	* 	+ Return type
	 */
	public static int max(int a, int b) {
		return a > b ? a : b; // all doi tuong goi en 1 ham ko anh huong den ket qua tra ve lan nhau
	}


	public static int max(int ...numbers) { //number >= MIN_VALUE
		
		if(numbers.length == 0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];

		for (int num : numbers) {
			max = max(max, num); //tim UCLN, BCNN tung cap
		}
		return max;
	}
	
//	public static int max3So(int a, int b, int c) {
//	return (a > b ? a : b) > c ? (a > b ? a : b) : c; 
//}
//
	
//	if (max < num) {
//	max = num;
//}
}
