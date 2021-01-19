package view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;
import service.*;
import utils.IOUtils;

public class ItemGroupView {
	private final static ItemGroupService itemGroupService;

	private final static ItemService itemService ;


	
	static {
		itemGroupService = new ItemGroupServiceImp();
		itemService = new ItemServiceImpl();

	}
	public static void main(String[] args) throws SQLException {
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


		System.out.println("=================================");
		System.out.println(itemService.getItems(LocalDate.of(2020,12,18)));


		// trong mysql, mỗi tag query là một transaction



	}
}
