package view;

import java.time.LocalDate;
import java.util.List;

import entities.Item;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IOUtils;

public class ItemView {
	
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<Item> result = itemService.getItems(LocalDate.of(2020, 12, 18));
		IOUtils.printf(result);
	}
}
