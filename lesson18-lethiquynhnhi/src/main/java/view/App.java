package view;

import persistence.LoaiHangDto;
import persistence.MatHang;
import persistence.MatHangDto;
import service.LoaiHangService;
import service.MatHangService;

import java.time.LocalDate;
import java.util.List;

public class App {
    private static MatHangService matHangService;
    private static LoaiHangService loaiHangService;

    static {
        matHangService = new MatHangService();
        loaiHangService = new LoaiHangService();
    }

    public static void main(String[] args) {
        System.out.println("======================Cau 1=========================");
        LocalDate date = LocalDate.of(2020, 12, 18);
        List<MatHangDto> matHangDtos = matHangService.getMatHangsByDate(date);
        matHangDtos.forEach(System.out::println);
        System.out.println("=========================Cau 2===========================");
        List<LoaiHangDto> loaiHangDtos = loaiHangService.getRemainSumOfLoaiHangs();
        loaiHangDtos.forEach(System.out::println);
        System.out.println("==========================Cau 3==============================");
        List<String> topThreeSaler = matHangService.get3TopSalerInYear(2020);
        topThreeSaler.forEach(System.out::println);
        System.out.println("===========================Cau 4===================================");
        List<MatHang> matHangs = matHangService.getAllMatHangLoaiHang();
        matHangs.forEach(System.out::println);
    }
}
