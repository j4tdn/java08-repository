package view;

import java.util.List;

import persistance.MatHangDTO;
import service.MatHangService;

public class Demo {
	public static void main(String[] args) {
		MatHangService matHangService = new MatHangService();
		
		List<MatHangDTO> mathangs =  matHangService.getMatHang();
		for (MatHangDTO matHangDTO : mathangs) {
			System.out.println(matHangDTO);
		}
	}

}
