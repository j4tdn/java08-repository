
public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		
		correctSubstring(s);
	}
	
	public static void correctSubstring(String s) {
		s = s + "0";
		int max = 0;
		int min = s.length();
		int posMax = 0;
		int posMin = 0;
		StringBuilder strMax = new StringBuilder();
		StringBuilder strMin = new StringBuilder();
		
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(j - 1)) {
					if (max < s.substring(i, j).length()) {
						max = s.substring(i, j).length();
						strMax = new StringBuilder(s.substring(i, j)); 
						posMax = i;
					}
					
					if (min > s.substring(i, j).length()) {
						min = s.substring(i, j).length();
						strMin = new StringBuilder(s.substring(i, j)); 						
						posMin = i;
					}
					
					i = j - 1;
					break;
				}
			}
		}
		
		System.out.println("Length of longest correst substring: " + max + " " + strMax + "[" + posMax + "]");
		System.out.println("Length of shortest correst substring: " + min + " " + strMin + "[" + posMin + "]");
	}	
}
