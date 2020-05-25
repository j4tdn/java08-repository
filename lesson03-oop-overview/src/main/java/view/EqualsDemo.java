package view;

public class EqualsDemo {

	public static void main(String[] args) {
		// Kieu nguyen thuy: so sanh gia tri trong o nho stack
		int a = 10;
		int b = 5;

		System.out.println("a==b: " + (a == b));

		// Kieu doi tuong
		Integer ia = 10; // luu trong constant pool
		Integer ib = 5; // khi khai bao constant pool khac thi se kiem tra co truoc do chua, co roi thi
						// tro den luon
		Integer ic = 5; // con chua co thi moi tao o moi
		Integer id = new Integer(20); // moi lan new se tao 1 o nho moi, khong quan tam truoc do co chua
		Integer ie = new Integer(20);
		String sa = "Hello";
		String sb = "Xin chao";

		System.out.println("ia code: " + System.identityHashCode(ia));
		System.out.println("ib code: " + System.identityHashCode(ib));
		System.out.println("ic code: " + System.identityHashCode(ic));

		System.out.println("======");
		System.out.println("ia==ib: " + (ia == ib)); // dung == so sanh dia chi
		System.out.println("ib==ic: " + (ib == ic)); // Khi khai bao cung 1 gia tri Integer thi luu chung 1 dia chi

		System.out.println("id==ie: " + (id == ie)); // khong nen dung
		System.out.println("id==ie: " + (id.equals(ie)));

		System.out.println("======");
		System.out.println("sa==sb: " + (sa == sb));
		System.out.println("sa==sb: " + (sa.equals(sb)));

		// Integer, String, Double, Float:
		// 1. Literal: luu trong constant pool cua heap
		// 2. Object: heap (not constant pool)
	}

}
