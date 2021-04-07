package persistence;

import java.util.List;
import java.util.Map.Entry;
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

	public ItemGroupDto(Integer itemGroupId, String itemGroupName, List<Pair<String, Integer>> itemList,
			Integer totalOfItems) {
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.itemList = null;
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
		this.itemList = Pattern.compile("-") // String
				.splitAsStream(itemListString) // Stream<String> element: A:10 => B:12
				.map(pair -> {
					String[] array = pair.split(":");
					return Pair.of(array[0], Integer.valueOf(array[1]));
				}) // Stream<Pair>
				.collect(Collectors.toList()); // List<Pair>

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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemGroupDto)) {
			return false;
		}

		ItemGroupDto that = (ItemGroupDto) obj;
		return new EqualsBuilder().append(getItemGroupId(), that.getItemGroupId())
				.append(getItemGroupName(), that.getItemGroupName()).append(getItemList(), that.getItemList())
				.append(getTotalOfItems(), that.getTotalOfItems()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getItemGroupId()).append(getItemGroupName()).append(getItemList())
				.append(getTotalOfItems()).hashCode();
	}

	@Override
	public String toString() {
		return "ItemGroupDto [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", itemList="
				+ itemList + ", totalOfItems=" + totalOfItems + "]";
	}

}
