package Bai3;

public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(3, 2));
	}
	public static boolean isPowerOf(int cha, int con) {
		
		if(cha == 1 ) {
			return true ;
		}
		else {
			
			boolean check  = true ;
			while(cha > con ) {
				cha = cha/ con ;
			}
			
			if(cha != con) {
				check = false ;
			}
			return check;
			
		}
		
		
	
}

}