package main;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = {1,3,2,4,3,3,9,6,7,6};	
		int[] tmp;
		 tmp = addElement(numbers, 10, 4);
		//tmp = delElement(numbers, 7);
		
		Arrays.stream(tmp).forEach(t ->System.out.println(t));
	}
	private static int[] addElement(int[] numbers, int val, int index) {
		int[] tmp = new int[numbers.length];
		for (int i =0; i < tmp.length; i++) {
			if ( i < index) {
				tmp[i] = numbers[i];
			}
			if (i == index) {
				tmp[i] = val;
			}
			if (i > index) {
				tmp[i] = numbers[i-1];
			}
		}
		return tmp;
	}
	private static int[] delElement(int[] numbers, int index) {
		int[] tmp = new int[numbers.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			if(i < index) {
				tmp[i] = numbers[i];
			}
				
			if(i >= index) {
				tmp[i] = numbers[i+1];
			}
		}
		return tmp;
	}
}
