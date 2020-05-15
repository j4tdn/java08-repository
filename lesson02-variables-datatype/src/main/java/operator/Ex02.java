package operator;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int a = 1;
		a = a + ++a + a++;
		System.out.println("a: " + a);

		int firstMax = 5;
		int secondMax = 3;
		int max = 4;

		if (max > secondMax && max > firstMax) {
			secondMax = firstMax;
			firstMax = max;
		}
	}
}
