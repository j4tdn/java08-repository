package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import entities.Item;

public interface ItemDao {
	List<Item> getItem(int itemGroupId, double saleFrom, double saleTo);
	List<Item> getItems(LocalDate salesDate);
}
