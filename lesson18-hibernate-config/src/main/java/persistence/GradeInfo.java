package persistence;

public class GradeInfo {
	private String gradeName;
	private String studentName;
	private String email;
	
	// JPA default constructor
	public GradeInfo() {
	}

	public GradeInfo(String gradeName, String studentName, String email) {
		super();
		this.gradeName = gradeName;
		this.studentName = studentName;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "GradeInfo [gradeName=" + gradeName + ", studentName=" + studentName + ", email=" + email + "]";
	}

	
}
