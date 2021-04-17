package persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatHangDtoRawData {

    private Integer maLoai ;

    private  String tenLoai ;

    private Integer maMH ;

    private String tenMH ;

    private Double giaBan  ;

    private Double giaMua ;

    private Integer soLuong ;


}
