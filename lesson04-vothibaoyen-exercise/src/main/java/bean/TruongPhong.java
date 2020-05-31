package bean;

import java.util.Scanner;

public class TruongPhong extends People{
	private int sonhanvienquanly;

	public TruongPhong() {
		
	}

	public TruongPhong(String ten, int namsinh, double hesoluong,int sonhanvienquanly) {
		super(ten, namsinh, hesoluong);
		this.sonhanvienquanly=sonhanvienquanly;
		
	}

	public int getSonhanvienquanly() {
		return sonhanvienquanly;
	}

	public void setSonhanvienquanly(int sonhanvienquanly) {
		this.sonhanvienquanly = sonhanvienquanly;
	}
	@Override
	public String toString() {
		System.out.format("%-25s%-20s%-20s%-20s \n","Ten truong phong ","Nam sinh","He so luong","So nhan vien qly");
		return String.format("%-25s%-20d%-20s%-20d \n",this.getTen(), this.getNamsinh(),this.getHesoluong(),this.getSonhanvienquanly());
	}
	public TruongPhong nhaptruongphong() {
		TruongPhong t=new TruongPhong();
		Scanner sc=new Scanner(System.in);
		System.out.print("moi nhap ten trong khoa: ");
		t.setTen(sc.nextLine());
		System.out.print("moi nhap nam sinh truong khoa: ");
		t.setNamsinh(Integer.parseInt(sc.nextLine()));
		System.out.print("moi nhap he so luong truong khoa: ");
		t.setHesoluong( Double.parseDouble(sc.nextLine()));
		System.out.print("moi nhap son nhan vien quan ly truong khoa: ");
		t.setSonhanvienquanly(Integer.parseInt(sc.nextLine()));
		return t;
	}
	
	public void inluongtp() {
		double luong=0;
		luong=this.getHesoluong()*2200000;
		System.out.println("Luong cua truong phong: "+luong);
	}

}
