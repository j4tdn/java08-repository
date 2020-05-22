package view;

public class EqualsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;		
		System.out.println("a == b : " +  (a==b));
		
		Integer ia = 10;
		Integer ib = 5;
		Integer ic = 5;
		
		System.out.println("ia: " + System.identityHashCode(ia));
		System.out.println("ib: " + System.identityHashCode(ib));
		System.out.println("ic: " + System.identityHashCode(ic));
		
		System.out.println("a == b: " +  (ia == ib));
		System.out.println("a == b: " +  (ib == ic));	
		System.out.println((ic.equals(ib)));
		
		String sa = "hello";
		String sb = "Xin chao";
		System.out.println("a == b: " +  (sa == sb));	
		System.out.println((sa.equals(sb)));
		
		// Integer, String, Double, float
		// literal: constant pool(heap)
		// object: heap(not stand foor)
	}
}
