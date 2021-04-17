package persistence;

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
@Table(name = "mathang")
public class MatHang {

	@Id
	@Column(name = "MaMH")
	private Integer maMH;

	@Column(name = "TenMH")
	private String tenMH;

	@Column(name = "Size")
	private String size;

	@Column(name = "GiaMua")
	private Double giaMua;

	@Column(name = "GiaBan")
	private Double giaBan;

	@Column(name = "SoLuong")
	private Integer soLuong;

	@Column(name = "MauSac")
	private String mauSac;

	@Column(name = "MaLoai")
	private Integer maLoai;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "donhang")
	private Set<DonHang> dh = new HashSet<>();
	
	public MatHang() {
		// TODO Auto-generated constructor stub
	}

	public MatHang(Integer maMH, String tenMH, String size, Double giaMua, Double giaBan, Integer soLuong,
			String mauSac, Integer maLoai) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.size = size;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
		this.mauSac = mauSac;
		this.maLoai = maLoai;
	}

	public Integer getMaMH() {
		return maMH;
	}

	public void setMaMH(Integer maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(Double giaMua) {
		this.giaMua = giaMua;
	}

	public Double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(Double giaBan) {
		this.giaBan = giaBan;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	@Override
	public String toString() {
		return "mat hang: " + getTenMH() + "Ma Loai: " + getMaLoai();
	}

}
