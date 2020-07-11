import utils.StringUtils;

public class Ex01 {

	public static void main(String[] args) {
		String str = StringUtils.input();
		System.out.println("In ra mỗi kí tự trên một dòng:");
		printChar(str);
		System.out.println("In ra mỗi từ trên một dòng:");
		printWord(str);
		System.out.println("In ra chuỗi đảo ngược theo kí tự:");
		reverseChar(str);
		System.out.println("In ra chuỗi đảo ngược theo từ:");
		reverseWord(str);
	}

	public static void printChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printWord(String str) {
		str = str.trim().replaceAll("\\s+", " ");
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static void reverseChar(String str) {
		System.out.println(new StringBuilder(str).reverse().toString());
	}

	public static void reverseWord(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				System.out.print(temp);
				System.out.print(" ");
				temp = "";
			} else {
				temp = str.charAt(i) + temp;
			}
		}
		System.out.println(temp);
	}

}
