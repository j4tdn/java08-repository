package bean;

import java.util.Objects;

public class Trader {

	private String name;
	private String city;
	
	public Trader() {
	}

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name: "+name+" city: "+city;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name,city);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Trader)) {
			return false;
		}
		Trader that= (Trader)obj;
		return getName().equals(that.getName())
				&& getCity().equals(that.getCity());
	}
	
	
}
