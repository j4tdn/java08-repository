package bean;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		while (true) {
			input();
		}
	}
	private static void input() {
		Scanner sc = new Scanner(System.in);
		float a = 0;
		float b = 0;
		float c = 0;
		do {
			try {
				System.out.print("Nhập hệ số  a = ");
				a = sc.nextFloat();
				System.out.print("Nhập hệ số  b = ");
				b = sc.nextFloat();
				System.out.print("Nhập hằng số  c = ");
				c = sc.nextFloat();
				giaiPTBac2(a, b, c);
			} catch (Exception e) {
				System.out.println("xin moi nhap lai: ");
			}
		} while (((a >= '0') && (a <= '9')) && ((b >= '0') && (b <= '9')) && ((c >= '0') && (c <= '9')));

	}

	public static void giaiPTBac2(float a, float b, float c) {
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm!");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}

			} else {
				System.out.println("Phương trình có nghiệm : " + "x= " + -c / b);
			}
		} else if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}
	}
}
