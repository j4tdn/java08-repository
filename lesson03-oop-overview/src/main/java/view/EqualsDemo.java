package view;
/**
 * 
 * @author minhpc
 *khi mot class ci final -> goi la mutable: bat bien (bat bien la bat bien o nho)
 *constanpoor: 
 */
public class EqualsDemo {
	public static void main(String[] args) {
		//primary type
		int a = 10; //luu trong stack
		int b = 5;
		System.out.println("a==b: "+(a==b));
		
		Integer ia =10;//
		Integer ib = 5;
		Integer ic =5;
		Integer id = new Integer(20); //gia tri cua doi tuong luu ow bo nho Heap
		Integer ie = new Integer(20);
		
		System.out.println("a==b: "+(ia==ib));//so sanh dia chi cua no
		System.out.println("ib==ic: "+(ic==ib));//so sanh dia chi cua no
		System.out.println("id==ie: "+(id.equals(ie)));//so sanh dia chi cua no
		System.out.println("ia code:\t"+System.identityHashCode(ia));
		System.out.println("ib code:\t"+System.identityHashCode(ib));
		System.out.println("ic code:\t"+System.identityHashCode(ic));
		System.out.println("id code:\t"+System.identityHashCode(id));
		System.out.println("ie code:\t"+System.identityHashCode(ie));
		
		String sa = "Hello";
		String sb = "Xinchao";
		System.out.println("sa==sb:"+ (sa==sb)); 
		// doi voi tat ca cac kieu du lieu kieu doi tuong: Integer, Double, String, Flaot
		//Literal
		//khai bao kieu tuan tu, thi se duoc luu trong constant pool (bo nho HEAP)
		//Object :luu trong HEAP (not constant pool_
		
		//
		System.out.println("sa==sb:"+ (sa.equals(sb)));
		System.out.println("sa code:\t"+System.identityHashCode(sa));
		System.out.println("sb code:\t"+System.identityHashCode(sb));
	}
}
