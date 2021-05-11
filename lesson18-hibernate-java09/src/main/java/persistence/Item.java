package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class Item {

	@Id
	@Column(name = "MaMH")
	private Integer MaMH;

	@Column(name = "TenMH")
	private String TenMH;

	@Column(name = "GiaMua")
	private Double GiaMua;

	@Column(name = "GiaBan")
	private Double GiaBan;

	@Column(name = "MauSac")
	private String MauSac;

	@Column(name = "Size")
	private String size;

	@Column(name = "SoLuong")
	private Double SoLuong;

	@ManyToOne(fetch = FetchType.LAZY) // nameValue: FK_ColumName
	// referencedColumnName: PK_ColumName ParentTable
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;

	@OneToOne(mappedBy = "item")
	private ItemDetail itemDetail;

	public Item() {

	}

	public Item(Integer maMH, String tenMH, Double giaMua, Double giaBan, String mauSac, String size, Double soLuong,
			ItemGroup itemGroup) {

		this.MaMH = maMH;
		this.TenMH = tenMH;
		this.GiaMua = giaMua;
		this.GiaBan = giaBan;
		this.MauSac = mauSac;
		this.size = size;
		this.SoLuong = soLuong;
		this.itemGroup = itemGroup;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public Integer getMaMH() {
		return MaMH;
	}

	public void setMaMH(Integer maMH) {
		MaMH = maMH;
	}

	public String getTenMH() {
		return TenMH;
	}

	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}

	public Double getGiaMua() {
		return GiaMua;
	}

	public void setGiaMua(Double giaMua) {
		GiaMua = giaMua;
	}

	public Double getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(Double giaBan) {
		GiaBan = giaBan;
	}

	public String getMauSac() {
		return MauSac;
	}

	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(Double soLuong) {
		SoLuong = soLuong;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [MaMH=" + MaMH + ", TenMH=" + TenMH + ", GiaMua=" + GiaMua + ", GiaBan=" + GiaBan + ", MauSac="
				+ MauSac + ", size=" + size + ", SoLuong=" + SoLuong + ", itemGroup=" + itemGroup + "]";
	}

}
