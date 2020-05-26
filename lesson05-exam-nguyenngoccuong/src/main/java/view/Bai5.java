package view;

import bean.Book;
import utils.BookQuery;
import utils.CreateDatabase;

public class Bai5 {
	public static void main(String[] args) {
		Book[] listBook = CreateDatabase.createBook();
		System.out.println("-----Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng-----");
		BookQuery.getBookByPublisher(listBook, "Nhi Dong");
		System.out.println("-----Tìm toàn bộ sách có đơn giá nhỏ hơn 50-----");
		BookQuery.getBookByMaxPrice(listBook, 50);
		System.out.println("-----Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200-----");
		BookQuery.getTextBookByPriceRange(listBook, 100, 200);
		System.out.println("-----Tính tổng tiền mà khách hàng phải thanh toán.-----");
		System.out.println(BookQuery.getTotal(listBook));
	}
	
}
