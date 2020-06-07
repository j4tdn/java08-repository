package ex04;

public class DemoEx04 {
	public static void main(String[] args) {
		Director mDirector = new Director("Bau Kien", 1968, 3.2f, 1.58f);
		Manager mManager = new Manager("Chu Khanh Van", 1995, 2.8f, 7);
		Employee mEmployee = new Employee("Cong Phuong", 1993, 5.0f, "The Thao");
		
		System.out.println(mDirector.toString());
		System.out.println(mManager.toString());
		System.out.println(mEmployee.toString());
	}
}
