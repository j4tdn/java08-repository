package dao;

import java.util.List;

import entities.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup get(Integer id);
	ItemGroup get(String id);
}
