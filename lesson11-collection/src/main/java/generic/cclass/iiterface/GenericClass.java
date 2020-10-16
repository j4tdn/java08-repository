package generic.cclass.iiterface;

import generic.method.Condition;

public class GenericClass {
	public static void main(String[] args) {
		System.out.println("Class: " + GenericClass.class.getSimpleName());
		Integer i = 1;
//		i.compareTo(anotherInteger)

		JavaList<String> sequences = new JavaList<String>();

		sequences.add("A");
		sequences.add("D");
		sequences.add("K");
		sequences.add(1, "Z");

		System.out.println("size : " + sequences.getSize());
		System.out.println(sequences);
		
		int count = sequences.count(seq -> seq.compareTo("B") > 0);
		System.out.println(count);
	}
	
	
}
