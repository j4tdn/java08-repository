package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.ItemDao;
import persistence.ItemDto;

public class ItemService {
	private static ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<ItemDto> getItemsByOrderDate(LocalDate localDate) {
		return itemDao.getItemsByOrderDate(localDate);
	}

	public List<String> getTop3BestSellerItemsByYear(Integer year) {
		List<ItemDto> items = itemDao.getTop3BestSellerItemsByYear(year);
		return items.stream().map(ItemDto::getName).collect(Collectors.toList());

	}

}
