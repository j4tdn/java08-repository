package view;

import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImp;
import utils.IOUtils;

public class ItemGroupView {
	private final static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImp(); 
	}
	public static void main(String[] args) {
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		IOUtils.printf(itemGroups);
		System.out.println("==================================");
		ItemGroup itemGroup = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(itemGroup));
		System.out.println("==================================");
		ItemGroup itemGroup1 = itemGroupService.get("Qu");
		IOUtils.printf(Collections.singletonList(itemGroup1));
		System.out.println("==================================");
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemGroupDetail();
		IOUtils.printf(itemGroupDtos);
	}
}
