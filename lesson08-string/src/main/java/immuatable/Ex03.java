package immuatable;

public class Ex03 {
	public static void main(String[] args) {
		String s = " how are you ";
		String s1 = "\n. I' m great, thanks !!!";
		String s2 = "a";
		
		String s3 = " aBcD172#@!";
		
		System.out.println(s3.trim());
		
		//1
		System.out.println(s.toCharArray().length);
		//2 
		String s4 = s.concat(s1);
		// 3 
		System.out.println(s.charAt(1));
		//4 
		char[] chuoi = s.toCharArray();
		
		for(char c : chuoi) {
			System.out.print(c+"\t");
			
		}
		
		//5 
		System.out.println(s.indexOf(s2));
		System.out.println(s.lastIndexOf(s2));	
		
		System.out.println("========================");
		
		System.out.println(StringUtils.countString(s3));
	}
	
	
	
	
	
	
	
}
