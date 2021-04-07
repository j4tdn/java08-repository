package generic.cclass.iinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import generic.method.Condition;

public class GenericClass {
	public static void main(String[] args) {
		
		// E: runtime
		Integer a = 5;
		List<Integer> list = new ArrayList<>();
		list.add(a);
		
		// reflection
		System.out.println("Class: " + GenericClass.class.getSimpleName());
		
		JavaList<String> sequences = new JavaList<>();
		sequences.add("A");
		sequences.add("D");
		sequences.add("K");
		sequences.add(1, "Z");
		
		System.out.println("size: " + sequences.getSize());
		System.out.println(sequences);
		
		int count = sequences.count(seq -> seq.compareTo("B") > 0);
		System.out.println("count: " + count);
	}
	
}
