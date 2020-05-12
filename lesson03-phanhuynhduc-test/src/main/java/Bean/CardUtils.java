package Bean;

public class CardUtils {
	public static void display(Student student, Book ...books) {
		System.out.println("Thong tin sinh vien");
		System.out.println("--------");
		System.out.println("Lop : "+student.getClasses());
		System.out.println("Ten :"+ student.getName());
		System.out.println("Tuoi : " +student.getAge());
		
		System.out.println("Thong tin sach ung voi the muon");
		if(books.length==0) {
			System.out.println("Sinh vien khong muon sach");
		}
		else {
			for(int i=0;i<books.length;i++) {
				System.out.println("Thong tin sach : ");
				System.out.println("So hieu sach: "+books[i].getSoHieuSach());
				System.out.println("Ten sach: " +books[i].getTenSach());
				System.out.println("NXB : " +books[i].getNxb());
			}
		}
	}
}
