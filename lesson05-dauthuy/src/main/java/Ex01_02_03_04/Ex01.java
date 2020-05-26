package Ex01_02_03_04;

public class Ex01 {
	public static void main(String[] args) {

		int arr[] = { 3, 15, 21, 0, 15, 17, 21 };
		int[] numberUnique = getUniqueNumbers(arr);
		sort(numberUnique);
		
	}
	
	private static int[] getUniqueNumbers(int[] numbers) {
		int[] tmpArray = new int[numbers.length];
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (contains(numbers, i)) {
				tmpArray[count++] = numbers[i];
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = tmpArray[i];
		}
		return result;
	}

	private static boolean contains(int[] numbers, int index) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numbers[index] && i != index) {
				return false;
			}
		}
		return true;
	}
	
	private static void sort(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	
	
}
