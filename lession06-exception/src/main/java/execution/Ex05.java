package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// checkException
		try {
			createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("back to normal !");
	}

	private static boolean createNewFile() throws IOException {
		File file = new File("readme.txt");
		return file.createNewFile();
	}
}
