package bean;

import java.util.Objects;

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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Item)) {
			return false;
		}
		
		Item that = (Item)obj;
		
		return getId() == that.getId()
			&& getName().equals(that.getName());	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public String toString() {
		return id + ", " + name;
	}
	
}
