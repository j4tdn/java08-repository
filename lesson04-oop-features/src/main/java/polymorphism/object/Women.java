package polymorphism.object;

public class Women extends Person{
	@Override
	public String getGender() {
		return "Female";
	}
	//Annotation
	@Override
	public String toString() {
		return "Women => toString";
	}
	

}
