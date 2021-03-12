package view;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import entities.Items;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IOUtils;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		System.out.println("result: " + itemGroups.size());
		IOUtils.println(itemGroups);

		ItemGroup itemGroupById = itemGroupService.get(2);
		IOUtils.println(Collections.singletonList(itemGroupById));

		ItemGroup itemGroupByName = itemGroupService.get("Áo");
		IOUtils.println(Collections.singletonList(itemGroupByName));

//		itemGroups.stream().filter(ig -> ig.getId().equals(2)).findFirst().ifPresent(System.out::println);

		List<ItemGroupDto> selectDTO = itemGroupService.getItemGroupDetail();
		IOUtils.println(selectDTO);
		System.out.println("-----------------");

		List<Items> item = itemService.getItems(LocalDate.of(2020, 12, 17));
		IOUtils.println(item);
	}
}
