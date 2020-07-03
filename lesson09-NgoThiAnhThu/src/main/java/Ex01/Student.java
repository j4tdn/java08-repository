package Ex01;


public class Student {
	
	
	private String mssv;
	private String name;
	private String score;

	public Student() {
		
	}

	public Student(String mssv, String name, String score) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.score = score;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "mssv=" + mssv + ", name=" + name + ", score=" + score;
	}

	
}
