package immutable;

/*Immutable: bat bien co hai loai
 * String literal, String str="Hello";
 * String object, String str3= new
 * 
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		//
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		//== so sanh o stack
		//
		System.out.println("is equal value:"+str1.equals(str3));
		System.out.println("== adress:"+str1==str3);
		System.out.println("== adress:"+str4==str3);
	}
}
