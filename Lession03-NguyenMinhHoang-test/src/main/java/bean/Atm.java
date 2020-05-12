package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Atm {
	private String id;
	private LocalDate ngayMuon;
	private LocalDate hanTra;
	private Sach[] sachDangMuon;
	private SinhVien sinhVienDangMuon;

	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atm(String id, LocalDate ngayMuon, LocalDate hanTra, Sach[] sachDangMuon, SinhVien sinhVienDangMuon) {
		super();
		this.id = id;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.sachDangMuon = sachDangMuon;
		this.sinhVienDangMuon = sinhVienDangMuon;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getNgayMuon() {
		return ngayMuon;
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

	@Override
	public String toString() {
		return "Atm " + id + ", muon ngay :" + ngayMuon + ", hanTra =" + hanTra + ", sach Dang Muon :"
				+ Arrays.toString(sachDangMuon) + " ";
	}

}
