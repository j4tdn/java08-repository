package dao;

import entities.Item;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ItemDao {
    List<Item> getItems(int itemGroupId,double saleFrom,double saleTo);
    List<Item> getItems(LocalDate salesDate);
}
