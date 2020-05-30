package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("Back to nomal!!");
	}

	private static boolean createNewFile() throws IOException {
		File file = new File("Readme.txt");
		return false;
	}

}
