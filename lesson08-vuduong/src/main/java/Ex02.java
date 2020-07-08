
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(correctName("hello    ha ko    dddd"));
	}

	private static String correctName(String name) {
		name = name.trim().replaceAll("[ ]+", " ").toLowerCase();

		String result = "";
		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i - 1) == ' ') {
				result = result + name.toUpperCase().charAt(i);
			} else {
				result = result + name.charAt(i);
			}
		}

		return result;
	}
}
