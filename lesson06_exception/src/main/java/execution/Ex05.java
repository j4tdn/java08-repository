package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//CheckedException
		
		try {
			createdFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to normal");
	}
	private static boolean createdFile() throws IOException{
		File file = new File("readme.txt");
	
		return	file.createNewFile();
		
		
		
	}
}
