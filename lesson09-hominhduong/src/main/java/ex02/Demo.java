package ex02;

public class Demo {
	// TODO
	// split String by Digit
	// convert String -> integer
	// sort Array

	public static void main(String[] args) {
		System.out.println();
		print(getLargestNumbers("1a2b3456cde478", "1a20b956cde45"));
		System.out.println(getLargestNumbers2("1a2b3456cde478", "1a20b956cde45"));
	}

	public static int[] getLargestNumbers(String... ss) {
		String[] splitNumber = null;
		// Split Strings by digit
		for (String item : ss) {
			splitNumber = item.split("[^0-9]");
			//
		}
		// convert String -> int
		int[] arrNumber = new int[splitNumber.length];
		for (int i = 0; i < splitNumber.length; i++) {
			try {
				if (!splitNumber[i].equals("")&&(!splitNumber[i].startsWith("0"))) {
					int number = Integer.parseInt(splitNumber[i]);
					arrNumber[i] = number;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		// sort Array
		sort(arrNumber);
		return arrNumber;
	}
	
	public static int getLargestNumbers2(String... ss) {
		String[] splitNumber = null;
		int[] maxNumber=new int[ss.length];
		// Split Strings by digit
		for (int j=0;j<ss.length;j++) {
			splitNumber = ss[j].split("[^0-9]");
			//
			// convert String -> int
			int[] arrNumber = new int[splitNumber.length];
			for (int i = 0; i < splitNumber.length; i++) {
				try {
					if (!splitNumber[i].isEmpty()&&(!splitNumber[i].startsWith("0"))) {
						int number = Integer.parseInt(splitNumber[i]);
						arrNumber[i] = number;
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
			// sort Array
			sort(arrNumber);
			maxNumber[j]=arrNumber[arrNumber.length-1];
		}
		
		return maxNumber[maxNumber.length-1];
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j] == true) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void print(int[] arr) {
		for (int item : arr) {
			System.out.print(item + " ");
		}
	}
}
