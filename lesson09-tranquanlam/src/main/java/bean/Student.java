package bean;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPoint;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentPoint) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPoint = studentPoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPoint() {
		return studentPoint;
	}

	public void setStudentPoint(String studentPoint) {
		this.studentPoint = studentPoint;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPoint=" + studentPoint
				+ "]";
	}

}
