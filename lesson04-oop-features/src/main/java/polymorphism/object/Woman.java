package polymorphism.object;

public class Woman extends Person {
	@Override
	public String getGender() {
		return "Female";
	}

	
	
	@Override
	public String toString() {
		return "Woman => toString";
	}

}
