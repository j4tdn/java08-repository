package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {

	public static String ID = "id";
	public static String NAME= "name";
	public static String SIZE= "size";
	public static String SALES_IN= "salesOut";
	public static String SALES_OUT= "salesOut";
	public static String QUANTITY= "quantity";
	public static String COLOR= "color";
	public static String ITEM_GROUP= "itemGroup";
	
	private Integer id;
	private String name;
	private String size;
	private Double salesIn;
	private Double salesOut;
	private Integer quantity;
	private String color;
	private ItemGroup itemGroup;

	public Item() {
	}

	public Item(Integer id, String name, String size, Double salesIn, Double salesOut, Integer quantity, String color,
			ItemGroup itemGroup) {
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

	public void setSalesIn(Double buyPrice) {
		this.salesIn = buyPrice;
	}

	public Double getSalesOut() {
		return salesOut;
	}

	public void setSalesOut(Double sellPrice) {
		this.salesOut = sellPrice;
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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Item))
			return false;
		Item that = (Item) o;
		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName())
				.append(getSize(), that.getSize()).append(getSalesIn(), that.getSalesIn())
				.append(getSalesOut(), that.getSalesOut()).append(getQuantity(), that.getQuantity())
				.append(getColor(), that.getColor()).append(getItemGroup(), that.getItemGroup()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).append(getName())
				.append(getSize()).append(getSalesIn())
				.append(getSalesOut()).append(getQuantity())
				.append(getColor()).append(getItemGroup()).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId()).append(getName())
				.append(getSize()).append(getSalesIn())
				.append(getSalesOut()).append(getQuantity())
				.append(getColor()).append(getItemGroup()).toString();
	}
}
