package polymorphism.object;

public class Man extends Person {
	@Override
	public String getGender() {

		return "male";
	}

	// Annotation
	@Override
	public String toString() {

		return "Man => toString";

	}

}
