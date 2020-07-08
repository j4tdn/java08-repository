import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap s:");
		String s =sc.nextLine();
		System.out.println("nhap k:");
		int k = sc.nextInt();
		for (int i = 0; i < s.length(); i++) {
			if(i ==k) {
				System.out.println(s.charAt(i));
			}
		}
	}
	

}
