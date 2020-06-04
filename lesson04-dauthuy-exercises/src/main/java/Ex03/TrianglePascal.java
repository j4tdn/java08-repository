package Ex03;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int arr[][] = new int [n + 1][n+2];
		for (int i = 1; i < n + 1; i++) {
			arr[0][0] = 1;
			arr[0][1] = 1;
			arr[i][0] = 1;
			for (int j = 1; j <= i; j++){
				arr[i][i + 1] = 1;
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}		
		}
		output(arr);
	}
	
	public static void output(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
