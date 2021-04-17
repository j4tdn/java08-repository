package view;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemService;

public class App {

	private static ItemService itemService;
	private static ItemGroupService groupService;
	static {
		itemService = new ItemService();
		groupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		itemService.get(LocalDate.of(2020, 12, 18)).forEach(System.out::println);

		System.out.println("-----------------------------");
		
		groupService.getTotalOfItem().forEach(System.out::println);


		System.out.println("-----------------------------");
	
		itemService.getHighestSaleOut(2020).forEach(System.out::println);

		System.out.println("-----------------------------");
		
		itemService.getAll().forEach(System.out::println);

	}

}
