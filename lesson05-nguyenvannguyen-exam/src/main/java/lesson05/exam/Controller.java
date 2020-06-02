package lesson05.exam;

public class Controller {
	
	public void bookOfNhiDong(Book [] arrBook) {
		for(int i=0;i<arrBook.length;i++) {
			if(arrBook[i].getAuthor().equals("Nhi Dong")) {
				System.out.println(arrBook[i]);
			}
		}
	}
	
	public void bookPriceLess50(Book[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getPrice()==50) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public void bookPrice100To200(Book[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getPrice()>=100 && arr[i].getPrice()<=200) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public int priceOfBill(Bill bill) {
		int price=0;
		for(int i=0;i<bill.getBookBought().length;i++) {
			Textbook text= new Textbook();
			ReferenceBook ref= new ReferenceBook();
			if(bill.getBookBought()[i].getId().contains("SGK")) {
				text = (Textbook)bill.getBookBought()[i];
				if(text.getStatus().equals("Cu")) {
					price += (text.getPrice()*70)/100;
				}else {
					price += text.getPrice();
				}
			}else {
				ref = (ReferenceBook) bill.getBookBought()[i];
				price += ref.getPrice()*(1+ref.getTax()/100);
			}
		}
		
		return price;
	}
	
	public void prinfBill(Bill bill) {
		System.out.println(bill.getItem());
		for(int i=0;i<bill.getBookBought().length;i++) {
			System.out.println(bill.getBookBought()[i].getId() + ", " +bill.getBookBought()[i].getAuthor()+" ,"+ bill.getBookBought()[i].getPrice());
		}
		bill.setPriceOfBill(priceOfBill(bill));
		System.out.println("Tong Tien: "+bill.getPriceOfBill());
	}

}
