package view;

import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IOUtils;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	
	static {
		// initial static variables
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		IOUtils.printf(itemGroups);
		
		System.out.println("-----------------------");		
		ItemGroup itemGroup = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(itemGroup));
		
		System.out.println("-----------------------");		
		ItemGroup selectByName = itemGroupService.get("Quầ");
		IOUtils.printf(Collections.singletonList(selectByName));			
	}
}
