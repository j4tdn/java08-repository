package lesson09.exam;

public class Student {
	private int id;
	private String name;
	private String rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param rank
	 */
	public Student(int id, String name, String rank) {
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

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	

}
