package beans;

public class Lesson {
	private String name;
	private int times;
	
	public Lesson() {
		// TODO Auto-generated constructor stub
	}

	public Lesson(String name, int times) {
		super();
		this.name = name;
		this.times = times;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	
	
}
