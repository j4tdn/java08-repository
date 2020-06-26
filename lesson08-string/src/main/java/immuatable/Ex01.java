package immuatable;

public class Ex01 {
	public static void main(String[] args) {
		//string literal
		String l1="hello";
		String l2="hello";
		System.out.println("Isequals value: "+l1.equals(l2));
		System.out.println("== address: "+(l1==l2));
		
		System.out.println("======================");
		
		//string object
		String o2=new String("welcome");
		String o1=new String("welcome");
		//o2=new String("hello");
		o2="hello";
		o2="to";
		System.out.println("Isequals value: "+o1.equals(o2));
		System.out.println("== address: "+o1==o2);
		
		
	}
}
