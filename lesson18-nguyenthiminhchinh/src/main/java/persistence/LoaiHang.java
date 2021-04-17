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
@Table(name = "loaihang")
public class LoaiHang {

	@Id
	@Column(name = "MaLoai")
	private Integer maLoai;

	@Column(name = "TenLoai")
	private String tenLoai;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "mathang")
	private Set<DonHang> mh = new HashSet<>();
	
	
	public LoaiHang() {
	}

	public LoaiHang(Integer maLoai, String tenLoai) {
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	@Override
	public String toString() {
		return "Ma Loai: " + getMaLoai() + " Ten loai: " + getTenLoai();
	}

}
