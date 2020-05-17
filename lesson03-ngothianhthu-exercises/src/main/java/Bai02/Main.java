package Bai02;

public class Main {
	public static void main(String[] args) {
		Vehicle car1=new Vehicle("Future Neo", 100, 35000);
		Vehicle car2=new Vehicle("Ford Ranger", 3000, 250000);
		Tax.export(car2);
		Vehicle car3=new Vehicle("Landscape", 1500, 1000000);
		Tax.export(car3);
		
		Customer cus1=new Customer("Nguyễn Thu Loan");
		Customer cus2=new Customer("Lê Minh Tính");
		Customer cus3=new Customer("Nguyễn Minh Triết");
		
		System.out.println("Fullname   |   CarType   |   XyLanh   |   Prices   |   Tax");
		
		Bill bill1=new Bill(cus1.getCustomName(), car1.getCarType(), car1.getXyLanh(), car1.getPrices());
		System.out.print(bill1);
		Tax.export(car1);
		System.out.println("==========================");
		Bill bill2=new Bill(cus2.getCustomName(), car2.getCarType(), car2.getXyLanh(), car2.getPrices());
		System.out.print(bill2);
		Tax.export(car2);
		System.out.println("==========================");
		Bill bill3=new Bill(cus3.getCustomName(), car3.getCarType(), car3.getXyLanh(), car3.getPrices());
		System.out.print(bill3);
		Tax.export(car3);
		System.out.println("==========================");
	}
	
}
