package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 0, 7, 8},
				{1, 9, 0, 9},
				{2, 0, 6, 5},
				{1, 2, 4, 5}
		};
		
		findZeroMatrix(matrix);
		print(matrix);
	}
	
	public static void findZeroMatrix(int[][] matrix) {
		// init map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();       
        
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					map.put(i, j);
				}
			}
		}

        Set<Integer> set = map.keySet();
        for (Integer key : set) {            
            transformMatrix(matrix, key, map.get(key));
        }
	}
	
	public static void transformMatrix(int[][] matrix, int row, int col) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
	
	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) 
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}
