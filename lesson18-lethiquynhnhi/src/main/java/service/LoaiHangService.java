package service;

import dao.LoaiHangDao;
import persistence.LoaiHangDto;

import java.util.List;

public class LoaiHangService {
    private LoaiHangDao loaiHangDao;

    public LoaiHangService() {
        loaiHangDao = new LoaiHangDao();
    }

    public List<LoaiHangDto> getRemainSumOfLoaiHangs(){
        return loaiHangDao.getRemainSumOfLoaiHangs();
    }
}
