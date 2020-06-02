package Ex04;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class View {
public static void main(String[] args) {
	CreatePeople();
	
	
	
}
public static void CreatePeople() {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Nhập thông tin của giám đốc ( tên, hệ số lương, năm sinh, hệ số chức vụ):  ");
	GiamDoc gd=new GiamDoc(sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
	gd.Galary(gd.getCoefficientsalary(), gd.getCoefficientposition());
	System.out.println(gd);
	
	
	System.out.println("Nhập thông tin của trưởng phòng ( tên, hệ số lương, năm sinh, số nhân viên quản lý):  ");
	TruongPhong tp=new TruongPhong(sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
	tp.Galary(gd.getCoefficientsalary());
	System.out.println(tp);
	
	
	System.out.println("Nhập thông tin của nhân viên 1 ( tên, hệ số lương, năm sinh, tên đơn vị):  ");
	NhanVien nv1=new NhanVien(sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
	nv1.Galary(gd.getCoefficientsalary());
	System.out.println(nv1);
	
	
	System.out.println("Nhập thông tin của nhân viên 2 ( tên, hệ số lương, năm sinh, tên đơn vị):  ");
	NhanVien nv2=new NhanVien(sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
	nv2.Galary(gd.getCoefficientsalary());
    System.out.println(nv2);

    
}
}
