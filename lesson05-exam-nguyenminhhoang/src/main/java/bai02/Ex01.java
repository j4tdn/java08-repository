package bai02;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		int[] Arr = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println(Arr.length);
		int a = getMissingNumber(Arr);
		System.out.println(a);
	}

	public static int getMissingNumber(int[] Arr) {
		int tongArr = 0;
		int tongS = 0;
		for (int i = 0; i < Arr.length; i++) {
			tongArr = tongArr + Arr[i];
		}
		for (int i = 0; i < Arr.length + 1; i++) {
			tongS = tongS + i;
		}
		int a = tongS - tongArr;
		int index = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (a == Arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
