package ex01;

public class Student {
	private String id;
	private String name;
	private String point;

	public Student() {
	}

	public Student(String id, String name, String point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Student student = (Student) obj;

		return (student.id.equals(this.id));
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + "]";
	}

	
}
