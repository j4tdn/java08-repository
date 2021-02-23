package persistence;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

public class ItemGroupDtoHelper {
	private ItemGroupDtoHelper() {
		
	}
	
	public static ItemGroupDto convert(Entry<Pair<Integer, String>, List<ItemGroupDtoRaw>> entry) {
		ItemGroupDto dto = new ItemGroupDto();
		dto.setItemGroupId(entry.getKey().getLeft());
		dto.setItemGroupName(entry.getKey().getRight());
		
		List<ItemGroupDtoRaw> entryValue = entry.getValue();
		List<Pair<String, Integer>> itemList = entryValue.stream()
				.map(ev -> Pair.of(ev.getItemName(), ev.getNumberOfItems()))
				.collect(Collectors.toList());
		dto.setItemList(itemList);
		
		Integer totalOfItems = entryValue.stream()
								.mapToInt(ItemGroupDtoRaw::getNumberOfItems)
								.sum();
		dto.setTotalOfItems(totalOfItems);
		return dto;
	}
}