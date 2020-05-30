package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		try {
			createNewfile();
		} catch (Exception e) {
			e.getMessage();
		}

		System.out.println("back to normal !!!");
	}

	private static boolean createNewfile() throws IOException {
		File file = new File("Readme.txt");// tao 1 file

		return file.createNewFile();

		// return 0;
	}
}
