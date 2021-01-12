package service;

import java.util.List;

import entities.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup getById(Integer id);
	ItemGroup getByName(String name);

}
