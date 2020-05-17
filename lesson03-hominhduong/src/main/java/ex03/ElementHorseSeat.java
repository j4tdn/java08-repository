package ex03;

import java.util.Random;

public class ElementHorseSeat {
	
	public static void main(String[] args) {
		int [][] matrix =initMatrix(3, 5);
		printMatrix(matrix);
		intersectionArray(findMinElementEachRow(matrix), findMaxElementEachCol(matrix));
	}

	public static int[][] initMatrix(int rows, int cols) {
		int[][] arrRes = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arrRes[i][j] = new Random().nextInt(50);
			}
		}
		return arrRes;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" " + matrix[i][j] + "  ");
				} else {
					System.out.print(matrix[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}

	public static int[] findMinElementEachRow(int[][] matrix) {
		int[] arrMinEachRow = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			int minInt = Integer.MAX_VALUE;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < minInt) {
					minInt = matrix[i][j];
				}
			}
			arrMinEachRow[i] = minInt;
		}
		return arrMinEachRow;
	}

	public static int[] findMaxElementEachCol(int[][] matrix) {
		int[] arrMaxEachRow = new int[matrix[0].length];
		int col_i = 0;
		while (col_i < matrix[0].length) {
			int maxInt = Integer.MIN_VALUE;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][col_i] > maxInt) {
					maxInt = matrix[i][col_i];
				}
			}
			arrMaxEachRow[col_i] = maxInt;
			col_i++;
		}
		return arrMaxEachRow;
	}
	
	
	public static void intersectionArray(int [] array1, int [] array2) {
		for(int i=0;i<array1.length;i++)
		  {
		    for(int j=0;j<array2.length;j++)
		    {
		      if(array1[i]==array2[j])
		      {
		        System.out.println("Element hourse seat is \t"+array1[i]);
		      }
		    }
		  }

	}
}
