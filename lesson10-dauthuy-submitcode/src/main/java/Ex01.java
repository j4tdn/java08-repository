import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] intNumbers = { 4, 2, 2, 6, 10, 5, 6, 2, 9, 5 };

		System.out.print("Loại bỏ phần tử trùng nhau: ");
		int[] elementDistinct = distinct(intNumbers);
		display(elementDistinct);
		
		compareElement(intNumbers);
		
		System.out.print("Sắp xếp theo insertion: ");
		insertion(intNumbers);
		display(intNumbers);
		
		System.out.print("\nTìm số lớn thứ 3 trong mảng: " + thirdMaxNumber(intNumbers));
	}

	private static void display(int[] intNummbers) {
		for (int i = 0; i < intNummbers.length; i++) {
			System.out.print(intNummbers[i] + " ");
		}
	}

	private static int[] distinct(int[] intNumbers) {
		int[] result = new int[intNumbers.length];
		int k = 0;
		for (int i = 0; i < intNumbers.length; i++) {
			if (!isUnique(intNumbers[i], intNumbers, i)) {
				result[k] = intNumbers[i];
				k++;
			}
		}

		return Arrays.copyOfRange(result, 0, k);
	}
	
	private static void compareElement(int[] intNumbers) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < 5; i++) {
			sum1 += intNumbers[i];
		}
		
		for (int i = 5; i < 10; i++) {
			sum2 += intNumbers[i];
		}
		
		if (sum1 > sum2) {
			System.out.println("\nGiá trị trung bình 5 ptu đầu tiên lớn hơn 5 ptu cuối cùng");
		}else if (sum1 < sum2){
			System.out.println("\nGiá trị trung bình 5 ptu đầu tiên nhỏ hơn 5 ptu cuối cùng");
		}
		else {
			System.out.println("\nGiá trị trung bình 5 ptu đầu tiên bằng 5 ptu cuối cùng");

		}
	}
	
	private static boolean isUnique(int number, int[] result, int index) {
		for (int i = 0; i < result.length; i++) {
			if (index != i && number == result[i]) {
				return true;
			}
		}
		return false;
	}
	
	private static int[] insertion(int[] intNumbers) {
		for (int i = 0; i < intNumbers.length; i++) {
			for(int j = i + 1; j < intNumbers.length; j++) {
				if(intNumbers[j] < intNumbers[i]) {
					int temp = intNumbers[i];
					intNumbers[i] = intNumbers[j];
					intNumbers[j] = temp;

				}
			}			
		}		
		return intNumbers;
	}
	
	private static int thirdMaxNumber(int[] intNumbers) {
		insertion(intNumbers);
		int thirdMaxNumber = intNumbers[intNumbers.length - 3];
		return thirdMaxNumber;
	}
}
