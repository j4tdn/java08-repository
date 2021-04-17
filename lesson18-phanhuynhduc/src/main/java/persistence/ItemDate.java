package persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDate {

    private Integer maMH ;

    private String tenMH ;

    private LocalTime thoiGianDatHang ;

}
