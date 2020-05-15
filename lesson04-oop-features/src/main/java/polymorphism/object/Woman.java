package polymorphism.object;

public class Woman extends Person {
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return "female";
	}

    //annotation
	@Override // ke thu va dinh nghia lai
	public String toString() {
		// TODO Auto-generated method stub
		return "woman => tostring";
	}
}
