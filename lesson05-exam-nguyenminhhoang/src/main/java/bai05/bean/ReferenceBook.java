package bai05.bean;

import java.util.Scanner;

public class ReferenceBook {
	private String id;
	private double price;
	private String nhaXuatBan;
	private int VAT;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String nhaXuatBan, int vAT) {
		this.id = id;
		this.price = price;
		this.nhaXuatBan = nhaXuatBan;
		VAT = vAT;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getVAT() {
		return VAT;
	}

	public void setVAT(int vAT) {
		VAT = vAT;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id :");
		this.id = sc.nextLine();
		System.out.println("nhap gia :");
		this.price = Double.parseDouble(sc.nextLine());
		System.out.println("nhap nha xuat ban :");
		this.nhaXuatBan = sc.nextLine();
		System.out.println("nhap thue VAT :");
		this.VAT = Integer.parseInt(sc.nextLine());
	}

	@Override
	public String toString() {
		return "SachThamKhao [id=" + id + ", price=" + price + ", nhaXuatBan=" + nhaXuatBan + ", VAT=" + VAT + "]";
	}

}
