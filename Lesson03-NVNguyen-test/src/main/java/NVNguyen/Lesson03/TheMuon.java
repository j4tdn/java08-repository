package NVNguyen.Lesson03;

import java.time.LocalDate;
import java.util.Arrays;

public class TheMuon {
	private String maThe;
	private LocalDate ngayMuon;
	private LocalDate hanTra;
	private Sach[] sachDangMuon;
	private SinhVien sinhVienDangMuon;
	
	public TheMuon() {
		// TODO Auto-generated constructor stub
	}

	public TheMuon(String maThe, LocalDate ngayMuon, LocalDate hanTra, Sach[] sachDangMuon, SinhVien sinhVienDangMuon) {
		super();
		this.maThe = maThe;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.sachDangMuon = sachDangMuon;
		this.sinhVienDangMuon = sinhVienDangMuon;
	}

	public String getMaThe() {
		return maThe;
	}

	public void setMaThe(String maThe) {
		this.maThe = maThe;
	}

	public LocalDate getNgayMuon() {
		return ngayMuon;
	}

	@Override
	public String toString() {
		return "TheMuon [maThe=" + maThe + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", sachDangMuon="
				+ Arrays.toString(sachDangMuon) + ", sinhVienDangMuon=" + sinhVienDangMuon + "]";
	}

	public void setNgayMuon(LocalDate ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public LocalDate getHanTra() {
		return hanTra;
	}

	public void setHanTra(LocalDate hanTra) {
		this.hanTra = hanTra;
	}

	public Sach[] getSachDangMuon() {
		return sachDangMuon;
	}

	public void setSachDangMuon(Sach[] sachDangMuon) {
		this.sachDangMuon = sachDangMuon;
	}

	public SinhVien getSinhVienDangMuon() {
		return sinhVienDangMuon;
	}

	public void setSinhVienDangMuon(SinhVien sinhVienDangMuon) {
		this.sinhVienDangMuon = sinhVienDangMuon;
	}
	
	

}
