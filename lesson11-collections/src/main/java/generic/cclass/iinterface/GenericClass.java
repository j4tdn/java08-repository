package generic.cclass.iinterface;

public class GenericClass {
	public static void main(String[] args) {
		System.out.println("Class: " + GenericClass.class.getSimpleName());

		JavaList<String> sequences = new JavaList<>();

		sequences.add("Bui Hau 1");
		sequences.add("Bui Hau 2");
		sequences.add("Bui Hau 3");
		sequences.add(1, "Bui Hau 4");
		System.out.println("Size: " + sequences.getSize());
		System.out.println(sequences);
		System.out.println(sequences.count(seq -> seq.equals("Bui Hau 2")));
	}

}
