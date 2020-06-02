package Ex02;

import java.util.Scanner;

public class Number {
	public static void output(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "   ");
		}
	}

	public static void Number(int[] array) {
		int[] arays = new int[array.length];
		int tmp = 0;
		int tmp1 = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 != 0) {
				arays[tmp] = array[i];
				tmp++;
			} else if (array[i] % 5 == 0 && array[i] % 7 != 0) {
				arays[tmp1] = array[i];
				tmp1--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 7 == 0 && array[i] % 5 == 0) | (array[i] % 7 != 0 && array[i] % 5 != 0)) {
				arays[tmp] = array[i];
				tmp++;
			}
		}
		System.out.println("tmp :" + tmp);
		output(arays);
	}
}