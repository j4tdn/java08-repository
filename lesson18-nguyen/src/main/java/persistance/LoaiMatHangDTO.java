package persistance;

public class LoaiMatHangDTO {
	public static String MA_LOAI ="maLoai";
	public static String TEN_LOAI = "tenLoai";
	public static String SO_LUONG = "soLuong";
	
	private Integer maLoai;
	
	private String tenLoai;
	
	private Integer soLuong;

	@Override
	public String toString() {
		return "LoaiMatHangDTO [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", soLuong=" + soLuong + "]";
	}
	
	

}
