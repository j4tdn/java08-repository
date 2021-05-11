package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietMatHang")
public class ItemDetail {
	
	@Id
	@Column(name = "MaCTMH")
	private Integer id;
	
	@Column(name = "NhaSanXuat")
	private String fName;
	
	@Column(name = "ThongTin")
	private String info;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH")
	private Item item;
	
	public ItemDetail() {
	}

	public ItemDetail(Integer id, String fName, String info) {
		super();
		this.id = id;
		this.fName = fName;
		this.info = info;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", fName=" + fName + ", info=" + info + "]";
	}

}