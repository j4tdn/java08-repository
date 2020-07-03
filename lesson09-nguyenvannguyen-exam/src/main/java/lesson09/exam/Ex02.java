package lesson09.exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n = inputN();
		String[] stringInput = new String[n];
		int k = 0;
		while(k<n) {
			stringInput[k] = inputString(k);
			k++;
		}
		
		for(int i=0;i<stringInput.length;i++) {
			String[] getNumber = getLargestNumbers(stringInput[i]);
			System.out.println(getNumber[i]);
			int max = maxNumber(getNumber);
			System.out.println("Max của chuỗi thứ " + (i+1)+" là: " + max);
		}
	}
	
	public static int inputN() {
		int n=0;
		Scanner ip= new Scanner(System.in);
		System.out.println("nhập số chuỗi n: ");
		n = Integer.parseInt(ip.next());
		
		return n;
	}
	
	public static String inputString(int n) {
		String str = "";
		Scanner ip= new Scanner(System.in);
		System.out.println("nhập chuỗi thứ "+n+" :");
		str = ip.nextLine();
		return str;
	}
	
	public static String[] getLargestNumbers(String str) {
		String[] numbers = str.trim().split("[A-Za-z]+"); //
		return numbers;
	}
	
	public static int  maxNumber(String[] numbers) {
		int[] number = new int[numbers.length];
		
		for(int i=0;i<number.length;i++) {
			System.out.println(numbers[i]);
			number[i] = (int) Integer.parseInt(numbers[i]);
		}
		int max = number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>max) {
				max = number[i];
			}
		}
		return max;
	}

}
