package execution;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		// Checked Exception
		
		try {
			createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Back to normal !");
	}

	private static boolean createNewFile() throws IOException {
		File file = new File("readme.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
