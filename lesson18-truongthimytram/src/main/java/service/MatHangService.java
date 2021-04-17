package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.MatHangDao;
import dto.MatHangEx1Dto;
import dto.MatHangEx2Dto;

public class MatHangService {
	private static MatHangDao matHangDao;
	static {
		matHangDao = new MatHangDao();
	}
	
	public List<MatHangEx1Dto> getMatHangByDate(LocalDate date) {
		return matHangDao.getMatHangByDate(date);
	}
	
	public List<MatHangEx2Dto> getMatHangTonKho() {
		List<MatHangEx2Dto> matHangEx2Dtos = matHangDao.getMatHangTonKho();
		List<MatHangEx2Dto> result = new ArrayList<MatHangEx2Dto>();
		Map<Integer, List<MatHangEx2Dto>> data = matHangEx2Dtos.stream().collect(Collectors.groupingBy(MatHangEx2Dto::getMaMH));
		for (Entry<Integer, List<MatHangEx2Dto>> entry : data.entrySet()) {
			MatHangEx2Dto mathang = new MatHangEx2Dto();
//			List<SimpleEntry<String, Integer>> dataMatHang = entry.getValue().stream()
//					.map(rawItem -> new SimpleEntry<String, Integer>(rawItem.getTenMH(), rawItem.getSoLuong()))
//					.collect(Collectors.toList());
			Map<String, Integer> dataMatHang = entry.getValue().stream().map(rawItem -> new MatHangEx2Dto(rawItem.getTenMH(), rawItem.getSoLuong()));
			Integer soLuong = entry.getValue().stream().mapToInt(MatHangEx2Dto::getSoLuong).sum();
			result.add(new MatHangEx2Dto(entry.getKey(), dataMatHang.getKey(), soLuong));
			
		}
		return result;
	}
	

}
