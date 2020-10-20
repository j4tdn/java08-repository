package bean;

import java.util.Objects;

public class Iteam {
	private int Id;
	private String Name;

	public Iteam(int id, String name) {
		Id = id;
		Name = name;
	}

	public Iteam() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Iteam)) {
			return false;
		}
		Iteam that = (Iteam) obj;
		return this.getId() == that.getId() && getName().equals(that.getName());

	}

	@Override
	public int hashCode() {
		
		return Objects.hash(Id,Name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id + "," + Name;
	}
}
