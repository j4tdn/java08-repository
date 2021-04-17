package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class Customer {

	@Id
	@Column(name = "MaKH")
	private Integer customerId;

	@Column(name = "TenKH")
	private String name;

	@Column(name = "SoDienThoai")
	private String phone;

	@Column(name = "Email")
	private String email;

	@Column(name = "DiaChi")
	private String address;

	@Column(name = "MangXaHoi")
	private String social;

	public Customer() {
	}

	public Customer(Integer customerId, String name, String phone, String email, String address, String social) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.social = social;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", address=" + address + ", social=" + social + "]";
	}

}