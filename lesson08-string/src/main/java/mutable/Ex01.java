package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// transient: 
		StringBuilder builder = new StringBuilder();
		System.out.println(System.identityHashCode(builder));
		builder.append("Ruby").append("Python").reverse();
		System.out.println("value: "+builder);
		System.out.println(System.identityHashCode(builder));
		
		
		//setValueAt, deleteAt
		builder.deleteCharAt(0);
		System.out.println("value: "+builder);
		
	}
}