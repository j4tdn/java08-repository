package bean;
//pojo:plain old java object 
//dto: data transfer object
//enity: mapper database table
public class Item {

	private int Id;
	private String name;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	

	public Item(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
