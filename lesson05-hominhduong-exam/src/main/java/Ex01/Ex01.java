package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		int [] result=getUniqueNumber();
		sort(result);
		print(result);
	}

	public static int[] getUniqueNumber() {
		int[] arr = {15, 21, 0, 15, 17, 21 ,3};
		int[] temp = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isUniqueNumbe(arr, i)) {
				temp[index] = arr[i];
				index++;
			}
		}
		int[] tep = new int[index];
		for (int i = 0; i < index; i++) {
			tep[i] = temp[i];
		}
		return tep;
	}

	public static boolean isUniqueNumbe(int[] arr, int index) {
		for (int i = 0; i < arr.length; i++) {
			if (index == i) {
				continue;
			} else if (arr[index] == arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[i];
					a[i] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
