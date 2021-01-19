package view;

import java.time.LocalDate;
import java.util.List;

import entities.Item;
import service.ItemService;
import service.ItemServiceImp;
import utils.IOUtils;

public class ItemView {
	private final static ItemService itemService;
	
	static {
		itemService = new ItemServiceImp(); 
	}
	public static void main(String[] args) {
		List<Item> items = itemService.getItems(LocalDate.of(2020, 12, 18));
		IOUtils.printf(items);
	}
}
