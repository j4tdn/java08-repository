package bai5;

public class View {
	public static void main(String[] args) {
		Book rb1 = new ReferenceBook("STK1", 20000.0, "Nhi  ", 0.1);
		Book rb2 = new ReferenceBook("STK2", 30000.0, "Nhi Đồng", 0.2);
		
		Book tb1 = new TextBook("SGK1", 30000.0, "Nhi Đồng",Status.NEW);
		Book tb2 = new TextBook("SGK2", 150000.0, "BỘ Giáo Dục", Status.OLD);
		Book tb3 = new TextBook("SGK3", 50000.0, "Nhi Đồng", Status.NEW);
		
		Book obj[] = new Book[5];
		obj[0] = rb1;
		obj[1] = rb2;
		obj[2] = tb1;
		obj[3] = tb2;
		obj[4] = tb3;
		
		Utils.seachBook(obj);
		Utils.seachPrice(obj);
		Utils.seachPrice1(obj);
		//Utils.bill(tb2, rb2);
	}
}
