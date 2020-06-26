package immuatable;

public class Ex01 {
	public static void main(String[] args) {
		// String literal 
		
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEqual value : " + l1.equals(l2));
		System.out.println(" == Address : " +(l1 == l2));
		
		//String object 
		
		String o1 = new String("wellcome");
		String o2 = new String("wellcome");
		
		System.out.println("isEqual value : " +o1.equals(o2));
		System.out.println("== address"  +o1 == o2);
		
		o2 = new String("hello");
		
		o2 = "hello";
		
		// toán tử == chỉ so sánh ở Stack 
	}
}
