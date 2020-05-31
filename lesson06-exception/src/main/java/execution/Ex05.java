package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		createNewFile();
		System.out.println("Back to normal");
	}
	
	public static boolean createNewFile() {
		File file = new File("readme.txt");
		try {
			return file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
