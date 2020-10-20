package bean;

import java.util.Objects;

public class Item {
	private int id;
	private String name;

	public Item() {
		super();
	}

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Item)) {
			return false;
		}

		Item that = (Item) obj;

//		return that.getId() == getId() && that.getName().equals(getName());
		return that.getName().equals(getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id : " + id + ", name : " + name;
	}

	//hardcode function attribute code as equal function attribute
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}
}
