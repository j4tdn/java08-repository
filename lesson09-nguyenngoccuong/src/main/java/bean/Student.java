package bean;

public class Student {
	private int id;
	private String name;
	private char rank;
	
	public Student() {
	}

	public Student(int id, String name, char rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}
	
	public static Student[] initData() {
		Student[] students = {new Student(102, "Nam", 'C'), new Student(104, "Hoàng", 'D'), new Student(109, "Lan", 'A'),
				new Student(103, "Bảo", 'F'), new Student(105, "Nguyên", 'B'), new Student(107, "Vũ", 'F'),
				new Student(103, "Bảo", 'F'), new Student(202, "Đạt", 'C'), new Student(107, "Vũ", 'C'),
				new Student(193, "Bảo", 'B'), new Student(199, "Tài", 'A')};
		return students;		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
	
}
