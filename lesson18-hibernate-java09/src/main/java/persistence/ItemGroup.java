package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity; //trong goi JPA
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "LoaiHang")
@NamedQueries({
	@NamedQuery(name=ItemGroup.SELECT_ALL,
			query = "FROM ItemGroup")
})


public class ItemGroup {
	public static final String SELECT_ALL="SELECT_ALL";
	
	@Id
	@Column(name = "MaLoai")
	private Integer igId;
	
	@Column(name = "TenLoai")
	private String igName;
	
	@OneToMany(mappedBy = "itemGroup") //đặt tên phải bằng với biến bên Item
	private List<Item> items;
	
	//JPA default constructor
	public ItemGroup() {

	}

	public ItemGroup(Integer igId, String igName) {
		super();
		this.igId = igId;
		this.igName = igName;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}
	
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName +"]";
	}

	
}