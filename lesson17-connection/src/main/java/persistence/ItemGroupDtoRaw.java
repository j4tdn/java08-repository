package persistence;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ItemGroupDtoRaw {
	//PROPERTIES ALIAS
	public static String ITEM_GROUP_ID = "itemGroupId";
	public static String ITEM_GROUP_NAME = "itemGroupName";
	public static String ITEM_NAME = "itemName";
	public static String NUMBER_OF_ITEMS = "numberOfItems";
	
	private Integer itemGroupId;
	private	String itemGroupName;
	private String itemName;
	private Integer numberOfItems;
	
	public ItemGroupDtoRaw() {
		
	}

	public ItemGroupDtoRaw(Integer itemGroupId, String itemGroupName, String itemName , Integer numberOfItems) {
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.itemName = itemName;
		this.numberOfItems = numberOfItems;
	}

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof ItemGroupDto)) {
			return false;
		}
		ItemGroupDtoRaw that = (ItemGroupDtoRaw) obj;
		
		
		return new EqualsBuilder()
				.append(getItemGroupId(), that.getItemGroupId())
				.append(getItemGroupName(), that.getItemGroupName())
				.append(getItemName(), that.getItemName())
				.append(getNumberOfItems(), that.getNumberOfItems())
				.isEquals();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getItemGroupId())
				.append(getItemGroupName())
				.append(getItemName())
				.append(getNumberOfItems())
				.hashCode();
	}

	@Override
	public String toString() {
		return "ItemGroupDtoRaw [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", itemName="
				+ itemName + ", numberOfItems=" + numberOfItems + "]";
	}

}
