package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
public class TypeItem {
	@Id
	@Column(name = "MaLoai")
	private Integer id;
	
	@Column(name = "TenLoai")
	private String name;
	
	public TypeItem() {
	}

	public TypeItem(Integer id, String name) {
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
	public String toString() {
		return "TypeItem: [id: " + id + " - name: " + name + "]";
	}
}
