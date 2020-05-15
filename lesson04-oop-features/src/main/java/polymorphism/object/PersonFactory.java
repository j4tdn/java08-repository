package polymorphism.object;

public class PersonFactory {
	private PersonFactory() {
		
	}
	public static Person get(Gender gender) {
		Person person = null;
		switch (gender) {
		case MALE:
			person = new Men();	
			break;

		case FEMALE:
			person = new Women();
			break;
		default:
			person = new Person();
			break;
		}
		return person;
	}

}
