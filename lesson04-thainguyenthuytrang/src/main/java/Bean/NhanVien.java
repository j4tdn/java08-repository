package Bean;

import java.util.Scanner;

public class NhanVien extends People {
	private String tendonvi;

	public NhanVien() {
	}

	public NhanVien(String ten, int namsinh, int hesoluong, String tendonvi) {
		super(ten, namsinh, hesoluong);
		this.tendonvi = tendonvi;
	}

	public String getTendonvi() {
		return tendonvi;
	}

	public void setTendonvi(String tendonvi) {
		this.tendonvi = tendonvi;
	}

	@Override
	public void Nhap(People people) {
		super.Nhap(people);
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten don vi");
		((NhanVien) people).setTendonvi(sc.next());
	}

	@Override
	public String toString() {
		return super.toString() + "\tten don vi:" + tendonvi;
	}

}
