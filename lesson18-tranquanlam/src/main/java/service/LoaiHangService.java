package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.LoaiHangDao;
import persistence.LoaiHangDTO;
import persistence.LoaiHangRawDTO;

public class LoaiHangService {
	LoaiHangDao dao = new LoaiHangDao();
	
	public List<LoaiHangDTO> getLoaiHang() {
		List<LoaiHangRawDTO> rawDatas = dao.getLoaiHang();
		List<LoaiHangDTO> listDTO = new ArrayList<LoaiHangDTO>();
		Map<Integer, List<LoaiHangRawDTO>> dataMap = rawDatas.stream().
				collect(Collectors.groupingBy(LoaiHangRawDTO::getMaLoai));
		
		for(Entry<Integer, List<LoaiHangRawDTO>> entry : dataMap.entrySet()) {
			LoaiHangDTO dto = new LoaiHangDTO();
			dto.setMaLoai(entry.getKey());
			dto.setTenLoai(entry.getValue().get(0).getTenLoai());
			dto.setSoLuong(entry.getValue().stream()
					.mapToInt(LoaiHangRawDTO::getSoLuong).sum());
			listDTO.add(dto);
		}
		

		
		return listDTO;
	}
}
