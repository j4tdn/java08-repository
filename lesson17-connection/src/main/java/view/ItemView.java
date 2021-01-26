package view;


import java.time.LocalDate;
import java.util.List;

import entities.Item;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IoUtils;

public class ItemView {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<Item> result = itemService.getItems(LocalDate.of(2020, 12, 18));
		IoUtils.printf(result);
	}
}
