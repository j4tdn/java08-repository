package persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemOfCategory {


    public static final String MALOAI = "MaLoai" ;

    public static final String TENLOAI = "TenLoai" ;

    public static final String MAMH = "MaMH";

    public static final String TENMH = "TenMH";

    public static final String GIABAN = "GiaBan";

    public static final String GIAMUA = "GiaMua";

    public static final String SOLUONG = "SoLuong";



    private Integer maLoai ;

    private String tenLoai  ;

    private Integer maMH ;

    private String tenMH ;

    private Double giaBan ;

    private Double giaMua ;

    private Integer soLuong ;

    @Override
    public String toString() {
        return "ItemOfCategory{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                ", maMH=" + maMH +
                ", tenMH='" + tenMH + '\'' +
                ", giaBan=" + giaBan +
                ", giaMua=" + giaMua +
                ", soLuong=" + soLuong +
                '}';
    }
}
