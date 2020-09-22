package bean;

// pojo: plain old java object
// dto: data transfer object
// entity: mapper database table
public class Item {
	private int id;
	private String name;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
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

}
