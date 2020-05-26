package view;

public class EqualsDemo {

	public static void main(String[] args) {
		//primitive type
		int a = 10;
		int b = 5;
		System.out.println("a==b: " + (a==b));
		
		Integer ia = 10;
		Integer ib = 5;
		Integer ic = 5;
		//tao 2 o nho rieng biet
		@SuppressWarnings("deprecation")
		Integer id = new Integer(20);
		@SuppressWarnings("deprecation")
		Integer ie = new Integer(20);
		
		System.out.println("ia code: " + System.identityHashCode(ia));
		System.out.println("ia code: " + System.identityHashCode(ib));
		System.out.println("ia code: " + System.identityHashCode(ic));
		//neu dung == thi so sanh dia chi trong kieu doi tuong
		System.out.println("ia==ib: " + (ia==ib));
		//Integer se luu cung 1 o nho neu ib ic co gia tri bang nhau
		System.out.println("ia==ib: " + (ib==ic));
		System.out.println("ia==ib: " + (id==ie));
		System.out.println("ia==ib: " + (id.equals(ie)));
		
		String sa = "hello";
		String sb = "xin chao";
		System.out.println("sa==sb: " + (sa==sb));
		System.out.println("sa==sb: " + sa.equals(sb));
		//Integer, String, Double, Float
		//Literal: Integer ia = 10; constant pool(heap)
		//Object: heap(not constant pool)

	}

}
