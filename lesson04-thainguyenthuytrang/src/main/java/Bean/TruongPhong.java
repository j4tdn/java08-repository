package Bean;

import java.util.Scanner;

public class TruongPhong extends People {
	private int nhanvienQL;

	public TruongPhong() {
	}

	public TruongPhong(String ten, int namsinh, int hesoluong, int nhanvienQL) {
		super(ten, namsinh, hesoluong);
		this.nhanvienQL = nhanvienQL;
	}

	public int getNhanvienQL() {
		return nhanvienQL;
	}

	public void setNhanvienQL(int nhanvienQL) {
		this.nhanvienQL = nhanvienQL;
	}

	@Override
	public void Nhap(People people) {
		super.Nhap(people);
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nhan vien QL:");
		((TruongPhong) people).setNhanvienQL(sc.nextInt());
	}

	@Override
	public String toString() {
		return super.toString() + "\tso nhan vienQL:" + nhanvienQL;
	}

}
