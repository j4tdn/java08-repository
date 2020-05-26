package Bai5;

public class App {
	public static void main(String[] args) {
		
		Book textBook1 = new TextBook("SGK01", 6.69, "NhiDong",true);
		Book textBook2 = new TextBook("SGK02", 9,"hello",false);
		
		Book textBook3 = new TextBook("SGK03",10,"hi",false);
		
		Book refBook1 = new ReferenceBook("STK01", 4, "Tuoi Tre", 1.0);
		
		Book refBook2 = new ReferenceBook( "STK01",5, "Thanh nien " , 2.0);
		
		
		
		
		
	}
}
