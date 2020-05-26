package ex01;

public class Exam01 {
	public int[] getUniqueNumbers(int[] a) {
		int[] uniqueNumbers = new int[100];

		for (int i = 0; i < a.length; i++) {

			if (checkExistInArray(a[i], a) == true) {
				System.out.println(a[i]);
				uniqueNumbers[i] = a[i];
			}
		}
		return uniqueNumbers;
	}

	private boolean checkExistInArray(int number, int[] a) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (number == a[i]) {
				n++;
			}
		}
		return n >= 2 ? false : true;
	}

}
