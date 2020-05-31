package bean;

import java.util.Scanner;

public class GiamDoc extends People {
	private double hesochucvu;

	public GiamDoc() {
		

	}

	public GiamDoc(String ten, int namsinh, double hesoluong, double hesochucvu) {
		super(ten, namsinh, hesoluong);
		this.hesochucvu = hesochucvu;

	}

	public double getHesochucvu() {
		return hesochucvu;
	}

	public void setHesochucvu(double hesochucvu) {
		this.hesochucvu = hesochucvu;
	}

	@Override
	public String toString() {
		System.out.format("%-25s%-20s%-20s%-20s \n","Ten giam doc ","Nam sinh","He so luong","He so chuc vu");
		return String.format("%-25s%-20d%-20f%-20f \n",this.getTen(), this.getNamsinh(),this.getHesoluong(),this.getHesochucvu());
	}
	public GiamDoc nhapgiamdoc() {
		GiamDoc g=new GiamDoc();
		Scanner sc = new Scanner(System.in);		
		System.out.print("moi nhap ten giam doc: ");
		g.setTen(sc.nextLine()) ;
		System.out.print("moi nhap nam sinh giam doc: ");
		g.setNamsinh(Integer.parseInt(sc.nextLine()));
		System.out.print("moi nhap he so luong giam doc: ");
		g.setHesoluong(Double.parseDouble(sc.nextLine()));
		System.out.print("moi nhap he so chuc vu giam doc: ");
		g.setHesochucvu(Double.parseDouble(sc.nextLine()));
		return g;
	}
	
		
		
	public void inluonggd() {
		double luong=0;
		luong=(this.getHesochucvu()+this.getHesoluong())*3000000;
		System.out.println("Luong cua giam doc: "+luong);
	}
}
