package persistence;

public class LoaiHangDto {

    public static final String MA_LOAI = "MaLoai";
    public static final String TEN_LOAI = "TenLoai";
    public static final String SO_LUONG = "SoLuong";

    private Integer maLoai;
    private String tenLoai;
    private Integer soLuong;

    public LoaiHangDto() {
    }

    public LoaiHangDto(Integer maLoai, String tenLoai, Integer soLuong) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.soLuong = soLuong;
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

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "LoaiHangDto{" +
                "MaLoai= " + maLoai +
                ", TenLoai= " + tenLoai +
                ", SoLuong= " + soLuong +
                '}';
    }
}
