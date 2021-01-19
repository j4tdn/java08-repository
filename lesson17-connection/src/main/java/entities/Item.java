package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {
	
	public static String ID = "id";
	public static String NAME = "name";
	public static String SALES_OUT = "salseout";
	public static String QUANTITY = "quantity";
	
	// attribute
	private Integer Id;
	private String name;
	private Double priceBuy;
	private Double priceSell;
	private Integer count;
	private String color;
	private ItemGroup itemGroup;
	private Integer quantity;

	public Item(Integer id, String name, Double priceBuy, Double priceSell, Integer count, String color,
			ItemGroup itemGroup, Integer quantity) {
		super();
		Id = id;
		this.name = name;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
		this.count = count;
		this.color = color;
		this.itemGroup = itemGroup;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item(Integer id, String name, Double priceBuy, Double priceSell, Integer count, String color,
			ItemGroup itemGroup) {
		super();
		Id = id;
		this.name = name;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
		this.count = count;
		this.color = color;
		this.itemGroup = itemGroup;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, Double priceBuy, Double priceSell, Integer count, String color) {
		super();
		Id = id;
		this.name = name;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
		this.count = count;
		this.color = color;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(Double i) {
		this.priceBuy = i;
	}

	public Double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(Double priceSell) {
		this.priceSell = priceSell;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof ItemGroup)) {
			return false;
		}
		Item that = (Item)o;
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getName(), that.getName())
				.append(getPriceBuy(), that.getPriceBuy())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(getId())
					.append(getName())
					.toHashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId())
										.append(getName())
										.append(getPriceBuy())
										.append(getQuantity())
										.toString();
	}
}
