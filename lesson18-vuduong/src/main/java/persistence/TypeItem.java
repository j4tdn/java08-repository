package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class TypeItem {
	@Id
	@Column(name = "MaLoai")
	private Integer id;
	
	@Column(name = "TenLoai")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "typeItem")
	private Set<Item> items = new HashSet<Item>();
	
	public TypeItem() {
	}

	public TypeItem(Integer id, String name, Set<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
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

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "TypeItem [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
	
	

}
