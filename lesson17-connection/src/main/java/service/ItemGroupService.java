package service;

import java.util.List;

import entities.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupDtoRaw;

public interface ItemGroupService {
	List<ItemGroup> getAll();

	ItemGroup get(Integer id);

	ItemGroup get(String name);
	
	List<ItemGroupDto> getItemGroupDetail();
	
	List<ItemGroupDtoRaw> getItemGroupDetailRawData();
}
