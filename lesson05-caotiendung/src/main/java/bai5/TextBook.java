package bai5;

import javax.swing.text.StyledEditorKit.BoldAction;

public class TextBook  extends Book{
	
	private Status tinhTrang;

	public TextBook(Status tinhTrang) {
		super();
		this.tinhTrang = tinhTrang;
	}
	

	public TextBook(String maSach, Double donGia, String nhaXuatBan, Status tinhTrang) {
		super(maSach, donGia, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}


	public Status getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(Status tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}