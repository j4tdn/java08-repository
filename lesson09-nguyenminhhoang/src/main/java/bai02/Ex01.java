package bai02;

public class Ex01 {
	public static void main(String[] args) {
		String n1 = "01a2b3456cde478";
		String n2 = "aa6b546c6e22h, aa6b326c6e22h";
		getLargestNumbers(n1);
		getLargestNumbers(n2);
	}

	public static void getLargestNumbers(String s) {
		String n3 = s.replaceAll("[^0-9,-\\.]", ",");
		String[] item = n3.split(",");
		int[] item2 = new int[s.length()];
		for (int i = 0; i < item.length; i++) {
			try {
				item2[i] = (int) Double.parseDouble(item[i]);
			} catch (NumberFormatException e) {
			}
		}
		sort(item2);
		for (int i : item2) {
			System.out.println(i + "  ");
		}
	}

	public static void sort(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
