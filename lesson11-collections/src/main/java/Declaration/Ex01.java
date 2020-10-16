package Declaration;

import Bean.Item;
import generic.People;


public class Ex01 {
	public static void main(String[] args) {
		People<Item> p = new People<Item>();
		p.add(new People());
		// ghi nhu nay thi no check tai compile lun , 
		// va the hien loi o compile, code trong clear hon ;
		//p.add("dggfdgfdg");
		p.printArr();
	}

}
