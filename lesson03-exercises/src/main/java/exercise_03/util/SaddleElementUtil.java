package exercise_03.util;

public class SaddleElementUtil {
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int min(int[] a) {
		int min = a[0];
		for (int i : a)
			min = min(min, i);
		return min;
	}
	
	public static void checkSaddleElement(int[][] a, int m, int n) {
		int[] minRow = new int[m];	
		for (int i = 0; i < m; i++)
			minRow[i] = min(a[i]);
		
		// tim max cua cot
		for (int j = 0; j < n; j++)
		{
			int maxCol = a[0][j];
			int posMax = 0;
			for (int i = 0; i < m; i++)
			{
				if (maxCol < a[i][j]) {
					maxCol = a[i][j];
					posMax = i;
				}
			}
			if (a[posMax][j] == minRow[posMax]) 
				System.out.println(String.format("Saddle Element: a[%d][%d] = %d", posMax, j, a[posMax][j]));
		}	
		System.out.println("--- End ---");
	}
}