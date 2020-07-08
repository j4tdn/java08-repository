package Exercises;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		String subString = subStrings(s);
		String[] subs = subString.split("[\\s]");
		System.out.print("Các chuỗi kí tự liền kề giống nhau: ");
		display(subs);
		System.out.println("\nMax length: " + findLengthMax(subs));
		System.out.println("Min length: " + findLengthMin(subs));

	}
	
	public static String subStrings(String s) {
		String subStrings = "";
		char tmp = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == tmp) {
				subStrings += s.charAt(i);
				tmp = s.charAt(i);
			}
			else {
				tmp = s.charAt(i);
				subStrings += " " + s.charAt(i);
			}
		}
		return subStrings;
	}
	
	public static int findLengthMax(String subStrings[]) {
		int max = 0;
		for (String s: subStrings) {
			if (s.length() > max) {
				max = s.length();
			}
		}
		return max;
	}
	
	public static int findLengthMin(String subStrings[]) {
		int min = Integer.MAX_VALUE;
		for (String s: subStrings) {
			if (s.length() < min) {
				min = s.length();
			}
		}
		return min;
	}
	
	public static void display(String arr[]) {
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}
}
