package j4t.datatype;

public class Ex03ObjectDeclaration {

	public static void main(String[] args) {
//		Integer i = 5;
//		Float f = 10.2f;
//		Character c = 'c';
//		String s = "java08";
		Integer i = new Integer(5);
		Float f = new Float(10.2f);
		Character c = new Character('c');
		String s = new String("java08");

		System.out.println("i :" + i);
		System.out.println("f :" + f);
		System.out.println("c :" + c);
		System.out.println("s :" + s);
	}

}
