package service;

import java.util.List;

import dao.HibernateMatHangDTODao;
import persistance.MatHangDTO;

public class MatHangService {
	private HibernateMatHangDTODao item;
	public MatHangService() {
		item = new HibernateMatHangDTODao();
	}
	
	public List<MatHangDTO> getMatHang(){
		List<MatHangDTO> mathangs = item.getValues();
		return mathangs;
	}

}
