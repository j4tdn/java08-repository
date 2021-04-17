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
@Table(name="loaihang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoaiHang {


    @Id
    @Column(name="MaLoai")
    private Integer maLoai ;

    @Column(name="TenLoai")
    private String tenLoai ;


    @Override
    public String toString() {
        return "LoaiHang{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }
}
