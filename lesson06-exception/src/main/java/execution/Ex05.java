package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		try {
			creaateNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to nomal !!!");
	}

	private static boolean creaateNewFile() throws IOException {
		File file = new File("readme.txt");
		return file.createNewFile();
	}
}
