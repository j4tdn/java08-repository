package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class TheMuon {
	private String id;
	private SinhVien sinhVien;
	private Sach[] sach;
	private Atm atm;

	public TheMuon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TheMuon(String id, SinhVien sinhVien, Sach[] sach, Atm atm) {
		super();
		this.id = id;
		this.sinhVien = sinhVien;
		this.sach = sach;
		this.atm = atm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public Sach[] getSach() {
		return sach;
	}

	public void setSach(Sach[] sach) {
		this.sach = sach;
	}

	public Atm getAtm() {
		return atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	@Override
	public String toString() {
		return "TheMuon " + id + " " + sinhVien + "danh sach sach muon" + Arrays.toString(sach) + "the card " + atm
				+ " ";
	}

}