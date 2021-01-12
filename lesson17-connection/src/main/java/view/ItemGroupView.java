package view;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		IOUtils.printf(result);
		
		System.out.println("2 ------------------------");
		ItemGroup selecById = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(selecById));
		
		System.out.println("3 ------------------------");
		ItemGroup selecByName = itemGroupService.get("Áo");
		IOUtils.printf(Collections.singletonList(selecByName));
	}
}
