package dao;

import java.util.List;

import entities.Item;

public interface ItemDao {
	List<Item> getItems(int itemGroupId, double saleFrom, double saleTo);

}
