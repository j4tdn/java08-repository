package Ex04;

public class TruongPhong extends People {

	private int birthyear;
	private int numberstaff;

	public TruongPhong() {
	}

	public TruongPhong(int birthyear, int numberstaff) {
		super();
		this.birthyear = birthyear;
		this.numberstaff = numberstaff;
	}
	
	

	public TruongPhong(String fullname, float coefficientsalary, int birthyear, int numberstaff) {
		super(fullname, coefficientsalary);
		this.birthyear = birthyear;
		this.numberstaff = numberstaff;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public int getNumberstaff() {
		return numberstaff;
	}

	public void setNumberstaff(int numberstaff) {
		this.numberstaff = numberstaff;
	}
	public static void Galary(float he_so_luong) {
		float s=(he_so_luong)*220000;
		System.out.println("Lương : "+s);
	}

	@Override
	public String toString() {
		return "TruongPhong    birthyear : " + birthyear + ", numberstaff : " + numberstaff + ", fullname : " + fullname
				+ ", coefficientsalary : " + coefficientsalary ;
	}
	

}
