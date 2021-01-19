package entities;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Order {
	private Integer id;
	private LocalDate saleDate;
	private Double deliveryFee;
	private Double totalPrice;
	
	public Order() {}

	public Order(Integer id, LocalDate saleDate, Double deliveryFee, Double totalPrice) {
		super();
		this.id = id;
		this.saleDate = saleDate;
		this.deliveryFee = deliveryFee;
		this.totalPrice = totalPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public Double getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(Double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Order)) {
			return false;
		}
		
		Order that = (Order) o;
		
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getSaleDate(), that.getSaleDate())
				.append(getDeliveryFee(), that.getDeliveryFee())
				.append(getTotalPrice(), that.getTotalPrice())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getSaleDate())
				.append(getDeliveryFee())
				.append(getTotalPrice())
				.toHashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append(getId())
				.append(getSaleDate())
				.append(getDeliveryFee())
				.append(getTotalPrice())
				.toString();
	}
}
