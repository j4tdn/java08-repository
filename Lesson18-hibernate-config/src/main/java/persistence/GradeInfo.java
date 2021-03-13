package persistence;

public class GradeInfo {
	public static final String GRADE_NAME = "gradeName";
	public static final String STUDENT_NAME = "studentName";
	public static final String STUDENT_EMAIL = "studentEmail";
	
	private String gradeName;
	private String studentName;
	private String studentEmail;

	public GradeInfo() {
		super();
	}

	public GradeInfo(String gradeName, String studentName, String studentEmail) {
		super();
		this.gradeName = gradeName;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return "GradeInfo [gradeName=" + gradeName + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}

}
