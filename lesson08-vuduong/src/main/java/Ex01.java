import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String s = ip.nextLine();

		// In ra moi ki tu tren 1 dong
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// In ra moi tu tren 1 dong
		System.out.println("===========================================");
		String[] words = s.trim().split("[ ]+");
		for (String word : words) {
			System.out.println(word);
		}

		// In ra chuoi dao nguoc theo tu
		System.out.println("===========================================");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

		// In ra chuoi dao nguoc theo ki tu
		System.out.println("===========================================");
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}
