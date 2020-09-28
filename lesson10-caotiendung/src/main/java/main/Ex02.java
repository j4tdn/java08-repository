package main;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3, 4}, {5, 6, 8, 7}, {1, 9, 0, 9}, {2, 9, 6, 5}, {1, 2, 4, 5}};
		printf(numbers);
		System.out.println("====================");
		printf(matrix(numbers));
	}

	private static void printf(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static int[][] matrix(int[][] numbers){
        int[] col = new int[numbers[0].length];
        int[] row = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] == 0) {
                    row[i] = 0;
                    col[j] =0;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    numbers[i][j] = 0;
                }
            }
        }
   
		return numbers;
		
	}
}
