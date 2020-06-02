package Ex04;

public class NhanVien extends People {
	private int birthday;
	private String nameroom;

	public NhanVien() {
	}
	public NhanVien(int birthday, String nameroom) {
		super();
		this.birthday = birthday;
		this.nameroom = nameroom;
	}
	

	public NhanVien(String fullname, float coefficientsalary, int birthday, String nameroom) {
		super(fullname, coefficientsalary);
		this.birthday = birthday;
		this.nameroom = nameroom;
	}
	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getNameroom() {
		return nameroom;
	}

	public void setNameroom(String nameroom) {
		this.nameroom = nameroom;
	}
	public static void Galary(float he_so_luong) {
		float s=(he_so_luong)*125000;
		System.out.println("Lương : "+s);
	}
	@Override
	public String toString() {
		return "NhanVien      birthday : " + birthday + ", nameroom : " + nameroom + ", fullname : " + fullname
				+ ", coefficientsalary : " + coefficientsalary ;
	}
	
	
}
