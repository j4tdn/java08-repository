package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {
	public static String ID = "id";
	public static String NAME = "name";
	public static String SALE = "sale";
	public static String QUANTITY = "quantity";
	
	private int id;
	private String name;
	private double sale;
	private int quantity;
	private String color; 
	private ItemGroup itemGroup;

	public Item() {
	}

	public Item(int id, String name, double sale, int quantity, String color, ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
		this.quantity = quantity;
		this.color = color;
		this.itemGroup = itemGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
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
		if (this == obj)
			return true;
		if (!(obj instanceof Item)) {
			return false;
		}

		Item that = (Item) obj;
		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName())
				.append(getSale(), that.getSale()).append(getQuantity(), that.getQuantity())
				.append(getColor(), that.getColor()).append(getItemGroup(), that.getItemGroup()).build();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).append(getName()).append(getSale()).append(getQuantity())
				.append(getColor()).append(getItemGroup()).build();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId()).append(getName()).append(getSale()).append(getQuantity())
				.append(getColor()).append(getItemGroup()).build();
	}

}
