
public class Ex06 {
	public static void main(String[] args) {
		String s = "";
		for (int i = 1; i <= 100; i++) {
			s = s.concat(i + "");
		}

		System.out.println(getNumber(s, 100));
	}

	private static int getNumber(String s, int k) {
		return Integer.parseInt(s.charAt(k) + "");
	}

}
