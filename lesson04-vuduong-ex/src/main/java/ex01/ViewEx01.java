package ex01;

public class ViewEx01 {
	public static void main(String[] args) {
		Student vu = new Student(1, "Vu", 8,7);
		Student nhi = new Student(2, "Nhi", 9, 9.5f);
		Student hoang = new Student();
		hoang.setId(3);
		hoang.setName("Hoang");
		hoang.setPointLT(8.5f);
		hoang.setPointTH(9);
		
		System.out.println(vu);
		System.out.println(nhi);
		System.out.println(hoang);

	}
}
