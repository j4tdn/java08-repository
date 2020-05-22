package view;

public class EqualDemo {
public static void main(String[] args) {
	int a=10;// nguyen thuy luu trong stack
	int b=10;
	
	System.out.println("a==b :  "+(a==b));
	
	Integer yA=10;// kieu doi tuong: k dc dung == de ss: neu dung se ss dia chi,heap
	Integer yB=5;//1.literal: in constant pool(heap)
	
	Integer yC=5;//2.object: not in constant pool(heap)
	Integer id =new Integer(20);
	Integer ie =new Integer(20);
	
	System.out.println("a==b :  "+(yA==yB));// kieu doi tuong k dung ==
	System.out.println("a==b :  "+(yC==yB));
	System.out.println(System.identityHashCode(id));
	System.out.println(System.identityHashCode(ie));
	System.out.println("a==b :  "+(id.equals(ie)));
	
	String sa="hello";
	String sb="hi";
	System.out.println("sa==sb :  "+(sa==sb));
	System.out.println("sa==sb :  "+(sa.equals(sb)));
	// integer ,string, double,float: doi tuong co san trong java: 1.literal, 2.object
}
}

