package bean;

public class Sach {
	private String id;
	private String tenSach;
	private String nhaXuatBan;

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sach(String id, String tenSach, String nhaXuatBan) {
		super();
		this.id = id;
		this.tenSach = tenSach;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	@Override
	public String toString() {
		return tenSach + ", nhaXuatBan :" + nhaXuatBan + " ";
	}

}
