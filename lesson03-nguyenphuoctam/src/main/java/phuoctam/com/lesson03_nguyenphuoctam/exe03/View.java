package phuoctam.com.lesson03_nguyenphuoctam.exe03;

import java.util.Random;

public class View {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int m = 3, n = 4;
		int[][] array = new int[m][n];
		array = inputArray(m, n);
		outputArray(array);
		int result = yenNgua(array);
		if (result > 0) {
			System.out.println("phần tử yên ngựa là : " + result);
		} else {
			System.out.println("không có phần tử yên ngựa");
		}

	}

	private static int timMin(int[][] array, int row, int column) {
		int min = 99;
		for (int i = 0; i < column; i++) {
			if (array[row][i] < min) {
				min = array[row][i];
			}
		}
		return min;
	}

	private static int timMax(int[][] array, int row, int column) {
		int max = 0;
		for (int i = 0; i < row; i++) {
			if (array[i][column] > max) {
				max = array[i][column];
			}
		}
		return max;
	}

	private static int yenNgua(int[][] array) {
		int result=0;
		int min=array[0][0];
		int max=array[0][0];
		int row=array.length;
		int column=array[0].length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j]==timMin(array, i, column)&&array[i][j]==timMax(array, row, j)  ){
					result=array[i][j];
				}
			}
		}
		return result;
	}

	private static int[][] inputArray(int m, int n) {
		Random rd = new Random();
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = rd.nextInt(10) + 1;
			}
		}
		return array;
	}

	private static void outputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
