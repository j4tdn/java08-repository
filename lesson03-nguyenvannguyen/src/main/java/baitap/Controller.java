package baitap;

import java.util.Scanner;

public class Controller {
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	public double PriceTax(Vehicle item) {
		double priceTax=0;
		if(item.getCapacity()<100) {
			priceTax = 1.01*item.getPrice();
		}else {
			if(item.getCapacity()>100 && item.getCapacity()<200) {
				priceTax = 1.03*item.getPrice();
			}else {
				priceTax = 1.05*item.getPrice();
			}
		}
		
		return priceTax;
	}
	
	public Vehicle InputData() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên chủ xe: ");
		String fullName = ip.nextLine();
		System.out.println("Nhập loại xe: ");
		String brand = ip.nextLine();
		System.out.println("Nhập dung tích xe: ");
		int capacity = Integer.parseInt(ip.next());
		System.out.println("Nhập giá xe: ");
		double price = Double.parseDouble(ip.next());
		
		Vehicle item = new Vehicle(fullName, brand, capacity, price);
		return item;
	}
	
	public void OutputData(Vehicle item) {
		System.out.println(item.getFullName()+"      "+item.getBrand()+"      "+item.getCapacity()+"      "+item.getPrice()+"      "+PriceTax(item));
	}
	public void OutputView() {
		System.out.println("1: Nhập thông tin xe!");
		System.out.println("2: Xem bản kê khai thuế trước bạ của các xe!");
		System.out.println("3: thoát");
	}

}
