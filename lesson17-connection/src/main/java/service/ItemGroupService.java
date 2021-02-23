package service;

import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	ItemGroup get(Integer id);
	ItemGroup get(String name);
	List<ItemGroupDto> getItemGroupDetail();
}