package ex_08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String A = "ABCEDEABC";
		String B = "ABCEDCBBCK";
		char[] c = A.toCharArray();
		char[] d = B.toCharArray();
		find(A.toCharArray(), B.toCharArray());
	}

	public static void find(char[] A, char[] B) {
		int[][] LCS = new int[A.length + 1][B.length + 1];
		//Nếu A null thì lcs của A,B=0
		for (int i = 0; i <= B.length; i++) {
			LCS[0][i] = 0;
		}

		//Nếu B null thì lcs của A,B=0
		for (int i = 0; i <= A.length; i++) {
			LCS[i][0] = 0;
		}

		// điền vào phần còn lại của mảng
		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i - 1] == B[j - 1]) {
					LCS[i][j] = LCS[i - 1][j - 1] + 1;
				} else {
					LCS[i][j] = 0;
				}
			}
		}
		int result = -1;
		for (int i = 0; i <= A.length; i++) {
			for (int j = 0; j <= B.length; j++) {
				if (result < LCS[i][j]) {
					result = LCS[i][j];
				}
			}
		}
		for (int i = 0; i < result; i++) {
			System.out.print(A[i]);
		}
		

	}

}
