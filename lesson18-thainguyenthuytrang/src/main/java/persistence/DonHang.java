package persistence;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "donhang")
public class DonHang {

	@Id
	@Column(name = "MaDH")
	private Integer maDH;

	@Column(name = "NgayTao")
	private LocalTime thoiGianDatHang;

	@Column(name = "PhiVanChuyen")
	private Double phiVanChuyen;

	@Column(name = "TongTien")
	private Double tongTien;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "mathang")
	private Set<MatHang> mh = new HashSet<>();
	
	public DonHang() {
		// TODO Auto-generated constructor stub
	}

	public DonHang(Integer maDH, LocalTime thoiGianDatHang, Double phiVanChuyen, Double tongTien) {
		this.maDH = maDH;
		this.thoiGianDatHang = thoiGianDatHang;
		this.phiVanChuyen = phiVanChuyen;
		this.tongTien = tongTien;
	}

	public Integer getMaDH() {
		return maDH;
	}

	public void setMaDH(Integer maDH) {
		this.maDH = maDH;
	}

	public LocalTime getThoiGianDatHang() {
		return thoiGianDatHang;
	}

	public void setThoiGianDatHang(LocalTime thoiGianDatHang) {
		this.thoiGianDatHang = thoiGianDatHang;
	}

	public Double getPhiVanChuyen() {
		return phiVanChuyen;
	}

	public void setPhiVanChuyen(Double phiVanChuyen) {
		this.phiVanChuyen = phiVanChuyen;
	}

	public Double getTongTien() {
		return tongTien;
	}

	public void setTongTien(Double tongTien) {
		this.tongTien = tongTien;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
