package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class Item {

	public static String ID = "id";
	public static String NAME = "name";
	public static String SALES_OUT = "salesOut";
	public static String QUANTITY = "quantity";

	@Id
	@Column(name = "MaMH")
	private Integer id;

	@Column(name = "TenMH")
	private String name;

	@Column(name = "Size")
	private String size;

	@Column(name = "GiaMua")
	private Double salesIn;

	@Column(name = "GiaBan")
	private Double salesOut;

	@Column(name = "SoLuong")
	private Integer quantity;

	@Column(name = "MauSac")
	private String color;

	@ManyToOne
	@JoinColumn(name = "MaLoai", nullable = false)
	private ItemGroup itemGroup;

	public Item() {
	}

	public Item(Integer id, String name, String size, Double salesIn, Double salesOut, Integer quantity, String color,
			ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.salesIn = salesIn;
		this.salesOut = salesOut;
		this.quantity = quantity;
		this.color = color;
		this.itemGroup = itemGroup;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getSalesIn() {
		return salesIn;
	}

	public void setSalesIn(Double salesIn) {
		this.salesIn = salesIn;
	}

	public Double getSalesOut() {
		return salesOut;
	}

	public void setSalesOut(Double salesOut) {
		this.salesOut = salesOut;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
		return "Item [id=" + id + ", name=" + name + ", size=" + size + ", salesIn=" + salesIn + ", salesOut="
				+ salesOut + ", quantity=" + quantity + ", color=" + color + "]";
	}

}
