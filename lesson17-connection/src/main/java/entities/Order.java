package entities;

import java.time.LocalDate;

public class Order {
	private Integer orderId;
	private LocalDate createDate;
	private Double tranformFee;
	private Double sumOfMoney;
	private Integer customerID;
	private Integer lhttId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Double getTranformFee() {
		return tranformFee;
	}

	public void setTranformFee(Double tranformFee) {
		this.tranformFee = tranformFee;
	}

	public Double getSumOfMoney() {
		return sumOfMoney;
	}

	public void setSumOfMoney(Double sumOfMoney) {
		this.sumOfMoney = sumOfMoney;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public Integer getLhttId() {
		return lhttId;
	}

	public void setLhttId(Integer lhttId) {
		this.lhttId = lhttId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", createDate=" + createDate + ", tranformFee=" + tranformFee
				+ ", sumOfMoney=" + sumOfMoney + ", customerID=" + customerID + ", lhttId=" + lhttId + "]";
	}

}
