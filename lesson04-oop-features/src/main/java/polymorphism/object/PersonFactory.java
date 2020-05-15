package polymorphism.object;

public class PersonFactory {
	private PersonFactory() {
		
	}
	
	public static Person get(Gender gender) {
		Person person=null;
		switch(gender) {
		case Male:
			person=new Man();
			break;
		case Female:
			person=new Woman();
			break;
		default:
			person= new Person();
			break;
		}
		
		return person;
	}
	
	

}
