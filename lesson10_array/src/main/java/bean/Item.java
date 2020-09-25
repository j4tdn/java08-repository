package bean;

//pojo: plain old java object
//dto: data transfer object
//entity: mapper database table

public class Item {
	@Override
	public String toString() {
		return "id = " + id + ", name = " + name;
	}
	private int id;
	private String name;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 * @param name
	 */
	public Item(int id, String name) {
		super();
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
	
	public int compareTo(Item o) {
		return getId()-o.getId();
	}
	
	
	

}
