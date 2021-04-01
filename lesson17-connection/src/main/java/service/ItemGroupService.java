package service;

import java.util.List;

import entities.Item;
import entities.ItemGroup;
import persistence.ItemGroupDTO;
import persistence.ItemGroupDTORaw;

public interface ItemGroupService {
	List<ItemGroup> getAll();

	ItemGroup get(Integer id);

	ItemGroup get(String name);
	
	List<Item> getItems(int itemGroupId, double saleFrom, double saleTo);

	List<ItemGroupDTO> getItemGroupDetail();

	List<ItemGroupDTORaw> getItemGroupDetailRaw();
}