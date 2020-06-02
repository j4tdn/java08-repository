package Ex04;

public class GiamDoc extends People {
	private int birthyear;
	private int coefficientposition;

	public GiamDoc() {
	}

	public GiamDoc(int birthyear, int coefficientposition) {
		super();
		this.birthyear = birthyear;
		this.coefficientposition = coefficientposition;
	}

	public GiamDoc(String fullname, float coefficientsalary, int birthyear, int coefficientposition) {
		super(fullname, coefficientsalary);
		this.birthyear = birthyear;
		this.coefficientposition = coefficientposition;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public int getCoefficientposition() {
		return coefficientposition;
	}

	public void setCoefficientposition(int coefficientposition) {
		this.coefficientposition = coefficientposition;
	}

	public static void Galary(float he_so_luong, int he_so_chuc_vu) {
		float s=(he_so_luong+he_so_chuc_vu)*300000;
		System.out.println("Lương : "+s);
	}
	@Override
	public String toString() {
		return "GiamDoc   birthyear : " + birthyear + ", coefficientposition : " + coefficientposition + ", fullname : "
				+ fullname + ", coefficientsalary : " + coefficientsalary ;
	}


}
