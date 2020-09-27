import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] numbers = {2,5,-9,51,5,0,-48,212,-48,51};		
		
		removeDuplicateValues(numbers);
		compareAverageValueEachHalfOfArray(numbers);
		insertionSort(numbers);
		findLargestNumberByIndex(numbers, 3);
		
	}
	
	private static void removeDuplicateValues(int[] numbers) {
		int[] uniqueNumbers = Arrays.stream(numbers)
				.distinct()
				.toArray();
		printf(uniqueNumbers);
	}
	
	private static void compareAverageValueEachHalfOfArray(int[] numbers) {
		double averageValueOfFirstHalf = Arrays.stream(numbers)
				.skip(0).limit(5)
				.sum() / 5.0;
		
		double averageValueOfLastHalf = Arrays.stream(numbers)
				.skip(5).limit(5)
				.sum() / 5.0;
		System.out.print("averageValueOfFirstHalf: " + averageValueOfFirstHalf);
		if (averageValueOfFirstHalf > averageValueOfLastHalf) {
			System.out.print(" > ");
		}
		else {
			System.out.print(" < ");
		}
		System.out.print("averageValueOfLastHalf: " + averageValueOfLastHalf);
		System.out.println();
	}
	
	private static void insertionSort(int[] numbers) 
    { 
        for (int i = 1; i < numbers.length; ++i) { 
            int key = numbers[i]; 
            int j = i - 1; 
            while (j >= 0 && numbers[j] > key) { 
            	numbers[j + 1] = numbers[j]; 
                j = j - 1; 
            } 
            numbers[j + 1] = key; 
        }
        printf(numbers);
    } 
	
	private static void findLargestNumberByIndex(int[] numbers, int indexLargest) 
    {
		int largestNumberByIndex = Integer.MIN_VALUE;
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 1; i--) {
			if (numbers[i] != numbers[i - 1]) {
				indexLargest--;
			}
			if (indexLargest == 0) {
				largestNumberByIndex = numbers[i];
			}
		}
        if (largestNumberByIndex == Integer.MIN_VALUE) {
        	System.out.println("Not found");
        } else {
        	System.out.println(largestNumberByIndex);
        }        
    } 
	
	private static void printf(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
