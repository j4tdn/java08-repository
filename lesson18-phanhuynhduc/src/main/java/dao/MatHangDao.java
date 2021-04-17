package dao;

import persistence.InventoryCategory;
import persistence.ItemOfCategory;
import persistence.MatHang;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface MatHangDao {
    List<MatHang> getMatHangBanNhieuNhat(int year);

    List<MatHang> getMatHangInDate(LocalDate localDate);


    List<InventoryCategory> getInventoryCategory();

    List<ItemOfCategory> getItemOfCategory();


    List<MatHang> getItemArccodingToTheDate(LocalDateTime localDateTime);
}