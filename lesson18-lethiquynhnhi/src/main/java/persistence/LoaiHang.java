package persistence;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "loaihang")
public class LoaiHang {

    @Id
    @Column(name = "MaLoai")
    private Integer maLoai;

    @Column(name = "TenLoai")
    private String tenLoai;

    @OneToMany(mappedBy = "loaiHang")
    private Set<MatHang> matHang;

    public LoaiHang() {
    }

    public LoaiHang(Integer maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public Integer getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiHang{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }
}
