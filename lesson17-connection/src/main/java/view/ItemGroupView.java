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
		System.out.println("------");
		
		ItemGroup seGroup = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(seGroup));
		System.out.println("------");
		
		// khong duoc code kieu nay - khi nao lay sql khong duoc moi dung java xu ly
		itemGroups.stream()
					.filter(ig -> ig.getId().equals(2))
					.findFirst()
					.ifPresent(System.out::println);
		
		System.out.println("------");
		//sql ịnection
		ItemGroup selectByName = itemGroupService.get("Áo");
		IOUtils.printf(Collections.singletonList(selectByName));
		System.out.println("------");
		
	}
}