package immuatable;

public class literal {
	public static void main(String[] args) {
		//String literal
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEqual VALUE: " + l1.equals(l2)); // == chi so sanh o stack
		System.out.println("== ADDRESS: " + (l1 == l2));
		
		System.out.println("================================");
		
		//String object
		String o1 = new String("welcom");
		String o2 = new String("welcom");
		o2 = new String("hello");
		o2 = "hello";
		o2 = "to"; //tim trong constant pool da co chua, chua thi tao moi, co roi thi tro den do
		
		System.out.println("o2: " + o2);
		
		System.out.println("isEqual VALUE: " + o1.equals(o2)); 
		System.out.println("== ADDRESS: " + (o1 == o2));
	}
}

//String thi ko the thay doi gia tri -> bat bien, vi ko co ham setter, ko cap nhat gia tri tren heap
//final: ko cho class con ke thua
