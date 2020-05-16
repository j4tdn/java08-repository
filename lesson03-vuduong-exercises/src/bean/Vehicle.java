package bean;

import java.util.Scanner;

public class Vehicle {
	private String chuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thue;
	
	public Vehicle() {
	}

	public Vehicle(String chuXe, String loaiXe, int dungTich, double triGia, double thue) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		if(this.dungTich < 100) this.thue = this.triGia + this.triGia/100;
		if(this.dungTich < 200 && this.dungTich >= 100) this.thue = this.triGia + this.triGia/100*3;
		if(this.dungTich > 200) this.thue = this.triGia + this.triGia/100*5;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return "Vehicle [chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", triGia=" + triGia
				+ ", thue=" + thue + "]";
	}
	
}
