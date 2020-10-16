package generic.cclass.iinterface;

import generic.method.Condition;

public class GenericClass {
	public static void main(String[] args) {
		// reflection
		System.out.println("Class: " + GenericClass.class.getSimpleName()); // lay ten cua Class ra

		JavaList<String> sequences = new JavaList<String>(String.class); // co the xoa String.class
		sequences.add("A");
		sequences.add("D");

		sequences.add("K");
		sequences.add(1, "Z");

		System.out.println("size: " + sequences.getSize());
		System.out.println(sequences);
		
		int count = sequences.count(seq -> seq.compareTo("X") > 0);
		System.out.println("count: " + count);
	}

}
