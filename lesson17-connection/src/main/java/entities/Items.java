package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Items {
	public static String ID = "itemId";
	public static String NAME = "itemName";
	public static String SALE_OUT = "salesPrice";
	public static String QUANTITY = "quantity";
	
	private Integer itemId;
	private Integer quantity;
	private String itemName;
	private String size;
	private String buyPrice;
	private Double salesPrice;
	private String color;
	private ItemGroup itemGroup;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public String getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
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
		if (this == o) {
			return true;
		}
		if (!(o instanceof Items)) {
			return false;
		}

		Items that = (Items) o;
		return new EqualsBuilder().append(getItemId(), that.getItemId()).append(getItemName(), that.getItemName())
				.isEquals();
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", quantity=" + quantity + ", itemName=" + itemName + ", size=" + size
				+ ", buyPrice=" + buyPrice + ", salesPrice=" + salesPrice + ", color=" + color + ", itemGroup="
				+ itemGroup + "]";
	}

}
