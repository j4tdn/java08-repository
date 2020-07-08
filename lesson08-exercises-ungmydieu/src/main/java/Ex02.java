
public class Ex02 {
	public static void main(String[] args) {
		String s = "aDam Le   vAN john Son";
		String s2 = "Anne   frAnk";
		
		standardized(s);
		standardized(s2);
	}
	
	public static void standardized(String s) {
		StringBuilder builder = new StringBuilder();
		s = s.toLowerCase();
		
		for (String i : s.split("[\\s]+")) {			
			builder.append((char) (i.charAt(0) - 32)).append(i.substring(1) + " ");
		}
		
		System.out.println(builder.toString());
	}
	
}
