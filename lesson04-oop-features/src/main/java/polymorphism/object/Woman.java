package polymorphism.object;

public class Woman extends Person {
	@Override
	public String toString() {
		
		return "woman => tostring";
	}
	@Override
	public String getGender() {
		
		return "female";
	}

}
