package persstence;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.tuple.Pair;

import entities.ItemGroup;

public class ItemGroupDto {
	public static String ITEM_GROUP_ID = "itemGroupId";
	public static String ITEM_GROUP_NAME = "itemGroupName";
	public static String ITEM_LIST = "itemList";
	public static String TOTAL_OF_ITEM = "totalOfItems";

	private Integer itemGroupId;
	private String itemGroupName;
	private List<Pair<String, Integer>> itemList;
	private Integer totalOfItems;

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

	// A:10 - B: 30
	public void setItemListTranformer(String itemListString) {
		this.itemList = Pattern.compile("-").splitAsStream(itemListString).map(pair -> {
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
		if (!(o instanceof ItemGroup)) {
			return false;
		}

		ItemGroupDto that = (ItemGroupDto) o;
		return new EqualsBuilder().append(getItemGroupId(), that.getItemGroupId())
				.append(getItemGroupName(), that.getItemGroupName()).append(getItemList(), that.getItemList())
				.append(getTotalOfItems(), that.getTotalOfItems()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getItemGroupId()).append(getItemGroupName()).append(getItemList())
				.append(getTotalOfItems()).toHashCode();
	}

	@Override
	public String toString() {
		return "ItemGroupDTO [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", itemList="
				+ itemList + ", totalOfItems=" + totalOfItems + "]";
	}

}
