package bean;

//pojo: plan old java object. object (1 class binh thuong)
//dto: data transfer object
//entity: mapper database table

public class Item {
	private int id;
	private String name;
	
	public Item() {

	}
	
	public Item(int id, String name) {
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
	
	@Override
	public String toString() {
		return id + ", " + name;
	}
	
}
