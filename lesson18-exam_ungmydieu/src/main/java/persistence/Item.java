package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MatHang")
public class Item {
	@Id
	@Column(name = "MaMH")
	private Integer id;
	
	@Column(name = "TenMH")
	private String name;
	
	@Column(name = "GiaMua")
	private Double purchasePrice;
	
	@Column(name = "GiaBan")
	private Double salePrice;
	
	@Column(name = "SoLuong")
	private Integer quantity;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private TypeItem typeItem;
	
	public Item() {
	}

	public Item(Integer id, String name, Double purchasePrice, Double salePrice, Integer quantity, TypeItem typeItem) {
		super();
		this.id = id;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.quantity = quantity;
		this.typeItem = typeItem;
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

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public TypeItem getTypeItem() {
		return typeItem;
	}

	public void setTypeItem(TypeItem typeItem) {
		this.typeItem = typeItem;
	}
	
	@Override
	public String toString() {
		return "Item: [id: " + id + " - name: " + name + " - LoaiHang: " + typeItem + "]";
	}
	
}
