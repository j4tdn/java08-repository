package view;

public class EqualsDemo {
	public static void main(String[] args) {
		
		// kieu nguyen thuy: primitive type
		int a = 10;
		int b = 5;
		
		System.out.println("a == b: " + (a==b));
		
		Integer ia = 10; // Literal
		Integer ib = 5; //cung gia tri luu chung 1 dia chi
		Integer ic = 5;
		
		Integer id = new Integer(20); //moi lan new tao 1 o nho moi
		Integer ie = new Integer(20);
		
		System.out.println("ia code: " + System.identityHashCode(ia));
		System.out.println("ib code: " + System.identityHashCode(ib));
		System.out.println("ic code: " + System.identityHashCode(ic));
		System.out.println("ia == ib: " + (ia==ib)); // == so sanh dia chi
		System.out.println("ib == ic: " + (ib==ic)); 
		System.out.println("id == ie: " + (id.equals(ie))); 
		
		String sa = "Hello";
		String sb = "xinchao";
		System.out.println("sa == sb: " + (sa == sb));
		System.out.println("sa == sb: " + sa.equals(sb));
		
		//Intefer, String, Double, Float: 2 cach khai bao, obj co san cua java thay the cho kieu nguyen thuy
		// - Literal: luu tru trong constant pool (heap)
		// - Object: heap (not constant pool)
		
	}
	
}
//final class: ko lop con nao duoc thua ke
