package persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class ItemGroup {
	@Id
	@Column(name = "MaLoai")
	private Integer groupId;

	@Column(name = "TenLoai")
	private String groupName;

	@OneToMany(mappedBy = "itemGroup")
	private Set<Item> item;

	
	public ItemGroup() {
	}

	public ItemGroup(int id, String name) {
		this.groupId = id;
		this.groupName = name;
	}

	public int getId() {
		return groupId;
	}

	public void setId(int id) {
		this.groupId = id;
	}

	public String getName() {
		return groupName;
	}

	public void setName(String name) {
		this.groupName = name;
	}

	public String toString() {
		return groupId + " | " + groupName;
	}

}
