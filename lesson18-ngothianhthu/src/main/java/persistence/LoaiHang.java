package persistence;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class LoaiHang {
	
	@Id
	@Column(name = "MaDH")
	private Integer maDH;
	
	@Id
	@Column(name = "NgayTao")
	private LocalTime ngayTao;
	
	@Id
	@Column(name = "PhiVanChuyen")
	private Double phiVanChuyen;
	
	@Id
	@Column(name = "TongTien")
	private Integer tongTien;
	
	@Id
	@Column(name = "MaKH")
	private Integer maKH;
	
	@Id
	@Column(name = "MaLHTT")
	private Integer maLHTT;
	
	public LoaiHang() {
	}

	public LoaiHang(Integer maDH, LocalTime ngayTao, Double phiVanChuyen, Integer tongTien, Integer maKH,
			Integer maLHTT) {
		super();
		this.maDH = maDH;
		this.ngayTao = ngayTao;
		this.phiVanChuyen = phiVanChuyen;
		this.tongTien = tongTien;
		this.maKH = maKH;
		this.maLHTT = maLHTT;
	}

	public Integer getMaDH() {
		return maDH;
	}

	public void setMaDH(Integer maDH) {
		this.maDH = maDH;
	}

	public LocalTime getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalTime ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Double getPhiVanChuyen() {
		return phiVanChuyen;
	}

	public void setPhiVanChuyen(Double phiVanChuyen) {
		this.phiVanChuyen = phiVanChuyen;
	}

	public Integer getTongTien() {
		return tongTien;
	}

	public void setTongTien(Integer tongTien) {
		this.tongTien = tongTien;
	}

	public Integer getMaKH() {
		return maKH;
	}

	public void setMaKH(Integer maKH) {
		this.maKH = maKH;
	}

	public Integer getMaLHTT() {
		return maLHTT;
	}

	public void setMaLHTT(Integer maLHTT) {
		this.maLHTT = maLHTT;
	}

	
	
	
	
	

}
