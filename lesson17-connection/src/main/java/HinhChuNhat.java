import java.util.Scanner;

public class HinhChuNhat {
	double c1, c2;

	void input() {
		System.out.println("Tinh S & P Hinh Chu Nhat");
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap canh 1 > 0 : ");
		c1 = sc.nextDouble();
		System.out.println("nhap canh 2 > 0 : ");
		c2 = sc.nextDouble();
	}

	void output() {
		System.out.println("S = " + c1 + " * " + c2 + " = " + c1 * c2);
		System.out.println("P = 2.0 * (" + c1 + " + " + c2 + ") = " + 2 * (c1 + c2));
	}

	public static void main(String[] args) {
		HinhChuNhat a = new HinhChuNhat();
		a.input();
		a.output();
	}
}
