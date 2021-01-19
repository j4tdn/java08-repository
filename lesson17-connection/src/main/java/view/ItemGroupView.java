package view;

import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IOUtils;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;

	// initial static variables
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		List<ItemGroup> result = itemGroupService.getAll();
		IOUtils.printf(result);
		System.out.println("==================");

		ItemGroup itemGetById = itemGroupService.getItem(2);
		IOUtils.printf(Collections.singletonList(itemGetById));
		System.out.println("==================");

		ItemGroup itemGetByName = itemGroupService.getItem("Áo");
		IOUtils.printf(Collections.singletonList(itemGetByName));
		System.out.println("====================");
		
//		List<ItemGroupDto> selectDto = itemGroupService.getItemGroupDetail();
//		IOUtils.printf(selectDto);
		
//		itemGroups.stream().filter(ig -> ig.getId().equals(2)).findFirst().ifPresent(System.out::println);
		
		List<ItemGroupDto> selectDTO = itemGroupService.getItemGroupDetail();
		IOUtils.printf(selectDTO);
	
	}
}
