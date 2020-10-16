package Bean;

import java.util.Calendar;

public class Item implements Comparable<Item>  {
	private int id ;

	private String name ;
	
	public Item() {

		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.MONTH));
	}
	
	
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
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
		
		return this.getId() == that.getId() && this.getName() == that.getName();
		
	}


	@Override
	public int compareTo(Item o) {
		return o.getId();
	}

	
}
