package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroup {
	private Integer id;
	private String name;

	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return new HashCodeBuilder().append(getId()).append(getName()).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ItemGroup)) {
			return false;

		}

		ItemGroup that = (ItemGroup) obj;

		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName()).isEquals();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId()).append(getName()).toString();
	}
}
