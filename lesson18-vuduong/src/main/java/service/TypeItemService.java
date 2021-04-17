package service;

import java.util.ArrayList;
import java.util.List;

import dao.TypeItemDao;
import dto.TypeItemWithNumberItemDto;
import persistence.Item;
import persistence.TypeItem;

public class TypeItemService {
	private TypeItemDao typeItemDao;

	public TypeItemService() {
		typeItemDao = new TypeItemDao();
	}

	public List<TypeItemWithNumberItemDto> getAllWithNumberItems() {
		var typeItems = typeItemDao.getAll();

		List<TypeItemWithNumberItemDto> result = new ArrayList<TypeItemWithNumberItemDto>();

		for (TypeItem typeItem : typeItems) {
			var numberItems = typeItem.getItems().stream().mapToInt(Item::getQuantity).sum();
			result.add(new TypeItemWithNumberItemDto(typeItem.getId(), typeItem.getName(), numberItems));
		}
		
		return result;	

	}
}
