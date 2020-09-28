package Ex02;

import java.util.Random;

public class App {
	
	
	private static final Random rd = new Random();
	
	public static void main(String[] args) {
		
		int[][] arr = getMatrix();
		
		
		
		printMatrix(arr);
		int[][] newArr = handleRowColumn(arr);
		printMatrix(newArr);
		
	}
	
	
	private static void printMatrix(int[][] arr) {
		for(int i = 0 ; i<5; i++) {
			for(int j = 0 ; j<4; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
			
	}
	
	
	
	private static int[][] getMatrix() {
		int[][] arr = new int[5][4];
		
		for(int i=0 ; i<5; i++) {
			for(int j = 0 ;j<4; j++) {
				arr[i][j] = rd.nextInt(11);
			}
		}
		int iRandom = rd.nextInt(5);
		
		int jRandom = rd.nextInt(4);
		
		arr[iRandom][jRandom] = 0;
		
		return arr ;
	}
	
	private static int[][] handleRowColumn(int[][] arr) {
		
		int[][] newArr = new int[5][4];
		
		for(int i = 0 ;i<5; i++) {
			for(int j = 0 ;j<4; j++) {
				newArr[i][j]  = 1 ;
			}
		}
		
		
		
		// 1
		for(int i= 0 ;i<5; i++)
			for(int j = 0 ; j<4; j++) {
				if(arr[i][j] == 0) {
					
					int ii = i ;
					int jj = j ;
					
					for(int k = 0 ; k <5 ; k++) {
						newArr[k][jj] = 0 ;
					}
					for(int l = 0 ;l < 4; l++) {
						newArr[ii][l] = 0 ;
					}
				}
			}
		
		// 2
		for(int k = 0 ; k<5; k++) {
			for(int l = 0 ; l<4; l++) {
				if(newArr[k][l] != 0 ) {
					
					newArr[k][l] = arr[k][l];
					
				}
			}
		}
		
		return newArr ;
		
	}
	
	
	
	
}
