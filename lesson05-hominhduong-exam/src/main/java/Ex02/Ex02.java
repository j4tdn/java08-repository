package Ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 1, 10, 3, 4, 5, 6, 7, 9, 8 };
	}

	public static int getMissingNumber(int[] arr) {
		// 1-10 :
		// 1,10,3,4,5,6,7,9,8
		// 1 2 3 4 5 6 7 8 9 10
		int[] arrFull = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrtemp = new int[arr.length];
		//hieu hai mang
		
		return 0;
	}
	
	public static boolean isUniqueNumbe(int[] arr, int index) {
		for (int i = 0; i < arr.length; i++) {
			if (index == i) {
				continue;
			} else if (arr[index] == arr[i]) {
				return false;
			}
		}
		return true;
	}
}
