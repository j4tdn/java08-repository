package mutable;

public class Ex01 {

	public static void main(String[] args) {
		//transient
		StringBuffer builder = new StringBuffer();
		
		System.out.println("b1: " + System.identityHashCode(builder));
		
		builder.append("Ruby").append("Python").reverse();	
		
		System.out.println("b2: " + System.identityHashCode(builder));
		
		//setValuaAt
		
		builder.deleteCharAt(0);
		System.out.println("value: " + builder);
		

	}

}
