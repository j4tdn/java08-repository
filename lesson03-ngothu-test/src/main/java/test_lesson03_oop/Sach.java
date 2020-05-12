package test_lesson03_oop;

public  class Sach {
	public String so_hieu_sach;
	public String ten_sach;
	public String nha_xuat_ban;
	
	public Sach() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Sach(String so_hieu_sach, String ten_sach, String nha_xuat_ban) {
		super();
		this.so_hieu_sach = so_hieu_sach;
		this.ten_sach = ten_sach;
		this.nha_xuat_ban = nha_xuat_ban;
	}


	public String getSo_hieu_sach() {
		return so_hieu_sach;
	}
	public void setSo_hieu_sach(String so_hieu_sach) {
		this.so_hieu_sach = so_hieu_sach;
	}
	public String getTen_sach() {
		return ten_sach;
	}
	public void setTen_sach(String ten_sach) {
		this.ten_sach = ten_sach;
	}
	public String getNha_xuat_ban() {
		return nha_xuat_ban;
	}
	public void setNha_xuat_ban(String nha_xuat_ban) {
		this.nha_xuat_ban = nha_xuat_ban;
	}
	

}
