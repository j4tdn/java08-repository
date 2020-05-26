package ex01;


public class Ex01 {
	public static int[] getUniqueNumbers(int[] numbers) {
		int result[] = new int[numbers.length];
		int count = 0;
		
//		for(int i=0; i<numbers.length; i++){
//            boolean isdistinct = true;
//            for(int j=0; j<i; j++){
//                if(numbers[i] == numbers[j]){
//                    isdistinct =false;
//                    break;
//                }
//           }
//            if(isdistinct){
//                System.out.print(numbers[i]+" ");
//            }
//       }
		
		for (int i = 0; i < numbers.length; i++) {
			boolean isDuplicate = true;
			
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == numbers[i]) {
					isDuplicate = false;
					break;
				}
			}
			
			if (!isDuplicate) {
				result[count++] = numbers[i];
			}
		}
		return result;
	}
}
