package allocation;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class StoreDTO {

	private Long storeId;
	private BigDecimal expectedSales;
	private BigDecimal distance;

	public StoreDTO() {
	}

	public StoreDTO(Long storeId, BigDecimal expectedSales, BigDecimal distance) {
		this.storeId = storeId;
		this.expectedSales = expectedSales;
		this.distance = distance;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(final Long storeId) {
		this.storeId = storeId;
	}


	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(final BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}
}
