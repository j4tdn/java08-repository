package persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryCategory {

    public static final String MALOAI = "MaLoai";
    public static final String TENLOAI = "TenLoai";
    public static final String SOLUONG = "SoLuong";



    private Integer maLoai ;

    private String tenLoai ;

    private Integer soLuong ;

    @Override
    public String toString() {
        return "InventoryCategory{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
