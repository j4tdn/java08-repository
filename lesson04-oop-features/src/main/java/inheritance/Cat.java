package inheritance;

public class Cat extends Animal {
   /* private void a() {
    	//this.move();
    	//super.move();
    	// this va super giong nhau
    	
    	//this.a();// goi den pt hien tai cua lop cha va lop con
    	//super.a();// chi goi den pt cua lop cha cho ke thua
    	
    	
    	
    }*/
    //k phai private , k phai static thi dung dc
	
	public Cat() {
		
	}
	
	public Cat(String color, boolean gender) {
		super(color, gender);// super vua goi ham vua goi ham khoi tao dc
	}
	
    public void catchMouse() {
    	System.out.println(getClass().getName()+ "  catching mouse =>...");
    }
}
