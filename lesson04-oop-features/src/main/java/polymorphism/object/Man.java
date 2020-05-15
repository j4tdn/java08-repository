package polymorphism.object;

public class Man extends Person {

	@Override
	public String toString() {
		return "man => tostring";
	}

	//annotation
	@Override
	public String getGender() {
		return "male";
	}
}
