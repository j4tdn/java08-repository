package exercise_03.view;

import java.util.Scanner;

import exercise_03.util.SaddleElementUtil;

public class SaddleElement {
	public static void main(String[] args) {
//		int[][] a = {{7, 47, 36},
//					 {24, 43, 31},	
//					 {6, 7, 29}};
		
		Scanner sc = new Scanner(System.in);
		int m;
		int n;		
		
		System.out.println("Enter Size of array: ");
		m = sc.nextInt();	sc.nextLine();		
		n= sc.nextInt();	sc.nextLine();
		int a[][] = new int[m][n];
		
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
			{
				System.out.print(String.format("a[%d][%d] = ", i, j));
				a[i][j] = sc.nextInt(); sc.nextLine();
			}	
		
		SaddleElementUtil.checkSaddleElement(a, m, n);
	}		
}