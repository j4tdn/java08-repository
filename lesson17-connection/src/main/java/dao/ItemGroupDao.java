package dao;

import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDTO;
import persistence.ItemGroupDTORaw;

public interface ItemGroupDao {
	List<ItemGroup> getAll();

	ItemGroup get(Integer id);

	ItemGroup get(String name);
	
	//ItemGroup getItems();

	List<ItemGroupDTO> getItemGroupDetail();

	List<ItemGroupDTORaw> getItemGroupDetailRaw();
}