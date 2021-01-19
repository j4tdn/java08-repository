package service;

import entities.Item;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ItemService {
    List<Item> getItems(LocalDate salesDate) throws SQLException;
}
