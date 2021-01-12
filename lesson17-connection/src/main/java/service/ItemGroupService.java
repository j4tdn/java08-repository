package service;

import java.util.List;

import entities.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	ItemGroup get(Integer id);
	ItemGroup get(String name);
	
}