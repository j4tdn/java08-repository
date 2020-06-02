package Ex01;

public class Student {
	private int id;
	private String fullname;
	private float theory;
	private float practice;

	public Student() {
	}

	public Student(int id, String fullname, float theory, float practice) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.theory = theory;
		this.practice = practice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getTheory() {
		return theory;
	}

	public void setTheory(float theory) {
		this.theory = theory;
	}

	public float getPractice() {
		return practice;
	}

	public void setPractice(float practice) {
		this.practice = practice;
	}

	public float Point_Average(float a, float b) {
		return (a + b) / 2;
	}

	@Override
	public String toString() {
		return "Student id : " + id + ", fullname : " + fullname + ", theory : " + theory + ", practice : " + practice ;
	}
}
