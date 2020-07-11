import utils.StringUtils;

public class Ex02 {

	public static void main(String[] args) {
		String str = StringUtils.input();
		formatName(str);
	}	

	public static void formatName(String str) {
		str = str.trim().replaceAll("\\s+", " ");
		str = str.toLowerCase();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == ' ') {
	 			str = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
			}
		}
		System.out.println(str);
	}
}
