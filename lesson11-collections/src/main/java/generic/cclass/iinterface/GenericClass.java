package generic.cclass.iinterface;

import generic.method.Condition;

public class GenericClass {
	public static void main(String[] args) {
		System.out.println("Class: " + GenericClass.class.getSimpleName());
		JavaList<String> sequences = new JavaList<String>();

		sequences.add("A");
		sequences.add("B");
		sequences.add("K");
		sequences.add(1, "Z");
		System.out.println("size: " + sequences.getSize());

		System.out.println(sequences);

		int count  = sequences.count(seq -> seq.compareTo("M") > 0);
		System.out.println("count  " + count);
	}

}
