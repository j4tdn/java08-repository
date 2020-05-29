package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean createNewFile() throws IOException {
		File file = new File("readme.txt");
		return file.createNewFile();
	}
}
