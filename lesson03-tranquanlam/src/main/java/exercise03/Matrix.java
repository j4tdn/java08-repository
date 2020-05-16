package exercise03;

import java.util.Scanner;

public class Matrix {
	private int m;
	private int n;
	private int matrix[][];

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix() {
		this.matrix = new int[this.m][this.n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("nhap ma tran M [" + i + "][" + j + "]=");
				this.matrix[i][j] = sc.nextInt();
			}
		}

	}

	@Override
	public String toString() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
		return "";
	}

	public boolean checkHorseItemExist() {
		boolean maxCollum ;
		boolean minRow ;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maxCollum = true;
				minRow = true;
				for (int j2 = 0; j2 < m; j2++) {
					if (this.matrix[i][j2] <= matrix[i][j] && j2 != j) {
						minRow = false;
						break;
					}
				}

				for (int i2 = 0; i2 < n; i2++) {
					if (this.matrix[i2][j] >= matrix[i][j] && i2 != i) {
						maxCollum = false;
						break;
					}
				}

				if (maxCollum && minRow) {
					return true;
				}
			}
		}
		return false;
	}
}
