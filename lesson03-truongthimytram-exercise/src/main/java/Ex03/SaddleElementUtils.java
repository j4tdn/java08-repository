package Ex03;

import java.util.Random;

public class SaddleElementUtils {
	private static Random rd = new Random();
	private SaddleElementUtils() {
		
	}
	public static void inputArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = 1 + rd.nextInt(99);
			}
		}
	}
	public static void outputArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.format("%10s", array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int minRow(int[][] array, int row) {
        int min = array[row][0];
        for (int j = 0; j < array[0].length; j++) {
            if (array[row][j] < min) {
                min = array[row][j];
            }
        }
        return min;
    }

    private static int maxCol(int[][] array, int col) {
        int max = array[0][col];
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] > max) {
                max = array[i][col];
            }
        }
        return max;
    }
	
	public static void checkSaddle(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				if(array[i][j] == minRow(array, i) && array[i][j] == maxCol(array, j)) {
					System.out.println("Mảng có phần tử yên ngựa là: " + array[i][j]);
					return;
				}
			}
			
		}
		System.out.println("Mảng không có phần tử yên ngựa nào!");
	}

}
