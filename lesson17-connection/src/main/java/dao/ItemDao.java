package dao;

import java.time.LocalDate;
import java.util.List;

import entities.Item;

public interface ItemDao {

	List<Item> getItems(LocalDate date);

}
