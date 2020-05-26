package Bai5;

public class BookUtil {
	
	// get array of books 

	public static Book[] getDataBook(Book ...books) {
		return books;
	}
	// find Publish House Nhi Dong 
	public void findNhiDong(Book ...books) {
			System.out.println("Sach thuoc nha xuat ban Nhi Dong la : ");
		for(Book book :books) {
			if(book.getPubHouse().equals("Nhi Dong")) {
				System.out.println(book.toString());
			}
		}
	}
	
	// find price < 50;
	
	public void findPrice(Book ...books) {
		System.out.println("Sach co don gia nho hon 50 la : ");
		
		for(Book book : books) {
			if(book.getPrice() < 50) {
				System.out.println(book.toString());
			}
		}
	}
	
	// find textBook price [100, 200 ] ;
	
	
	public void findTextBook(Book ...books) {
		System.out.println("Sach giao khoa co don gia tu 100 den 200 la : ");
		
		
		
		
		for(int i=0;i<3; i++) {
			if(books[i].getPrice() > 100 && books[i].getPrice() < 200) {
				System.out.println(books[i].toString());
			}
		}
	}
}
