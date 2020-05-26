package bai1;

import java.util.Map;
import java.util.TreeMap;

public class Unique {
	public static void main(String[] args) {

		int b[] =  getUniqueNumber();
		 sortArr(b);
		for (int i=0; i< 10; i++) {
			if (b[i] != 0) {
			System.out.println(b[i]);
			} else continue;
		}
		
	}

	public static int[] getUniqueNumber() {
		int a[] = new int[10];
		a[0] = 4;
		a[1] = 8;
		a[2] = 3;
		a[3] = 4;
		a[4] = 6;
		a[5] = 9;
		a[6] = 6;
		a[7] = 7;
		a[8] = 7;
		a[9] = 1;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]) + 1;
				map.put(a[i], count);

			} else {
				map.put(a[i], 1);
			}
		}
		int j = 0;
		int b[] =new int[10];
		 for (Integer key : map.keySet()) {
	            if (map.get(key) == 1) {
	               b[j] = key;
	               j=j+1;
	            }
		

		 }
		
		 return b;
	}
	public static void sortArr(int [] arr) {
		int temp = arr[0];
		for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
            	if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
		}
	}
	
}