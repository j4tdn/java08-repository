package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		try {
			creatNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Back to normal!!!");
	}

	private static boolean creatNewFile() throws IOException {
		File file = new File("readme.txt");
		file.createNewFile();
		/*
		 * try { return file.createNewFile(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		return false;
	}
}
