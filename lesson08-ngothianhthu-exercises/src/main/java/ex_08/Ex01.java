package ex_08;

public class Ex01 {
	public static void main(String[] args) {
		String s = "Một con vịt xòe ra 2 cái cánh";

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("===================");

		char space = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == space) {
				System.out.print("\n");
			}
			System.out.print(s.charAt(i));
		}
		
		System.out.println("=====================");
		
		for (int i = s.length()-1; i >=0 ; i--) {
			System.out.println(s.charAt(i));
		}

		System.out.println("===================");

		char space1 = ' ';
		for (int i = s.length()-1; i >=0 ; i--) {
			if (s.charAt(i) == space1) {
				System.out.print("\n");
			}
			System.out.print(s.charAt(i));
		}
	}
}
