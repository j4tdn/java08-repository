package dao;

import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupDtoRaw;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup getById(Integer id);
	ItemGroup getByName(String name);
	List<ItemGroupDto> getListItemGroupDetail();
	List<ItemGroupDtoRaw> getListItemGroupDetailRaw();

}
