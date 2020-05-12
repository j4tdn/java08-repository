package java08.lesson02_ex;

import java.util.Arrays;
import java.util.Random;

public class Ex07 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0; i< array.length; i++) {
			boolean checkExist = false;
			while(!checkExist) {
				checkExist = true;
				int temp = 20 + rd.nextInt(11);
				for(int j =0; j < array.length; j++) {
					if(temp == array[j]) {
						checkExist = false;
					}
				}
				array[i] = temp;
			}
		
		}
		
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
