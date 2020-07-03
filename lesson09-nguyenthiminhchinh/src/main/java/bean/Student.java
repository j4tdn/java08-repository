package bean;

public class Student {
	private String ID;
	private String Name;
	private String classification;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String iD, String name, String classification) {
		super();
		ID = iD;
		Name = name;
		this.classification = classification;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + ID + " Name: " + Name + " Classification: " + classification;
	}

}
