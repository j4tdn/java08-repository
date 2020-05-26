package bai05.bean;

import java.util.Scanner;

public class Customer {
	private String id;
	private String fullname;
	private int phone;
	private String address;

	public Customer() {
	}

	public Customer(String id, String fullname, int phone, String address) {
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id :");
		this.id = sc.nextLine();
		System.out.println("nhap ho ten :");
		this.fullname = sc.nextLine();
		System.out.println("nhap so dien thoai :");
		this.phone = Integer.parseInt(sc.nextLine());
		System.out.println("nhap so dia chi :");
		this.address = sc.nextLine();
	}

	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", fullname=" + fullname + ", phone=" + phone + ", address=" + address + "]";
	}

}