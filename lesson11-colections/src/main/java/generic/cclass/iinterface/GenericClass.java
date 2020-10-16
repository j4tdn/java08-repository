package generic.cclass.iinterface;

public class GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences =  new JavaList <>(String.class);
		sequences.add("le van nam");
		sequences.add("le van ngao");
		sequences.add("le van luyen");
		sequences.add("Nguyen");
		
		int counts = sequences.count(seq -> seq.compareTo("xx")>0);
		
		System.out.println(counts);
		
	}
	
	

}
