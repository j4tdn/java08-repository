package view;

import java.util.Collections;
import java.util.List;

import dao.ItemGroupDaoImpl;
import entities.ItemGroup;
import persistence.ItemGroupDto;
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
		// 1 000 000
		List<ItemGroup> selectAll = itemGroupService.getAll();
		IOUtils.printf(selectAll);
		
		System.out.println("--------------------------");
		ItemGroup selectById = itemGroupService.get(2);
		IOUtils.printf(Collections.singletonList((selectById)));
		
		System.out.println("--------------------------");
		// sql injection
		ItemGroup selectByName = itemGroupService.get("Quầ");
		IOUtils.printf(Collections.singletonList((selectByName)));
		
		System.out.println("--------------------------");
		List<ItemGroupDto> selectDto = itemGroupService.getItemGroupDetail();
		IOUtils.printf(selectDto); // blob, clob
		
	}
}
