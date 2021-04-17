package persistence;

import javax.persistence.*;

@Entity
@Table(name="mathang")
public class MatHang {
    @Id
    @Column(name="MaMH")
    private Integer maMH;

    @Column(name = "TenMH")
    private String tenMH;

    @Column(name = "Size")
    private String size;

    @Column(name = "GiaBan")
    private Double giaBan;

    @Column(name = "GiaMua")
    private Double giaMua;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "MauSac")
    private String mauSac;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MaLoai")
    private LoaiHang loaiHang;

    public MatHang() {
    }

    public MatHang(Integer maMH, String tenMH, String size, Double giaBan, Double giaMua, Integer soLuong, String mauSac, LoaiHang loaiHang) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.size = size;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.loaiHang = loaiHang;
    }

    public Integer getMaMH() {
        return maMH;
    }

    public void setMaMH(Integer maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Double giaMua) {
        this.giaMua = giaMua;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public LoaiHang getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(LoaiHang loaiHang) {
        this.loaiHang = loaiHang;
    }

    @Override
    public String toString() {
        return "MaLoai = " + loaiHang.getMaLoai() +
                ", TenLoai = " + loaiHang.getTenLoai() +
                ", MaMH = " + maMH +
                ", TenMH = " + tenMH +
                ", GiaBan = " + giaBan +
                ", GiaMua = " + giaMua +
                ", SoLuong = " + soLuong;
    }
}
