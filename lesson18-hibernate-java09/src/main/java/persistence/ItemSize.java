package persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kichcomathang")
public class ItemSize {

	@EmbeddedId
	private Id id;

	@Column(name = "SoLuong")
	private Integer quantity;

	public ItemSize() {
	}

	public ItemSize(Id id, Integer quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemSize [id=" + id + ", quantity=" + quantity + "]";
	}


	@Embeddable
	public static class Id {

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "KiHieu")
		private Integer sizeId;

		public Id() {
		}

		public Id(Integer itemId, Integer sizeId) {
			this.itemId = itemId;
			this.sizeId = sizeId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getSizeId() {
			return sizeId;
		}

		public void setSizeId(Integer sizeId) {
			this.sizeId = sizeId;
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}
	}
}
