package sorting;

import java.util.Arrays;

public class Ex01 {
//int. String, Item[]: id, name
	public static void main(String[] args) {
		int[] numbers= {5,6,7,8,9,1,2,3,4};
		//sort(numbers);
		Arrays.sort(numbers);//kieu dl nguyen thuy chi ho tro sort tang dan ,ASC
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
		
		//sort manually: bubble sort; sort tra ve void
		//Arrrays.sort(quick.sort)

	}
	
private static void sort(int[] numbers) {
	for (int out =numbers.length-1;out>0;out--) {
		for(int in=0; in< out;in ++) {
			if(numbers[in]>numbers[out]) {
				int tmp=numbers[in];
				numbers[in]=numbers[out];
				numbers[out]=tmp;
			}
		}
	}
}
}
