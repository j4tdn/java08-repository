package Ex01;

public class Student {
	private int mssv;
	private String fullName;
	private float theoryPoint; //diem ly thuyet
	private float practicePoint;
	
	public Student() {
		
	}
	
	public Student(int mssv, String fullName, float theoryPoint, float practicePoint) {
		super();
		this.mssv = mssv;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getMSSV() {
		return mssv;
	}

	public void setMSSV(int id) {
		this.mssv = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public float getAvgPoint() {
		float AvgPoint = (theoryPoint + practicePoint)/2;
		return AvgPoint;
	}
	
	@Override
	public String toString() {
		return String.format("%-20d %-25s %-20.2f %-20.2f %-20.2f", mssv, fullName, theoryPoint, practicePoint, getAvgPoint());
	}
	
}
