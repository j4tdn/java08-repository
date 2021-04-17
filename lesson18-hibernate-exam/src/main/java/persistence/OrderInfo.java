package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chitietdonhang")
public class OrderInfo {

	@EmbeddedId
	private Id id;

	@ManyToOne
	@JoinColumn(name = "MaDH", insertable = false, updatable = false)
	private Order order;

	@ManyToOne
	@JoinColumn(name = "MaMH", insertable = false, updatable = false)
	private Item item;

	@Column(name="SoLuong")
	private Integer qty;

	@Embeddable
	public class Id implements Serializable {

		private static final long serialVersionUID = 3521506227821892944L;

		@Column(name = "MaDH")
		private Integer orderId;

		@Column(name = "MaMH")
		private Integer itemId;

		public Id() {
		}
	}

}
