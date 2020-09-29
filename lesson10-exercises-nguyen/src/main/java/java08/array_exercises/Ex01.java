package java08.array_exercises;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] array = {3,7,8,3,2,6,8,9,3,2};
		
		int[] notMatchArray = notMatchArray(array);
		
		Arrays.stream(notMatchArray).forEach(digit -> System.out.print(digit+ " "));
		System.out.println("\n==================");
		compareAverage(array);
		System.out.println("==================");
		array = insertSort(array);
		Arrays.stream(array).forEach(digit -> System.out.print(digit+ " "));
		System.out.println("\n==================");
		max3rd(array);
	}
	
	public static int[] notMatchArray(int[] arr) {
		int[] array = new int[arr.length];
		int count=0;
		boolean check = true;
		for(int i=0;i<arr.length;i++) {
			check=true;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					check=false;
					break;
				}
				
			}
			if(check) {
				array[count++]=arr[i];
			}
			
		}
		
		return Arrays.copyOfRange(array, 0, count);
	}
	
	public static void compareAverage(int[] arr) {
		int sum1 = 0, sum2=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (i < 5) {
				sum1 += arr[i];
			} else {
				sum2 += arr[i];
			}
		}
		
		if(sum1>sum2) {
			System.out.println("trung binh cong cua 5 phan tu dau lon hon!!!");
		}else {
			if(sum1==sum2) {
				System.out.println("trung binh cong cua 5 phan tu dau bang 5 phan tu sau!!!");
			}else {
				System.out.println("trung binh cong cua 5 phan tu dau be hon!!!");
			}
		}
		
	}
	
	public static int[] insertSort(int[] arr) {
		int temp = 0, j = 0;
		for (int i = 1; i < arr.length; i++) {
			j = i - 1;
			temp = arr[i];
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
		return arr;
	}
	
	public static void max3rd(int[] arr) {
		int count=1;
		for(int i = arr.length-1;i>0;i--) {
			int j = i-1;
				if(arr[i]==arr[j]) {
					continue;
				}else {
					
					count++;
				}
				if(count==3) {
					System.out.println(arr[j]);
					break;
				}
			
		}
		
		
	}

}
