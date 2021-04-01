package service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.Item;
import entities.ItemGroup;
import persistence.ItemGroupDTO;
import persistence.ItemGroupDTORaw;
import persistence.ItemGroupDtoHelper;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id can not null");
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name can not null");
		return itemGroupDao.get(name);
	}

	@Override
	public List<ItemGroupDTO> getItemGroupDetail() {
		// TODO: should use another way to get itemList
		// return itemGroupDao.getItemGroupDetail()

		// better way
		List<ItemGroupDTORaw> rawData = itemGroupDao.getItemGroupDetailRaw();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}

		// raw: igId, igName, itemName, itemName, count
		// dto: igId, igName, itemList<itemName, count>, total
		Map<Pair<Integer, String>, List<ItemGroupDTORaw>> rawDataIgId = rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));

		return rawDataIgId.entrySet() // Set<Entry<Pair, List<ItemGroupDtoRaw>>
				.stream() // Stream<Entry<Pair, List<ItemGroupDtoRaw>>
				.map(entry -> ItemGroupDtoHelper.convert(entry)) // Stream<>
				.collect(Collectors.toList());
	}

	@Override
	public List<ItemGroupDTORaw> getItemGroupDetailRaw() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemGroupDetailRaw();
	}

	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		// return itemGroupDao.getI
		return null;
	}

}