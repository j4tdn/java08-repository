package persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mathang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatHang {

    @Id
    @Column(name="MaMH")
    private Integer id ;

    @Column(name="TenMH")
    private String tenMH ;


    @Column(name="Size")
    private String size ;

    @Column(name="GiaMua")
    private Double giaMua ;

    @Column(name="GiaBan")
    private Double giaBan ;

    @Column(name="SoLuong")
    private Integer soLuong ;

    @Column(name="MauSac")
    private String mauSac ;

    @Column(name="MaLoai")
    private Integer maLoai  ;


    @Override
    public String toString() {
        return "MatHang{" +
                "id=" + id +
                ", tenMH='" + tenMH + '\'' +
                ", size='" + size + '\'' +
                ", giaMua=" + giaMua +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", mauSac='" + mauSac + '\'' +
                ", maLoai=" + maLoai +
                '}';
    }
}
