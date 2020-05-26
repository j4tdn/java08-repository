package view;

public class Bai2 {
	public static void main(String[] args) {
		int[] array = { 8,4,6,3,5,9,7,1 };
		int missingNumber = getMissingNumber(array, 9);
		System.out.println(missingNumber);
	}
	public static int getMissingNumber(int[] array, int n) {
		int i, sum = 0; 
		for (int number = 1; number <= n; number++) {
			sum += number;
		}
        for (i = 0; i < n - 1; i++) 
        	sum -= array[i]; 
        return sum; 
	}
}
