package persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="donhang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DonHang {

    @Id
    @Column(name="MaDH")
    private Integer maDh ;


    @Column(name="NgayTao")
    private LocalTime dateTime ;

    @Column(name="PhiVanChuyen")
    private Double phiVanChuyen ;


    @Column(name = "TongTien")
    private Double tongTien ;


    @Column(name="MaKH")
    private Integer maKH ;

    @Column(name="MaLHTT")
    private Integer maLHTT ;

}
