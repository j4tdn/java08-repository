package bean;

public class Student {
	private int Id;
	private String Name;
	public float LT;
	public float TH;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float lT, float tH) {
		super();
		Id = id;
		Name = name;
		LT = lT;
		TH = tH;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getLT() {
		return LT;
	}

	public void setLT(float lT) {
		LT = lT;
	}

	public float getTH() {
		return TH;
	}

	public void setTH(float tH) {
		TH = tH;
	}

	public float TB() {
		float tb =0;
		tb = (TH+LT)/2;
		return tb;
	}

	@Override
	public String toString() {
		return String.format("%-25s%-20s%-15.2f%-25.2f%25.2f \n", Id, Name, LT, TH,TB());
	}
}
