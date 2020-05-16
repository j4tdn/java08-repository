package exercise03;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix matrix = new Matrix();
		System.out.print("Nhap so hang:");
		matrix.setM(sc.nextInt());
		System.out.print("Nhap so cot:");
		matrix.setN(sc.nextInt());

		matrix.setMatrix();
		matrix.toString();
		if(matrix.checkHorseItemExist()) {
			System.out.println("Co phan tu yen ngua");
		}else {
			System.out.println("Khong phan tu yen ngua");
		}

	}

}
