package bean;

import java.util.Objects;

public class Item {
	private int id;
	private String name;

	public Item() {
		// TODO Auto-generated constructor stub
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
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}

		Item other = (Item) obj;
		return getId() == other.getId() && getName().equals(other.getName());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

}
