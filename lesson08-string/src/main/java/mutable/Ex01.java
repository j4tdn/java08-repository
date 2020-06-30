package mutable;

public class Ex01 {
	public static void main(String[] args) {
		
		//transient: to not implement from Serializable
		StringBuilder buider = new StringBuilder();
		
		System.out.println("b1: " + System.identityHashCode(buider));
		
		buider.append("Ruby").append("Python").reverse();
		System.out.println("b2: " + System.identityHashCode(buider));	

		// setValueAt, deleteAt
		buider.deleteCharAt(0);
		System.out.println("value: " + buider);
		
	}
}
