package Bean;

import java.util.Scanner;

public class People {
	private String ten;
	private int namsinh;
	private int hesoluong;
	private double luong;

	public People() {
	}

	public People(String ten, int namsinh, int hesoluong) {
		super();
		this.ten = ten;
		this.namsinh = namsinh;
		this.hesoluong = hesoluong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public int getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

	public double getLuong(People p) {

		switch (p.getClass().getName()) {
		case "Bean.TruongPhong":
			
			luong = p.getHesoluong() * 2200000;
			break;
		case "Bean.NhanVien":
			
			luong = p.getHesoluong() * 1250000;
			break;
		case "Bean.GiamDoc":
			
			luong = (p.getHesoluong() + ((GiamDoc) p).getHesochucvu()) * 3000000;
			break;

		}
		return luong;
	}

	public double setLuong(double luong) {
		return this.luong = luong;
	}

	public void Nhap(People people) {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap ten:");
		people.setTen(sc.next());
		System.out.println("nhap nam sinh:");
		people.setNamsinh(sc.nextInt());
		System.out.println("nhap he so luong:");
		people.setHesoluong(sc.nextInt());

	}

	@Override
	public String toString() {
		return "ten:" + ten + "\tnam sinh:" + namsinh + "\the so luong:" + hesoluong + "\t luong:" + getLuong(this);
	}

}
