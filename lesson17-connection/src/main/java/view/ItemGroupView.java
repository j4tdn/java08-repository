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
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		List<ItemGroup> result = itemGroupService.getAll();
		System.out.println("result size: "+result.size());
		IOUtils.printf(result);

		System.out.println("========================");
		ItemGroup selectId=itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(selectId));

		System.out.println("========================");
		ItemGroup selectname=itemGroupService.get("Q");
		IOUtils.printf(Collections.singletonList(selectname));
	}
}
