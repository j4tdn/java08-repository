package com.haubui.view;

import java.util.Arrays;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] numbers = new int[5];
		StringBuilder temp = new StringBuilder("");
		int i = 0;

		while (i < numbers.length) {

			int element = rd.nextInt(11) + 20;

			if (temp.indexOf(element + "") == -1) {
				temp.append(element + " ");
				numbers[i] = element;
				i++;
			} 

		}

		System.out.println(Arrays.toString(numbers));
	}

}
