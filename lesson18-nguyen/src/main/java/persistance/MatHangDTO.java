package persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class MatHangDTO {
	public static String MA_LOAI ="maLoai";
	
	public static String TEN_LOAI = "tenLoai";
	
	public static String MA_MH = " maMH";
	
	
	public static  String TEN_MH = "tenMH";
	
	
	
	public static String GIA_MUA =  "giaMua";
	
	
	public static String GIA_BAN =  "giaBan";
	
	
	public static String SO_LUONG = "soLuong";
	
	private Integer maLoai;
	
	private String tenLoai;
	
	private Integer maMH;
	
	
	private String tenMH;
	
	
	private Integer giaMua;
	
	
	private Integer giaBan;
	
	
	private Integer soLuong;
	
	
	
	
	public MatHangDTO() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "MatHangDTO [maLoai=" + maLoai + ", tenLoai=" + tenLoai+", maMH=" + maMH + ", tenMH=" + tenMH + ", giaMua=" + giaMua + ", giaBan="
				+ giaBan + ", soLuong=" + soLuong  + "]";
	}
	

	
}
