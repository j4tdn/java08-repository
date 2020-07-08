package ex07;

public class Ex07 {
	public static void main(String[] args) {
		String ip = "daaabaaabbaaaaacc";
// kiem tra xem chuoi co bao nhieu ki tu khac nhau
		String input = "";
		for (int i = 0; i < ip.length(); i++) {
			String temp = String.valueOf(ip.charAt(i));
			if (!input.contains(temp)) {
				input += temp;
			}
		}

		String[] maximums = new String[input.length()];

		for (int i = 0; i < input.length(); i++) {
			String temp = input.replace(String.valueOf(input.charAt(i)), "");
			String[] item = ip.split("[" + temp + "]+");
			maximums[i] = item[maxLength(item)];
		}
		System.out.println("=============");
		System.out.println("Result: " + maximums[maxLength(maximums)]);
		System.out.println("Result: " + maximums[minLength(maximums)]);
	}

	private static int maxLength(String[] arr) {
		int maxLenghtValue = arr[0].length();
		int maxPosition = 0;
		for (int i = 1; i < arr.length; i++) {
			if (maxLenghtValue < arr[i].length()) {
				maxLenghtValue = arr[i].length();
				maxPosition = i;
			}
		}
		return maxPosition;
	}
	
	private static int minLength(String[] arr) {
		int minLenghtValue = arr[0].length();
		int minPosition = 0;
		for (int i = 1; i < arr.length; i++) {
			if (minLenghtValue > arr[i].length()) {
				minLenghtValue = arr[i].length();
				minPosition = i;
			}
		}
		return minPosition;
	}
}
