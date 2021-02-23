package persistence;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.tuple.Pair;

public class ItemGroupDto {
	
	// PROPERTIES ALIAS
	public static String ITEM_GROUP_ID = "itemGroupId";
	public static String ITEM_GROUP_NAME = "itemGroupName";
	public static String ITEM_LIST = "itemList";
	public static String TOTAL_OF_ITEMS = "totalOfItems";
	
	private Integer itemGroupId;
	private String itemGroupName;
	private List<Pair<String, Integer>> itemList;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer itemGroupId, String itemGroupName, List<Pair<String, Integer>> itemList, Integer totalOfItems) {
		super();
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.itemList = itemList;
		this.totalOfItems = totalOfItems;
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

	public List<Pair<String, Integer>> getItemList() {
		return itemList;
	}
	
	// A:10-B:12-C:20
	public void setItemListTransformer(String itemListString) {
		this.itemList = Pattern.compile("-")
						.splitAsStream(itemListString)
						.map(pair -> {
							String[] array = pair.split(":");
							return Pair.of(array[0], Integer.valueOf(array[1]));
						}).collect(Collectors.toList());
	}

	public void setItemList(List<Pair<String, Integer>> itemList) {
		this.itemList = itemList;
	}

	public Integer getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemGroupDto)) {
			return false;
		}
		
		ItemGroupDto that = (ItemGroupDto) o;
		return new EqualsBuilder()
				.append(getItemGroupId(), that.getItemGroupId())
				.append(getItemGroupName(), that.getItemGroupName())
				.append(getItemList(), that.getItemList())
				.append(getTotalOfItems(), that.getTotalOfItems())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getItemGroupId())
				.append(getItemGroupName())
				.append(getItemList())
				.append(getTotalOfItems())
				.toHashCode();
	}

	@Override
	public String toString() {
		return "ItemGroupDto [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", itemList="
				+ itemList + ", totalOfItems=" + totalOfItems + "]";
	}
	
}