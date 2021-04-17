package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemService;

public class App {

	private static ItemService itemService;
	private static ItemGroupService itemGroupService;

	static {
		itemService = new ItemService();
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		System.out.println("==============1==============");
		List<ItemDto> items = itemService.getItemsByOrderDate(LocalDate.of(2020, 12, 18));
		items.forEach(System.out::println);
		
		System.out.println("==============2==============");
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getQuantityOfItemsInEachItemGroup();
		itemGroupDtos.forEach(System.out::println);
		
		System.out.println("==============3==============");
		List<String> itemNames = itemService.getTop3BestSellerItemsByYear(2020);
		itemNames.forEach(System.out::println);
		
		System.out.println("==============4==============");
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		itemGroups.forEach(System.out::println);
	}
}
