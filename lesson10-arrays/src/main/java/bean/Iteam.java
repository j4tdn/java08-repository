package bean;

import java.util.Comparator;

public class Iteam implements Comparable<Iteam>{

	private int id;
	private String name;
	
	public Iteam(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Iteam(){
		
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
		return id + " ," + name;
	}
	
	
	@Override
	public int compareTo(Iteam o) {	
		//return getId()-o.getId();
		return getName().compareTo(o.getName());
	}
	
	

}
