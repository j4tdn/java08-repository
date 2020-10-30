package Bean;

import java.util.Calendar;
import java.util.Objects;

public class Item   {
	private int id ;

	private String name ;
	
	public Item() {


	}
	
	
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr = new int[66];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
	}
	
	
	public int getId() {
		return this.id ;
	}
	
	public void setId(int id) {
		this.id = id ;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true ;
		}
		
		if(!(obj instanceof Item)) {
			return false ;
		}
		
		Item that = (Item)obj;
		
		return this.getId() == that.getId() && this.getName().equals(that.getName());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

//	@Override
//	public int compareTo(Item o) {
//		return this.getId() - o.getId();
//	}

}
