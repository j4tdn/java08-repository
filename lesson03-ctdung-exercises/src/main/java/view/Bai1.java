package view;

import java.io.IOException;

import bean.HinhTron;
import bean.Point;
import utils.HinhTronUtils;

public class Bai1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Hình Tròn");
		HinhTron ht = new HinhTron();
		ht = HinhTronUtils.nhapht();
		
		System.out.println("Điểm A ");
		Point da = new Point();
		da = HinhTronUtils.nhapdiem();
		
		//double kc = Math.sqrt(Math.pow(da.getX() - ht.getO().getX(), 2) + Math.pow(da.getY() - ht.getO().getY(), 2));
		//System.out.println("Khoảng Cách giữa Tâm O và Điểm A là: "+ kc);
		
		HinhTronUtils.check(HinhTronUtils.tinhKC(da, ht.getO()),ht.getR());
		 
		
	}

	
}
