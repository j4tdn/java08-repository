package bean;

public class Trader 
{
	private String name;
	private String city;
	
	public Trader() {}
	
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
		return name + " - " + city;
	}
	
	@Override
	public boolean equals(Object t) {
		Trader temp = (Trader) t;
		return name.equals(temp.getName()) && city.equals(temp.getCity());
	}
	
	@Override
	public int hashCode() {
		return name.length() * 10 + city.length();
	}
}
