import java.util.Scanner;

public class TamGiac {
	int tu,mau;
	void input() {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("nhap tu: ");
		tu = kb.nextInt();
		System.out.println("nhap mau: ");
		mau = kb.nextInt();
		
	}
// tu / mau
	void output() {
		System.out.println("s =" + tu + " / " + mau + " = " + tu/mau);
	}

	public static void main(String[] args) {
		TamGiac a = new TamGiac();
		a.input();
		a.output();
	}
}
