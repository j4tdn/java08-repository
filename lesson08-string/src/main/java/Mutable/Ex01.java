package Mutable;

public class Ex01 {
	public static void main(String[] args) {
		
		
		//transient 
		
		
		StringBuilder builder = new StringBuilder();
		System.out.println("b1" + System.identityHashCode(builder));
		
		builder.append("Ruby").append("Python").reverse();
		
		System.out.println("value :   " +builder.toString());
		
		System.out.println("b2" + System.identityHashCode(builder));
		
		//cau hoi phong van co ban : 
		// a+b 
		// dung builder , tao doi tuong new builder(a).append(b); // khi do chi can mot o nho , trong khi cong binh thuong thi 3 o nho
		
		
		//setValueAt , deleteAt , delete 
		
		builder.deleteCharAt(0);
		
		System.out.println("value " +builder);
		
		
		StringBuffer buffer = new StringBuffer();
		
		
		
	}
}
