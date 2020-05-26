package bai05.bean;

import java.util.Scanner;

public class Textbook {
	private String id;
	private double price;
	private String company;
	private String status;

	public Textbook() {
	}

	public Textbook(String id, double price, String company, String status) {
		this.id = id;
		this.price = price;
		this.company = company;
		this.status = status;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id :");
		this.id = sc.nextLine();
		System.out.println("nhap gia :");
		this.price = Double.parseDouble(sc.nextLine());
		System.out.println("nhap nha xuat ban :");
		this.company = sc.nextLine();
		System.out.println("nhap tinh trang :");
		this.status = sc.nextLine();
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [id=" + id + ", price=" + price + ", nhaXuatBan=" + company + ", status=" + status + "]";
	}

}
