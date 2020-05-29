package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {

		try {
			createFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("back to normal !!!");
	}
	private static boolean createFile() throws IOException {
		File file = new File("readme.txt");
		
		file.createNewFile();
		return false;
	}

}
