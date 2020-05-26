package View;

import java.util.Arrays;

public class Bai1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("cac phan tu xuat hien 1 lan" + Arrays.toString(getUniqueNumbers(a)));
		}

	}

	public static int[] getUniqueNumbers(int[] a) {
		int tmp = 0;
		int b[] = new int[3];
		
		

		for (int j = 0; j < a.length; j++) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[j] == a[i]) {

					count++;
				}
				

			}
			System.out.println(count);
			if (count == 1) {
				b[tmp] = a[j];
				tmp++;
			
			} 

		}
		
		return b;
	}
}
