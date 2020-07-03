package lesson09.exam;

public class Ex03 {
	public static void main(String[] args) {
		String str = "xyz";
		
		//permutation( str);
		
	}

	
	public static String[] permutation(String s,int n) {
		String[] per = new String[n];
		char temp ;
		for(int i= 0; i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i!=j) {
					
				}
			}
		}
		
		return per;
	}
	
	public static int lenghtOfPer(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {
			n+=s.length()-i;
		}
		return n;
	}

}
