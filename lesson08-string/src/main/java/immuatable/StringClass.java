package immuatable;

public class StringClass {
	private int hoa ;
	private int thuong ; 
	private int so ;
	
	public StringClass() {
		
	}
	
	public StringClass(int hoa, int thuong, int so) {
		this.hoa = hoa ;
		this.thuong = thuong ; 
		this.so = so ;
	}
	
	@Override
	public String toString() {
		
		return "hoa :" + this.hoa + "\n" +"thuong : " + this.thuong + "\n" + "so :" +this.so ;
	}
	
	
}
