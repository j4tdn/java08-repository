package bai5;

public class ReferenceBook extends Book{
	
	
	private Double thue;
	

	public ReferenceBook(String maSach, Double donGia, String nhaXuatBan, Double thue) {
		super(maSach, donGia, nhaXuatBan);
		this.thue = thue;
	}


	public Double getThue() {
		return thue;
	}


	public void setThue(Double thue) {
		this.thue = thue;
	}

	
	
	
	
	
	
}
