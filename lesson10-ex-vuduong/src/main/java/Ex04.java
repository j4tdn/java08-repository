import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		//addElementAtIndex(arr, 9, 5);
		removeElementAtIndex(arr, 4);
	}

	private static int[] addElementAtIndex(int[] arr, int value, int index) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < result.length; i++) {
			if(i < index) {
				result[i] = arr[i];
			}
			if(i == index) {
				result[i] = value;
			} 
			if(i > index) {
				result[i] = arr[i-1];
			}
		}
		
		Arrays.stream(result).forEach(x -> System.out.println(x));

		
		return result;
	}
	
	private static int[] removeElementAtIndex(int[] arr, int index) {
		int[] result = new int[arr.length - 1];
		for (int i = 0; i < result.length; i++) {
			if(i < index) {
				result[i] = arr[i];
			}
	
			if(i >= index) {
				result[i] = arr[i+1];
			}
		}
		
		Arrays.stream(result).forEach(x -> System.out.println(x));

		
		return result;
	}
}
