package view;

import java.time.LocalDate;
import java.util.List;

import dao.MatHangDao;
import persistence.MatHang;

public class App {
	public static void main(String[] args) {
		MatHangDao mhdao = new MatHangDao();
		List<MatHang> result1 = mhdao.getMHang(LocalDate.of(2013, 11, 23));
		for (MatHang e1 : result1) {
			System.out.println(e1);
		}
	}
}