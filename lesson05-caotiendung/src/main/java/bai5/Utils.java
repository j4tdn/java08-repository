package bai5;

public class Utils {
	public static void seachBook(Book obj[]) {
		String s = "Nhi Đồng" ;
		System.out.println(" Sach Thuộc nhà xuất bản Nhi Đồng :");
		for (Book b: obj) {
			
			if( s == b.getNhaXuatBan()) {
				
				System.out.println(b.getMaSach());
			}
			
		}
		
		
	}
	public static void seachPrice(Book obj[]) {
		System.out.println(" Sach Có giá nhỏ hơn 50k :");
		for (Book b: obj) {
			if (b.getDonGia() < 50000.0) {
				System.out.println(b.getMaSach());
			}
		}
	}
	public static void seachPrice1(Book obj[]) {
		System.out.println(" Sach Giáo Khoa có giá 100 ---> 200 :");
		for (Book b: obj) {
			if(b.getMaSach().substring(0, 3).equals("SGK") && (b.getDonGia() > 100000.0) && ( b.getDonGia() < 200000.0)) {
				System.out.println(b.getMaSach());
			}
		}
	}
	public static Double bill(TextBook tb2, ReferenceBook rb2) {
		
		double total = rb2.getDonGia() * (1 + rb2.getThue());
		
		if (tb2.getTinhTrang() == Status.OLD) {
			total = total+ tb2.getDonGia()- tb2.getDonGia()*0.3;
		} else {
			total =total + tb2.getDonGia();
		}
		
		return total;
	}
	
}
