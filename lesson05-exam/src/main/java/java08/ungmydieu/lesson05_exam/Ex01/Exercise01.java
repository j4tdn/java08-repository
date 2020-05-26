package java08.ungmydieu.lesson05_exam.Ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise01 {
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		int[] result = getUniqueNumbers(arr);
		
		for (int i : result)
			System.out.print(i + "  ");
	}
	
	public static int[] getUniqueNumbers(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				if (count > 0) break;
				else if (i != j && arr[i] == arr[j]) count++;
				
			if (count == 0) result[index++] = arr[i];
			count = 0;
		}
		int[] res = new int[index];
		
		for (int i = 0; i < index; i++)
			res[i] = result[i];
		
		return res;
	}
}
