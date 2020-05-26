package bai01;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] Arr = new int[20];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = rd.nextInt(100);
		}
		int[] A = sortArray(Arr);
		int[] B = getUniqueNumbers(A);
		for (int i = 0; i < B.length; i++) {
			System.out.println("  " + B[i]);
		}
	}

	public static int[] getUniqueNumbers(int[] Ar) {
		int[] Arr = null;
		int j = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (Ar[i] != Ar[i + 1]) {
				Arr[j] = Ar[i];
				j = j + 1;
			}
		}
		return Arr;

	}

	public static int[] sortArray(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int[] ArrSort = arr;
		return ArrSort;
	}
}
