package view;

import java.time.LocalDate;
import java.util.List;

import entities.Item;
import service.ItemServiceImpl;
import utils.IOUtils;

public class ItemView {
	private static ItemServiceImpl itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		
		System.out.println(" ------------------------");
		List<Item> items = itemService.getItems(3,300, 500);
		IOUtils.printf(items);
		
		System.out.println(" ------------------------");
		List<Item> itemsInSaleDate = itemService.getItems(LocalDate.of(2020, 12, 18));
		IOUtils.printf(itemsInSaleDate);
	}
}
