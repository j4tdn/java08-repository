package ex02;


public class Ex02 {

	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		System.out.println(getLargestNumber(s1));
		
		String s2 = "aa6b546c6e22h";
		String s3 = "aa6b326c6e22h";
		 
	    int[] largestNum = getLargestNumbers(s2,s3);
	    for (int i = 0; i < largestNum.length; i++) {
			System.out.println(largestNum[i]);
		}
		
	}

	private static int[] getLargestNumbers(String ...s) {
		int[] sortLargest = new int[s.length];
		int index = 0;
		int temp = 0;
		
		for (int i = 0; i < s.length; i++) {
			sortLargest[index] = getLargestNumber(s[i]);	
			index++;
		}
		
		for (int i = 0 ; i < sortLargest.length - 1; i++) {
            for (int j = i + 1; j < sortLargest.length; j++) {
                if (sortLargest[i] > sortLargest[j]) {
                    temp = sortLargest[j];
                    sortLargest[j] = sortLargest[i];
                    sortLargest[i] = temp;
                }
            }
        }
		return sortLargest;
		
	}
	private static int getLargestNumber(String s) {
		String[] temp = s.split("[a-z]+");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= temp.length - 1; i++) {			
				if(!temp[i].isEmpty() && max < Integer.parseInt(temp[i])) {
					max = Integer.parseInt(temp[i]);
			}
			
		}	
		
		return max;
		
  }

}
