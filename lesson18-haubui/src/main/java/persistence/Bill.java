package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoadon")
public class Bill {

	@Id
	@Column(name = "MaHD")
	private Integer billId;

	@Column(name = "TenKH")
	private String name;

	@Column(name = "SDTKhachHang")
	private String phone;

	@Column(name = "DiaChiGiaoHang")
	private String address;

	@Column(name = "SoTienCanThanhToan")
	private Double totalOfMoney;

	public Bill() {
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getTotalOfMoney() {
		return totalOfMoney;
	}

	public void setTotalOfMoney(Double totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", totalOfMoney=" + totalOfMoney + "]";
	}

}