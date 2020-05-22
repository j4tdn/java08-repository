package view;

import bean.Box;

public class EqualDemo {
	public static void main(String[] args) {
		// primitive type
		int a = 10;
		int b = 5;
		System.out.println("a==b: " + (a == b));

		Integer ia = 10;
		Integer ib = 10;
		
		System.out.println(System.identityHashCode(ia));
		System.out.println(System.identityHashCode(ib));

		ib = 20;
		System.out.println(System.identityHashCode(ib));

		
		
		System.out.println("a==b: " + (ia == ib));

		
		String sa = "hello";
		String sb = "xin chao";
		System.out.println("sa==sb" + (sa==sb));
		System.out.println("sa==sb" + (sa.equals(sb)));

		/**
		 * Integer, String, Double, Float: những kiểu dữ liệu đối tượng của java đc biến đổi từ primitive
		 * Có 2 kiểu khai báo:
		 * 	+ Literal: Constant pool (heap)
		 *  + Object: heap (not constant pool)
		 */
		
		
		
		//
		Box box1 = new Box(2, 4);
		Box box2 = new Box(2, 4);
	}
}
