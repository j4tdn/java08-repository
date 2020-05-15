package polymorphism.object;

public class Man extends Person {

	@Override
	public String getGender() {
		return "male";
	}

	//Annotation
	
	@Override //dang ke thua tu lop cha
	public String toString() {
		return "Man => toString";
	}
}
