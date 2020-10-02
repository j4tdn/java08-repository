package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Iteam;

public class A3 {
	public static void main(String[] args) {

		List<Iteam> iteams = getIteam();
		// remove

		// iteams.remove(new Iteam(2,"B"));
		iteams.set(0, new Iteam(7,"X"));
		iteams.contains(new Iteam(4, "D"));

		System.out.println("size: " + iteams.size());
		System.out.println("contain: " + iteams.contains(new Iteam(4, "D")));
	}

	private static List<Iteam> getIteam() {
		
		/*
		 * List<Iteam> iteams=new ArrayList<Iteam>(); iteams.add(new Iteam(1,"A"));
		 * iteams.add(new Iteam(2,"B")); iteams.add(new Iteam(3,"C")); iteams.add(new
		 * Iteam(4,"D")); iteams.add(new Iteam(5,"E")); iteams.add(new Iteam(6,"F"));
		 * return iteams;
		 */

		
		  return Arrays.asList(new Iteam(1, "A"), new Iteam(2, "B"), new Iteam(4, "C"),
		  new Iteam(5, "K"), new Iteam(3, "D"));
		 

		//unmodifiable ,immuatble
		/*
		 * return List.of(new Iteam(1, "A"), new Iteam(2, "B"), new Iteam(4, "C"), new
		 * Iteam(5, "K"), new Iteam(3, "D"));
		 */
	}
}
