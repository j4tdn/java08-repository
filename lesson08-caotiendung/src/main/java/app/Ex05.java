package app;

public class Ex05 {
	public static void main(String[] args) {
		String s1= "ABCDAXMVKRIExxxxxxxxxxxxxxPW";
		String s2= "VBFABCDFGxxxxxxxxxxxxxxxxHRERT";
		System.out.println(sameString(s1,s2));
		//String s =s1.substring(1,3);
		//System.out.println(s);
	}

	private static String sameString(String s1, String s2) {
		String s = "";
		String temp = "";
		for (int i=0; i< s1.length(); i++) {
			for (int j= i+1; j< s1.length(); j++) {
				temp = s1.substring(i, j);
				//System.out.println(temp);
				if (s2.contains(temp) && (temp.length() > s.length())) {
					s = temp;
				}
			}
		}
		return s;
	}
}
