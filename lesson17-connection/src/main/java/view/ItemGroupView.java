package view;

import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDTO;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IOUtils;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
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
		
		List<ItemGroupDTO> selectDTO = itemGroupService.getItemGroupDetail();
		IOUtils.println(selectDTO);
	}
}
