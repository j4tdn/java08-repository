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
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		List<ItemGroup> result = 	itemGroupService.getAll();
		System.out.println("result size: " + result.size());
		IOUtils.printf(result);
		
		System.out.println("------------------------");
		ItemGroup itemGroup = itemGroupService.getById(2);
		IOUtils.printf(Collections.singletonList((itemGroup)));
		
		System.out.println("------------------------");
		ItemGroup itemGroup2 = itemGroupService.getByName("Áo");
		IOUtils.printf(Collections.singletonList((itemGroup2)));
		
		System.out.println("----------------------------");
		
		List<ItemGroupDto> itemGroupDtos= itemGroupService.getListItemGroupDetail();
		IOUtils.printf(Collections.singletonList((itemGroupDtos)));

	}
}
