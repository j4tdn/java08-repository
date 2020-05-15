package polymorphism.object;
//doi tuong lop cha co the tham chieu den lop cha, co the tham chieu den lop con

public class Woman extends Person {
	@Override
	public String getGender() {
		return "female";
	}

	//Annotation
	
	@Override //dang ke thua tu lop cha
	public String toString() {
		return "Woman => toString";
	}
}
