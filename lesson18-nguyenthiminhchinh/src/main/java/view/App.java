package view;

import java.time.LocalDate;
import java.util.List;

import dao.MatHangDao;
import persistence.MatHang;

public class App {
	public static void main(String[] args) {
		MatHangDao mhdao = new MatHangDao();
		System.out.println("=1=");
		List<MatHang> result1 = mhdao.getMHang(LocalDate.of(2019, 11, 23));
		for (MatHang e1 : result1) {
			System.out.println(e1);
		}
		
		System.out.println("=2=");
		List<MatHang> result2 = mhdao.getSLuong();
		for (MatHang e2 : result2) {
			System.out.println(e2);
		}
		
		System.out.println("=4=");
		List<MatHang> result4 = mhdao.getDsach();
		for (MatHang e4 : result4) {
			System.out.println(e4);
		}
	}
}