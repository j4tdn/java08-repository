package persistence;

public class GradeInfo {
	public static final String GRADE_NAME = "gradeName";
	public static final String STUDENT_NAME = "studentName";
	public static final String EMAIL = "email";

	private String gradeName;
	private String StudentName;
	private String email;
	
	public GradeInfo() {
		// TODO Auto-generated constructor stub
	}

	public GradeInfo(String gradeName, String studentName, String email) {
		super();
		this.gradeName = gradeName;
		StudentName = studentName;
		this.email = email;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentNam) {
		StudentName = studentNam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "GradeInfo [gradeName=" + gradeName + ", StudentNam=" + StudentName + ", email=" + email + "]";
	}
	
	
}
