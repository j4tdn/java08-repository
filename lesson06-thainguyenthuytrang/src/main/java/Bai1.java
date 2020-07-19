import java.util.Scanner;

public class Bai1 {

	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int a = input();
		System.out.println("a:" + a);

		int b = input();
		System.out.println("b:" + b);

		PTBacNhat(a, b);

	}

	private static int input() {

		do {
			try {
				System.out.println("Enter a number:");
				return Integer.parseInt(ip.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number!!!");

			}

		} while (true);

	}

	private static void PTBacNhat(int a, int b) {
		float nghiem = 0;
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {

			nghiem = -b / a;
			System.out.println("Phương trình có nghiệm x = " + nghiem);
		}
	}

}
