package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Item {
	public static String ID = "id";
	public static String NAME = "name";
	public static String SALES_OUT = "salesOut";
	public static String QUANTITY = "quantity";
	
	private Integer id;
	private String name;
	private String size;
	private double salesIn;
	private double salesOut;
	private int quantity;
	private String color;
	private ItemGroup itemGroup;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, String size, double salesIn, double salesOut, int quantity, String color,
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

	public double getSalesIn() {
		return salesIn;
	}

	public void setSalesIn(double salesIn) {
		this.salesIn = salesIn;
	}

	public double getSalesOut() {
		return salesOut;
	}

	public void setSalesOut(double salesOut) {
		this.salesOut = salesOut;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;

		}

		Item that = (Item) obj;

		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName())
				.append(getQuantity(), that.getQuantity()).append(getSalesIn(), that.getSalesIn())
				.append(getSalesOut(), that.getSalesOut()).append(getColor(), that.getColor())
				.append(getSize(), that.getSize()).isEquals();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", size=" + size + ", salesIn=" + salesIn + ", salesOut="
				+ salesOut + ", quantity=" + quantity + ", color=" + color + ", itemGroup=" + itemGroup + "]";
	}
	
	

}
