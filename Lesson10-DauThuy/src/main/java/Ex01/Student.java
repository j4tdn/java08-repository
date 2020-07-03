package Ex01;

public class Student {
	private String code;
	private String fullName;
	private String classification;

	public Student() {
	}

	public Student(String code, String fullName, String classification) {
		this.code = code;
		this.fullName = fullName;
		this.classification = classification;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return String.join("-", code, fullName, classification);
	}
}