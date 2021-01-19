package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroup {
	private int id;
	private String name;

	public ItemGroup() {
	}

	public ItemGroup(int id, String name) {
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
		return new HashCodeBuilder().append(getId()).append(getName()).build();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ItemGroup)) {
			return false;
		}

		ItemGroup that = (ItemGroup) obj;
		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName()).build();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId()).append(getName()).build();
	}

}
