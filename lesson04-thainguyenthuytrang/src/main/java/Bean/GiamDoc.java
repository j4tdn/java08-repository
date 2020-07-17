package Bean;

import java.util.Scanner;

public class GiamDoc extends People {
	private int hesochucvu;

	public GiamDoc() {
	}

	public GiamDoc(String ten, int namsinh, int hesoluong, int hesochucvu) {
		super(ten, namsinh, hesoluong);
		this.hesochucvu = hesochucvu;
	}

	public int getHesochucvu() {
		return hesochucvu;
	}

	public void setHesochucvu(int hesochucvu) {
		this.hesochucvu = hesochucvu;
	}

	@Override
	public void Nhap(People gd) {
		super.Nhap(gd);
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap he so chuc vu:");
		((GiamDoc) gd).setHesochucvu(sc.nextInt());

	}

	@Override
	public String toString() {
		return super.toString() +"\the so chuc vu:" + hesochucvu;
	}
	

}
