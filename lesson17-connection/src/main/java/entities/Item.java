package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Item {
	
	public static String ID = "id";
	public static String NAME = "name";
	public static String SALES = "sale";
	public static String QUANTITY = "quantity";
	
	
	
	private Integer id;
	private String name;
	private Double sale;
	private Integer quantity;
	private ItemGroup itemGroup;
	
	public Item() {
	}

	public Item(Integer id, String name, Double sale, Integer quantity,ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
		this.quantity = quantity;
		this.itemGroup = itemGroup;
	}

	public Item(Integer id, String name, Double sale, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
		this.quantity = quantity;
		
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

	public Double getSale() {
		return sale;
	}

	public void setSale(Double sale) {
		this.sale = sale;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof ItemGroup)) {
			return false;
		}
		Item that = (Item) obj;
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getName(), that.getName())
				.append(getSale(), that.getSale())
				.append(getQuantity(), that.getQuantity())
				.append(getItemGroup(), that.getItemGroup())
				.isEquals();
	}
	@Override
	public int hashCode() {
		
		return new HashCodeBuilder()
				.append(getId())
				.append(getName())
				.append(getSale())
				.append(getQuantity())
				.append(getItemGroup())
				.toHashCode();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", sale=" + sale + ", quantity=" + quantity
				+ "]";
	}
	
	
}
