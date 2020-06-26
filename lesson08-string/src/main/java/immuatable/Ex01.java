package immuatable;

public class Ex01 {

	public static void main(String[] args) {

		//String literal: in stack
		String l1="hello";
		String l2="hello";
		System.out.println("Isequals VALUE:"+l1.equals(l2));// == ss ở stack
		System.out.println("== ADDRESS:"+(l1==l2));
		
		System.out.println("===============================");
		
		
		//String object: in heap
		String o1= new String("welcome");
		String o2= new String("welcome");
		o2="hello";
		System.out.println("Isequals VALUE:"+o1.equals(o2));// == ss ở stack
		System.out.println("== ADDRESS:"+(o1==o2));
		
		// char la nguyen thuy nhung mang char la kieu doi tuong
		
		
		
		
		
		
		
	}

}
