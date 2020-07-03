package Ex02;

public class getLargestNumbers {
	public static void main(String[] args) {
		String[] s = { "01a2b3456cde478", "aa6b546c6e22h", "aa6b326c6e22h" };
		for (int i = 0; i < s.length; i++) {
			System.out.println(getLargestNumbers(s[i]));
		}
	}

	private static int getLargestNumbers(String s) {
		String[] integers = s.split("[a-z]+");
		int[] arrInt = new int[integers.length];
		int j = 0;
		while (integers[j].equals("")) {
			j++;
		}
		arrInt[0] = Integer.valueOf(integers[j]);
		int max = arrInt[0];

		for (int i = 1; i < integers.length; i++) {
			arrInt[i] = Integer.valueOf(integers[j]);
			if (max < arrInt[i]) {
				max = arrInt[i];
			}
			j++;
		}
		return max;
	}
}
