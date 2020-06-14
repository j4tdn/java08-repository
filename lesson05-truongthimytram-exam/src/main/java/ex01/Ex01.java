package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        int[] result = getUniqueNumber(arr);
        for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
    }
    public static int count(int[] arr, int a) {
    	int temp = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i] == a) {
    			temp = temp + 1;
    		}
			
		}
    	return temp;
    }
    public static int[] getUniqueNumber(int[] arr) {
    	int[] temp = new int[arr.length];
    	int index = 0;
    	int tmp;
    	for (int i = 0; i < arr.length; i++) {
			if(count(arr, arr[i]) == 1) {
				temp[index] = arr[i];
				index++;
			}
		}
    	temp = Arrays.copyOfRange(temp, 0, index);
	    for (int j = 0; j < temp.length - 1; j++) {
			if(temp[j] > temp[j+1]) {
				tmp = temp[j];
				temp[j] = temp[j+1];
				temp[j+1] = tmp;
				
		}	
    }
		return temp;
    }
}

