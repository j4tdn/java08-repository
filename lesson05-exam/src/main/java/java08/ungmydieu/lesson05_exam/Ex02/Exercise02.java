package java08.ungmydieu.lesson05_exam.Ex02;

public class Exercise02 {
	public static void main(String[] args) {
		int[] a = {4,2,5,3};
		System.out.println("Missing Number is: " + getMissingNumber(a));
	}
	
	public static int getMissingNumber(int[] a) {
		for (int i = 0; i < a.length-1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
		
		for (int i = 1; i < a.length; i++)
			if (a[i] != (a[i-1] + 1))
				return a[i-1] + 1;
		
		return a[0] - 1;
	}
}
