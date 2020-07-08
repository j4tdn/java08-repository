package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//printCharacte("Hôm nay là thứ tư");
		//printWord("Hôm nay là thứ tư");
		printWordReverse("Hôm nay là thứ tư");
	}
	
	public static void printCharacte(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void printWord(String str) {
		String[] split = str.split("\\s");
		for (String item : split) {
			System.out.println(item);
		}
	}
	
	public static void printWordReverse(String str) {
		String[] split = str.split("\\s");
		for (int i = split.length-1; i>=0 ; i--) {
			StringBuilder reverseString= new StringBuilder();
			reverseString.append(split[i]);
			System.out.println(reverseString.reverse());
		}
	}
}
