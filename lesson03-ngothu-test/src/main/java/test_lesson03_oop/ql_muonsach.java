package test_lesson03_oop;

import java.time.LocalDate;
import java.time.Month;

public class ql_muonsach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sach tiengviet=new Sach("1","Tiếng Việt","Hoa Sen");
		Sach toan =new Sach("2", "Toán", "Hồng Đức");
		Sach hoa =new Sach("2", "Hóa", "Việt Nam");
		
		
		
		SinhVien svA= new SinhVien("sinh viên A","20","k17");
		SinhVien svB= new SinhVien("sinh viên B","19","k18");
		
		Sach[] sach1= {tiengviet, toan};
		Sach[] sach2= {hoa, toan};
		
		TheMuon t1= new TheMuon("001",LocalDate.of(2020, Month.AUGUST,8), LocalDate.of(2020, Month.AUGUST, 10), sach1,svA);
		TheMuon t2= new TheMuon("002",LocalDate.of(2020, Month.AUGUST,2), LocalDate.of(2020, Month.AUGUST, 9), sach2,svB);
		
		
	}

	@Override
	public String toString() {
		return "ql_muonsach [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
