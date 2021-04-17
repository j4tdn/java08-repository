package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> get(LocalDate date);

	List<String> getHighestSaleOut(Integer year);	
	
	List<Item> getAll();
}
