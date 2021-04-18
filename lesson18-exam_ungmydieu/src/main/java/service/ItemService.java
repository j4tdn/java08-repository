package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dto.ItemInSaleDateDto;
import persistence.Item;

public class ItemService {
	ItemDao itemDao;
	
	public ItemService() {
	itemDao = new ItemDao();
	}
	
	public List<ItemInSaleDateDto> getItemInSaleDate(LocalDate date) {
		return itemDao.getItemInSaleDate(date);
	}
	
	public List<Item> getTopItemBestSale(Integer year) {
		return itemDao.getTopItemBestSale(year);
	}
}
