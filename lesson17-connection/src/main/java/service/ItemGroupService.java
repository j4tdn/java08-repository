package service;

import java.util.List;

import entities.ItemGroup;
import persstence.ItemGroupDto;
import persstence.ItemGroupDtoRaw;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	ItemGroup get(Integer id);
	ItemGroup get(String name);
	List<ItemGroupDto> getItemGroupDetail();
	List<ItemGroupDtoRaw> getItemGroupDetailRaw();
}
