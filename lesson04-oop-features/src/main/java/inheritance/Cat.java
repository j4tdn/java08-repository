package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		
	}
	
	public Cat(String color, boolean gender) {
//		super.setColor(color);
//		super.setGender(gender);
		super(color, gender);
	}
	
	public void catchMouse() {
		System.out.println(getClass().getName() + " catch mouse");
	}
}

//private void a() {
//	super.move(); //ko phai private, static la duoc, goi phuong thuc lop cha cho ke thua
//	// this goi den phuong thuc lop cha, lop hien tai
//}

//muon khoi tao lop con thi phai khoi tao constructor rong lop cha truoc