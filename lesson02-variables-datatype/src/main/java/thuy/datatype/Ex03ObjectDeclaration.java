package thuy.datatype;

public class Ex03ObjectDeclaration {

	public static void main(String[] args) {
		//null: doi tuong, bien, kieu du lieu chua duoc khoi tao
		//Integer i = 5;
		//khai bao doi tuong
		Integer i = new Integer(5);// kieu doi tuong tham chieu den gia tri i = 5
		Float f = new Float(10.2f);
		Character c = new Character('x');
		String s = new String("java08");
		
		System.out.println("i: " + i);
		System.out.println("f: " + f);
		System.out.println("c: " + c);
		System.out.println("s: " + s);
	}

}
