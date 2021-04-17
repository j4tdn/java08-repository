package persistence;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "donhang")
public class DonHang {
	@Id
	@Column(name = "MaDH")
	private String maDH;
	
	@Column(name = "NgayTao")
	private LocalTime ngayTao;
	
	@Column(name = "PhiVanChuyen")
	private Double phiVanChuyen;
	
	@Column(name = "TongTien")
	private Double tongTien;
	
	
}
