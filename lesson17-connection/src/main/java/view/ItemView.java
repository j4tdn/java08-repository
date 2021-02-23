package view;

import java.time.LocalDate;
import java.util.List;

import entities.Item;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IOUtils;

public class ItemView {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<Item> items = itemService.getItems(2, 100, 500);
		IOUtils.printf(items);
		
		System.out.println("--------------------------------");
		List<Item> itemsInSalesDate = itemService.getItems(LocalDate.of(2020, 12, 18));
		IOUtils.printf(itemsInSalesDate);
	}
}
