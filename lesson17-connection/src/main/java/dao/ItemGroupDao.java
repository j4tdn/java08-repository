package dao;

import java.util.List;

import entities.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup getById(Integer id);
	ItemGroup getByName(String name);

}
