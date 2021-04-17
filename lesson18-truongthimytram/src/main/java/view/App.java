package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import dto.MatHangEx1Dto;
import service.MatHangService;
import utils.HibernateUtil;

public class App {
	
	private static MatHangService matHangService;
	static {
		matHangService = new MatHangService();
	}

	public static void main(String[] args) {	
		System.out.println("conn: " + HibernateUtil.getSessionFactory());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDate date = LocalDate.parse("2020-12-18 16:33:20", dtf);
		List<MatHangEx1Dto> listMatHang = matHangService.getMatHangByDate(date);
		listMatHang.forEach(System.out::println);

	}

}
