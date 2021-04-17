package service;

import dao.MatHangDao;
import persistence.MatHang;
import persistence.MatHangDto;

import java.time.LocalDate;
import java.util.List;

public class MatHangService {
    private MatHangDao matHangDao;

    public MatHangService() {
        matHangDao = new MatHangDao();
    }

    public List<MatHangDto> getMatHangsByDate(LocalDate date){
        return matHangDao.getMatHangsByDate(date);
    }

    public List<String> get3TopSalerInYear(int year){
        return matHangDao.get3TopSalerInYear(year);
    }

    public List<MatHang> getAllMatHangLoaiHang(){
        return matHangDao.getAllMatHangLoaiHang();
    }
}
