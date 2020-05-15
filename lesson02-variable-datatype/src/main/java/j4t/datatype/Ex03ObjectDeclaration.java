package j4t.datatype;

public class Ex03ObjectDeclaration {
	public static void main(String[] args) {
		
		//null
		//Integer i = 5;
		Integer i = new Integer (5);
		Float f = new Float(10.2f);
		Character c = new Character('x');
		String s = new String ("java08");
		
		
		System.out.println("i =" +i);
		System.out.println("f =" +f);
		System.out.println("c =" +c);
		System.out.println("s =" +s);
	}
}
