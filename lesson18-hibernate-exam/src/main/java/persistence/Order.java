package persistence;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donhang")
public class Order {

	@Id
	@Column(name = "MaDH")
	private Integer billId;

	@Column(name = "NgayTao")
	private LocalDate createDate;

	@Column(name = "PhiVanChuyen")
	private Double fee;

	@Column(name = "TongTien")
	private Double totalOfMoney;

	public Order() {
	}

}