package execution;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(createNewFile());
	}
	
	private static boolean createNewFile() {
		//CheckedException
		File file = new File("readme.txt");
		try {
			return file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
