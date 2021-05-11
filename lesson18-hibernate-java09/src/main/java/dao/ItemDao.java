package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;


public interface ItemDao {
	List<Item> getAll();
	Item get(int id);
	List<ItemDto> getItemDtos();
	void save(Item item);
}
