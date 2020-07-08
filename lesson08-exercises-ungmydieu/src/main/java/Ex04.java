
public class Ex04 {
	public static void main(String[] args) {
		int a = 16;
		int b = 75;
		
		if (checkPrimeSimilar(a, b)) {
			System.out.println("Similar prime number");
		} else {
			System.out.println("No similar prime number");
		}
	}
	
	public static boolean checkPrimeSimilar(long a, long b) {
		long[] arr1 = new long[20];
		long[] arr2 = new long[20];
		int count1 = 1;
		int count2 = 1;
		int i = 2;
		
		while(i <= a && a > -1 ) {
			if (a % i == 0) {
				a = a / i; 
				if (arr1[count1-1] != i) {					
					arr1[count1] = i;
					count1++;
				}
			} else {
				i++;
			}
		}
		
		i = 2;
		while(i <= b && b > -1) {
			if (b % i == 0) {
				b = b / i; 
				if (arr2[count2 - 1] != i) {					
					arr2[count2] = i;
					count2++;
				}
			} else {
				i++;
			}
		}
				
		if (count1 != count2) return false;
		for (i = 1; i <= count1; i++) {
			System.out.println(arr1[i] + "  " + arr2[i]);
			if (arr1[i] != arr2[i]) return false;
		}
		
		return true;
	}
	
}
