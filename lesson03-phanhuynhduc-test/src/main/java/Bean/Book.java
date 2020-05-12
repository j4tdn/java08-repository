package Bean;

public class Book {
	private String soHieuSach ;
	private String tenSach ;
	private String nxb ;
	public Book(String sohieusach, String tensach, String nxb) {
			this.soHieuSach = sohieusach ;
			this.tenSach = tensach ;
			this.nxb = nxb;
	}
	public String getSoHieuSach() {
		return this.soHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	public String getTenSach() {
		return this.tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getNxb() {
		return this.nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	
	
}
