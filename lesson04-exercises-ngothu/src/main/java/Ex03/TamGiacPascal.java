package Ex03;

import java.util.Scanner;

public class TamGiacPascal {
	public static void main(String[] args) {

		Pascal();

	}

	public static void Pascal() {
		int A[][] = new int[10][10];
		int n;
		do {
			System.out.println("Nhập chiều cao tam giác: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();

		} while (n > 10);
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j | j == 0) {
					A[i][j] = 1;
					System.out.print(A[i][j]);
				} else {
					A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
					System.out.print(A[i][j]);
				}
			}
			System.out.println();
		}
	}
}
