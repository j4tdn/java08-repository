package persistence;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

public class ItemGroupDtoHelper {
	private ItemGroupDtoHelper() {

	}

	public static ItemGroupDTO convert(Entry<Pair<Integer, String>, List<ItemGroupDTORaw>> entry) {
		ItemGroupDTO dto = new ItemGroupDTO();
		dto.setItemGroupId(entry.getKey().getLeft());
		dto.setItemGroupName(entry.getKey().getRight());

		List<ItemGroupDTORaw> entryValue = entry.getValue();
		List<Pair<String, Integer>> itemList = entryValue.stream()
				.map(ev -> Pair.of(ev.getItemName(), ev.getNumberOfItems())).collect(Collectors.toList());
		dto.setItemList(itemList);
		Integer totalOfItem = entryValue.stream().mapToInt(ItemGroupDTORaw::getNumberOfItems).sum();
		dto.setTotalOfItems(totalOfItem);
		return dto;
	}

}
