package view;

import bean.Director;
import bean.Manager;
import bean.Staff;
import util.Ex04Utils;

public class Ex04 {
	public static void main(String[] args) {
		
		Director d = new Director();
		Ex04Utils.importDirector(d);
		
		Manager m = new Manager();
		Ex04Utils.importManager(m);
		
		Staff[] s =  new Staff[1];
		Ex04Utils.importStaff(s);
		
		System.out.println("=========");
		System.out.println("Thông tin giám đốc: ");
		System.out.println(d);
		System.out.println("=========");
		System.out.println("Thông tin trưởng phòng: ");
		System.out.println(m);
		System.out.println("=========");
		System.out.println("Thông tin nhân viên: ");
		Ex04Utils.exportStaff(s);
	}
}
