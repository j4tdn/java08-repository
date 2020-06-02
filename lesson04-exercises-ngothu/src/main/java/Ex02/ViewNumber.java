package Ex02;

import java.util.Scanner;

public class ViewNumber {
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử của mảng: ");
		Scanner sc = new Scanner(System.in);
		int numberarray = sc.nextInt();
		System.out.println("Nhập mảng cần sắp xếp: ");
		int[] array = new int[numberarray];
		for (int i = 0; i < array.length; i++) {
			System.out.println("phần tử thứ " + (i + 1));
			array[i] = sc.nextInt();
		}
		
		Number.output(array);
		System.out.println("==========================");
		Number.Number(array);
		
		
	}


}
