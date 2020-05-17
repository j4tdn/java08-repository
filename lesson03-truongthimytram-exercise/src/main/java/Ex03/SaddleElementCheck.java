package Ex03;

import java.util.Scanner;

public class SaddleElementCheck {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean check = false;
		int row = 0;
		int col = 0;
		do {
			try {
				System.out.println("Nhập số hàng: ");
				row = Integer.parseInt(sc.nextLine()); 
				check = true;
				if(row <= 0) {
					check = false;
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				check = false;
				System.out.println("Bạn phải nhập 1 số nguyên dương!");
			}
		} while(!check);
		do {
			try {
				System.out.println("Nhập số cột: ");
				 col = Integer.parseInt(sc.nextLine()); 
				 check = true;		
				 if(col <= 0) {
						check = false;
						throw new NumberFormatException();
					}
			} catch (NumberFormatException e) {
				check = false;
				System.out.println("Bạn phải nhập 1 số nguyên dương!");
			}
		} while(!check);
		int[][] array = new int[row][col];
		SaddleElementUtils.inputArray(array);
		SaddleElementUtils.outputArray(array);
		SaddleElementUtils.checkSaddle(array);

	}

}
