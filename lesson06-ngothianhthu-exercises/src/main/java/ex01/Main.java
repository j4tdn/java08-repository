package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int aNumber, bNumber;
		double nghiem;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); // làm tròn đến 2 chữ số thập phân
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Nhập vào số a: ");
			aNumber = sc.nextInt();
			System.out.println("Nhập vào số b: ");
			bNumber = sc.nextInt();
			System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
			if (aNumber == 0) {
				if (bNumber == 0) {
					System.out.println("Phương trình này có vô số nghiệm.");
				} else {
					System.out.println("Phương trình vô nghiệm.");
				}
			} else {
				nghiem = (double) - (double)divide(aNumber,bNumber); // ép kiểu để cho ra kết quả chính xác
				System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static int divide(int a, int b) throws ArithmeticException {
		return b/a;
	}
}
