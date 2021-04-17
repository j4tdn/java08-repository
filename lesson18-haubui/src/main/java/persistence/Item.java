package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MatHang")
public class Item {

	@Id
	@Column(name = "MaMH")
	private Integer itemId;

	@Column(name = "TenMH")
	private String itemName;

	@Column(name = "size")
	private String size;

	@Column(name = "GiaMua")
	private Double saleIn;

	@Column(name = "GiaBan")
	private Double saleOut;

	@Column(name = "SoLuong")
	private Integer qty;

	@Column(name = "MauSac")
	private String color;

	@ManyToOne
	@JoinColumn(name = "MaLoai")
	private ItemGroup itemGroup;

	public Item() {
	}

	public Item(Integer itemId, String itemName, String size, Double saleIn, Double saleOut, Integer qty, String color,
			ItemGroup itemGroup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.size = size;
		this.saleIn = saleIn;
		this.saleOut = saleOut;
		this.qty = qty;
		this.color = color;
		this.itemGroup = itemGroup;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getSaleIn() {
		return saleIn;
	}

	public void setSaleIn(Double saleIn) {
		this.saleIn = saleIn;
	}

	public Double getSaleOut() {
		return saleOut;
	}

	public void setSaleOut(Double saleOut) {
		this.saleOut = saleOut;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return itemGroup+ " | " + itemId + " | " + itemName + " | " + size + " | " + saleIn
				+ " | " + saleOut + " | " + qty + " | " + color ;
	}

}