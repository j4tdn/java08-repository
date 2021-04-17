package persistence;

import java.time.LocalTime;

public class MatHangDto {
    public static final String MA_MH = "MaMH";
    public static final String TEN_MH = "TenMH";
    public static final String THOI_GIAN_DAT_HANG = "ThoiGianDatHang";

    private Integer maMH;
    private String tenMH;
    private LocalTime thoiGianDatHang;

    public MatHangDto() {
    }

    public MatHangDto(Integer maMH, String tenMH, LocalTime thoiGianDatHang) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.thoiGianDatHang = thoiGianDatHang;
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

    public LocalTime getThoiGianDatHang() {
        return thoiGianDatHang;
    }

    public void setThoiGianDatHang(LocalTime thoiGianDatHang) {
        this.thoiGianDatHang = thoiGianDatHang;
    }

    @Override
    public String toString() {
        return "MatHangDto{" +
                "MaMH= " + maMH +
                ", TenMH= " + tenMH +
                ", ThoiGianDatHang= " + thoiGianDatHang +
                '}';
    }
}
