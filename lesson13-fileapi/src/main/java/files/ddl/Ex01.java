package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// txt, properties
		// JAVA07:
		boolean isFile = false;
		File file = new File("transaction\\data.txt");
		
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		
		if (!file.exists()) {
			try {
				isFile = file.createNewFile();
				// open file
				// Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("isFile: " + isFile);
		System.out.println("path: " + file.getPath()
			+ "\nabsolute path: " + file.getAbsolutePath()
			+ "\ncanonical path: " + file.getCanonicalPath()
		);
		
		// JAVA08:
		// Files.createFile(Paths.get("transaction", "result.txt"));
		Files.createDirectories(Paths.get("trader"));
	}
}
