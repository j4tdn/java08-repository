package exercises;

public class Ex01 {

	public static void main(String[] args) {
		String s = "hotel del luna";
		printEachCharacter(s);
		printEachWord(s);
		reverseByCharacter(s);
		reverseByWord(s);;

	}
	private static void printEachCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
	}
	private static void printEachWord(String s) {
		s = s.trim().replaceAll("\\s+", " ");
		String[] result = s.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}		
		
	}
	private static void reverseByCharacter(String s) {
		StringBuilder reverse = new StringBuilder(s);
		reverse.reverse().toString();
		System.out.println(reverse);
	}
	private static void reverseByWord(String s) {
		String[] result = s.split(" ");
		for (int i = 0; i < result.length; i++) {
			StringBuilder reverse = new StringBuilder(result[i]);
			reverse.reverse().toString();
			System.out.print(reverse + " ");
		}
	}
	
}
