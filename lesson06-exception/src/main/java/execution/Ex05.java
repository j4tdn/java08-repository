package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args)  {
		
		//Checked Exception 
		
		createNewFile();
		
		
		
		
	}
	
	private static boolean createNewFile() {
		File file = new File("readme.txt");
		try {
			file.createNewFile();
			System.out.println("da tao file ");
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false ;
		}
		
		//System.out.println("Back to normal !");
		
	}
	
	 
}
