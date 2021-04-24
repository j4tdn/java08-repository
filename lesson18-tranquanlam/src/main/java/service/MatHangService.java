package service;

import java.time.LocalDate;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.MatHangDao;
import persistence.MatHangDTO;
import persistence.MatHangDTORawData;


public class MatHangService {
	MatHangDao matHangDao= new MatHangDao();

	public List<MatHangDTO> getProBudget(LocalDate date) {
		List<MatHangDTORawData> rawDatas = matHangDao.getMatHangInDate(date);
		List<MatHangDTO> listDTO = new ArrayList<MatHangDTO>();

		for (MatHangDTORawData matHangRawDTO : rawDatas) {
			MatHangDTO dto = new MatHangDTO();
			dto.setMaMH(matHangRawDTO.getMaMH());
			dto.setTenMH(matHangRawDTO.getTenMH());
			dto.setThoiGianDatHanh(matHangRawDTO.getNgayTao().toLocalTime());
			listDTO.add(dto);
		}
		
		return listDTO;
	}
	
	public List<MatHangDTO> getTop3() {
		List<MatHangDTORawData> rawDatas = matHangDao.getTop3Sale();
		List<MatHangDTO> listDTO = new ArrayList<MatHangDTO>();

		for (MatHangDTORawData matHangRawDTO : rawDatas) {
			MatHangDTO dto = new MatHangDTO();
			dto.setMaMH(matHangRawDTO.getMaMH());
			dto.setTenMH(matHangRawDTO.getTenMH());
			dto.setSoLuong(matHangRawDTO.getSoLuong());
			listDTO.add(dto);
		}
		
		return listDTO;
	}
}
