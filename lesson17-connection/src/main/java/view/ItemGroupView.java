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
		List<ItemGroup> result = itemGroupService.getAll();
		System.out.println("result size: "+result.size());
		IOUtils.printf(result);
		
		System.out.println("========================");
		List<ItemGroup> selectAll = itemGroupService.getAll();
		IOUtils.printf(selectAll);

		System.out.println("========================");
		ItemGroup selectById = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList(selectById)); //List chỉ chứa 1 ptu

		System.out.println("========================");
		ItemGroup selectByName = itemGroupService.get("Q");
		IOUtils.printf(Collections.singletonList(selectByName));
		
		System.out.println("========================");
		List<ItemGroupDTO> selectDTO = itemGroupService.getItemGroupDetail();
		System.out.println("Alooo");
		IOUtils.printf(selectDTO);
	}
}
