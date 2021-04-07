package json;

import java.util.List;

public class UniversityStandardClass {
	private List<Item> items;
	
	public UniversityStandardClass() {
	}
	
	public UniversityStandardClass(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		for (Item item: items) {
			System.out.println(item);
		}
		return "";
	}
	
	
}
