package bean;

public class Ex07 {

	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		findLengthMax(s);
		
		
	}

	private static void findLengthMax(String s) {
		String sub = "", s1="" ;
		
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				sub += s.charAt(i);
				
			} else {
				if ((s.charAt(i) == s.charAt(i - 1) )) {
					sub += s.charAt(i);
					
				}else {
					sub = "" +s.charAt(i);					
				}
			}
			if (s1.length() <= sub.length()) {
				s1 = sub;
			}
		}
	 System.out.println("day con lon nhat: "+s1);
	 System.out.println("vi tri bat dau: "+s.indexOf(s1));
	 System.out.println("do dai lon nhat: "+s1.length());
		
	}
}
