package mutable;

public class Ex01 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		System.out.println("b1: "+ System.identityHashCode(builder));
		builder.append("Ruby").append("Python");
		
		System.out.println("value: "+ builder);
		System.out.println("b2: "+ System.identityHashCode(builder));
	}

}
