package view;

import java.time.LocalDate;
import java.util.List;

import persistence.LoaiHangDTO;
import persistence.MatHangDTO;
import service.LoaiHangService;
import service.MatHangService;

public class view {
	public static void main(String[] args) {
		MatHangService hangService = new MatHangService();
		LoaiHangService hangService2 = new LoaiHangService();
		List<MatHangDTO> dtos = hangService.getProBudget(LocalDate.of(2020, 12, 18));
		List<LoaiHangDTO> dtoLoai = hangService2.getLoaiHang();
		System.out.println(dtos.size());
		for (MatHangDTO matHangDTO : dtos) {
			System.out.println(matHangDTO);
		}
		for (LoaiHangDTO loaiHangDTO : dtoLoai) {
			System.out.println(loaiHangDTO);
		}
	}
}
