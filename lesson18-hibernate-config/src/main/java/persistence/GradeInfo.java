package persistence;

public class GradeInfo {
	
	public static final String GRADE_NAME = "gradeName";
	public static final String STUDENT_NAME = "studentName";
	public static final String EMAIL = "emailName";
	
	private String gradeName;
	private String studentName;
	private String emailName;
	
	// JPA default constructor
	public GradeInfo() {
	}

	public GradeInfo(String gradeName, String studentName, String emailName) {
		this.gradeName = gradeName;
		this.studentName = studentName;
		this.emailName = emailName;
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

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
