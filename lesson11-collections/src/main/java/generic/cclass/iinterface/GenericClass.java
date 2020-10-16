package generic.cclass.iinterface;

import generic.method.Condition;

public class GenericClass {

	public static void main(String[] args) {
		
		System.out.println("Class: "+GenericClass.class.getSimpleName());
		JavaList<String> sequences=new JavaList<String>(String.class);
		sequences.add("D");
		sequences.add("K");
		sequences.add("H");
		sequences.add(2,"Z");
		
		System.out.println("Size :"+sequences.getSize());
		System.out.println(sequences);
		int count=sequences.count(sequence->sequence.compareTo("X")>0);
		System.out.println(count);
	}
	
	
}
