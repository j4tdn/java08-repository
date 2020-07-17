package Utils;

import Bean.GiamDoc;
import Bean.NhanVien;
import Bean.People;
import Bean.TruongPhong;

public class PeopleUtils {
	static People gd = new GiamDoc();
	static People tp = new TruongPhong();
	static People[] nv = new NhanVien[2];

	public static void Nhap() {
          System.out.println("nhap thong tin giam doc");
		gd.Nhap(gd);
		System.out.println("nhap thong tin truong phong");
		tp.Nhap(tp);
		System.out.println("nhap thong tin nhan vien");
		for (int i = 0; i < nv.length; i++) {
			System.out.println("nhap thong tin nhan vien thu " +i);
			nv[i] = new NhanVien();
			nv[i].Nhap(nv[i]);

		}

	}

	public static void xuat() {
		System.out.println("                  nhan su");
		System.out.println("===================================================");

		System.out.println("giam doc:");
		System.out.println(gd);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("truong phong:");
		System.out.println(tp);

		System.out.println("--------------------------------------------------------------------");
		for (People people : nv) {
			System.out.println("nhan vien");
			System.out.println(people);
		}

	}

}
